package com.practical_plushies_animals.plushies.variants;

import com.practical_plushies_animals.plushies.Plushie;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BigFloorPlushie extends Plushie {
    public BigFloorPlushie(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        boolean northOrSouth = state.get(FACING) == Direction.SOUTH || state.get(FACING) == Direction.NORTH;
        VoxelShape shape = VoxelShapes.empty();

        if (northOrSouth) {
            shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0, 0.0625, 0.9375, 0.5, 0.9375));
        } else {
            shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.0625, 0, 0.0625, 0.9375, 0.5, 0.9375));
        }
        return shape;
    }
}
