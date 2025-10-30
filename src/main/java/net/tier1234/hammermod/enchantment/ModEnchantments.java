package net.tier1234.hammermod.enchantment;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentEffectComponents;
import net.minecraft.world.item.enchantment.EnchantmentTarget;
import net.tier1234.hammermod.HammerAdditions;
import net.tier1234.hammermod.enchantment.custom.DiggingEnchantmentEffect;

public class ModEnchantments {


    public static final ResourceKey<Enchantment> DIGGING = ResourceKey.create(Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(HammerAdditions.MOD_ID, "digging"));

    public static void bootstrap(BootstrapContext<Enchantment> context) {
        var enchantments = context.lookup(Registries.ENCHANTMENT);
        var items = context.lookup(Registries.ITEM);


        register(context, DIGGING, Enchantment.enchantment(Enchantment.definition(
                        items.getOrThrow(ItemTags.MINING_ENCHANTABLE),
                        items.getOrThrow(ItemTags.PICKAXES),
                        2,
                        1,
                        Enchantment.dynamicCost(10, 8),
                        Enchantment.dynamicCost(40, 8),
                        3,
                        EquipmentSlotGroup.MAINHAND))
                .withEffect(EnchantmentEffectComponents.POST_ATTACK, EnchantmentTarget.ATTACKER,
                        EnchantmentTarget.VICTIM, new DiggingEnchantmentEffect()));
    }

    private static void register(BootstrapContext<Enchantment> registry, ResourceKey<Enchantment> key,
                                 Enchantment.Builder builder) {
        registry.register(key, builder.build(key.location()));
    }
}
