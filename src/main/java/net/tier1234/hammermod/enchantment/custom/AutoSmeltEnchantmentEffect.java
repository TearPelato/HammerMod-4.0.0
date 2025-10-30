package net.tier1234.hammermod.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class AutoSmeltEnchantmentEffect implements EnchantmentEntityEffect {

    public static final MapCodec<AutoSmeltEnchantmentEffect> CODEC =
            MapCodec.unit(AutoSmeltEnchantmentEffect::new);

    @Override
    public void apply(ServerLevel serverLevel,
                      int enchantmentLevel,
                      EnchantedItemInUse enchantedItemInUse,
                      Entity entity,
                      net.minecraft.world.phys.Vec3 vec3) {

        if (enchantmentLevel <= 0 || serverLevel.isClientSide) return;
        if (!(entity instanceof LivingEntity user)) return;

        BlockPos pos = BlockPos.containing(vec3);
        BlockState state = serverLevel.getBlockState(pos);

        if (state.isAir()) return;
        if (!state.requiresCorrectToolForDrops()) return;

        ItemStack drop = null;

        if (state.is(Blocks.IRON_ORE)) {
            drop = new ItemStack(Items.IRON_INGOT);
        } else if (state.is(Blocks.GOLD_ORE)) {
            drop = new ItemStack(Items.GOLD_INGOT);
        } else if (state.is(Blocks.COPPER_ORE)) {
            drop = new ItemStack(Items.COPPER_INGOT);
        } else if (state.is(Blocks.NETHER_GOLD_ORE)) {
            drop = new ItemStack(Items.GOLD_NUGGET, 2);
        }

        if (drop != null) {
            serverLevel.removeBlock(pos, false);
            Block.popResource(serverLevel, pos, drop);
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }
}