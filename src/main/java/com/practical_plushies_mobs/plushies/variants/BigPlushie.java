package com.practical_plushies_mobs.plushies.variants;


import com.practical_plushies_mobs.plushies.Plushie;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BigPlushie extends Plushie {
    public BigPlushie(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH).with(WATERLOGGED, false));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        boolean northOrSouth = state.get(FACING) == Direction.SOUTH || state.get(FACING) == Direction.NORTH;
        VoxelShape shape = VoxelShapes.empty();

        if (northOrSouth) {
            shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0, 0.0625, 0.8125, 0.75, 0.75));
        } else {
            shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0, 0.1875, 0.75, 0.75, 0.8125));
        }
        return shape;
    }
}
