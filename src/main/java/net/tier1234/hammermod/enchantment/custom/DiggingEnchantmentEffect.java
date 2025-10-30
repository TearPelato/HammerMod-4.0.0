package net.tier1234.hammermod.enchantment.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class DiggingEnchantmentEffect implements EnchantmentEntityEffect {

    public static final MapCodec<DiggingEnchantmentEffect> CODEC =
            Codec.unit(DiggingEnchantmentEffect::new).fieldOf("digging");

    @Override
    public void apply(ServerLevel serverLevel,
                      int enchantmentLevel,
                      EnchantedItemInUse enchantedItemInUse,
                      Entity entity,
                      Vec3 vec3) {

        if (enchantmentLevel <= 0) return;
        if (serverLevel.isClientSide) return;

        if (!(entity instanceof LivingEntity user)) return;
        BlockPos pos = BlockPos.containing(vec3);

        BlockState center = serverLevel.getBlockState(pos);
        if (!center.requiresCorrectToolForDrops()) return;

        for (int dx = -1; dx <= 1; dx++) {
            for (int dz = -1; dz <= 1; dz++) {
                if (dx == 0 && dz == 0) continue;

                BlockPos offsetPos = pos.offset(dx, 0, dz);
                BlockState state = serverLevel.getBlockState(offsetPos);

                if (state.isAir()) continue;
                float destroySpeed = state.getDestroySpeed(serverLevel, offsetPos);
                if (destroySpeed < 0) continue;

                if (!state.requiresCorrectToolForDrops()) continue;

                serverLevel.destroyBlock(offsetPos, true, user);
            }
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }
}