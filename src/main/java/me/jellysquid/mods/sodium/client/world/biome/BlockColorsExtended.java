package me.jellysquid.mods.sodium.client.world.biome;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.color.IBlockColor;

public interface BlockColorsExtended {
    IBlockColor getColorProvider(IBlockState state);
}
