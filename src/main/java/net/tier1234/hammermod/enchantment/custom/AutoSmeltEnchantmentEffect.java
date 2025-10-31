package net.tier1234.hammermod.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.item.enchantment.EnchantedItemInUse;
import net.minecraft.world.item.enchantment.effects.EnchantmentEntityEffect;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import java.util.Optional;

public class AutoSmeltEnchantmentEffect implements EnchantmentEntityEffect {

    public static final MapCodec<AutoSmeltEnchantmentEffect> CODEC =
            MapCodec.unit(AutoSmeltEnchantmentEffect::new);

    @Override
    public void apply(ServerLevel serverLevel,
                      int enchantmentLevel,
                      EnchantedItemInUse enchantedItemInUse,
                      Entity entity,
                      Vec3 vec3) {

        if (enchantmentLevel <= 0 || serverLevel.isClientSide) return;
        if (!(entity instanceof LivingEntity user)) return;

        BlockPos pos = BlockPos.containing(vec3);
        BlockState state = serverLevel.getBlockState(pos);
        if (state.isAir()) return;
        if (!state.requiresCorrectToolForDrops()) return;

        var drops = Block.getDrops(state, serverLevel, pos, null, user, user.getMainHandItem());
        if (drops.isEmpty()) return;

        for (ItemStack drop : drops) {
            Optional<SmeltingRecipe> recipe = serverLevel.getRecipeManager()
                    .getRecipeFor(RecipeType.SMELTING, new SimpleContainer(drop), serverLevel);

            if (recipe.isPresent()) {
                ItemStack result = recipe.get().getResultItem(serverLevel.registryAccess()).copy();
                if (!result.isEmpty()) {
                    Block.popResource(serverLevel, pos, result);
                    continue;
                }
            }

            Block.popResource(serverLevel, pos, drop);
        }

        serverLevel.removeBlock(pos, false);
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> codec() {
        return CODEC;
    }
}