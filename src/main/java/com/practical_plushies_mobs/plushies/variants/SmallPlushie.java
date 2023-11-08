package com.practical_plushies_mobs.plushies.variants;

import com.practical_plushies_mobs.plushies.Plushie;
import net.minecraft.block.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class SmallPlushie extends Plushie {
    public SmallPlushie(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        boolean northOrSouth = state.get(FACING) == Direction.SOUTH || state.get(FACING) == Direction.NORTH;
        VoxelShape shape = VoxelShapes.empty();

        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.21875, 0, 0.25, 0.765625, 0.5, 0.75));
        return shape;
    }
}
