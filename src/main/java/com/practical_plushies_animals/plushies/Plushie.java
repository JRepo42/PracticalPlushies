package com.practical_plushies_animals.plushies;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class Plushie extends HorizontalFacingBlock implements Waterloggable {
    private String plushieSize = "";

    public Plushie(Settings settings, String size) {
        super(settings);
        this.plushieSize = size;
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        boolean northOrSouth = state.get(FACING) == Direction.SOUTH || state.get(FACING) == Direction.NORTH;
        VoxelShape shape = VoxelShapes.empty();
        //shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.21875, 0, 0.25, 0.765625, 0.8125, 0.75));

        switch (plushieSize) {
            case "small":
                shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.21875, 0, 0.25, 0.765625, 0.5, 0.75));
                break;
            case "big":
                if (northOrSouth) {
                    shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0, 0.0625, 0.8125, 0.75, 0.75));
                } else {
                    shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0, 0.1875, 0.75, 0.75, 0.8125));
                }
                break;
            case "floor":
                shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0, 0.0625, 0.9375, 0.4375, 0.9375));
                break;
            default:
                shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.21875, 0, 0.25, 0.765625, 0.8125, 0.75));
                break;
        }

        return shape;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING, WATERLOGGED);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite()).with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).isOf(Fluids.WATER));
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }
}
