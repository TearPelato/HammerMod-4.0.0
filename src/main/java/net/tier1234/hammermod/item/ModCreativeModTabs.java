package net.tier1234.hammermod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.hammermod.HammerAdditions;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HammerAdditions.MOD_ID);

    public static final Supplier<CreativeModeTab> HAMMER_MOD_ITEMS = CREATIVE_MODE_TAB.register("hammer_mod_items",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STONE_HEAD.get()))
                    .title(Component.translatable("creativetab.hammer_mod.hammer_mod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STONE_HEAD);
                        output.accept(ModItems.IRON_HEAD);
                        output.accept(ModItems.COPPER_HEAD);
                        output.accept(ModItems.AMETHYST_HEAD);
                        output.accept(ModItems.GOLD_HEAD);
                        output.accept(ModItems.DIAMOND_HEAD);
                        output.accept(ModItems.NETHERITE_HEAD);
                        output.accept(ModItems.GIANT_STONE_HEAD);
                        output.accept(ModItems.GIANT_IRON_HEAD);
                        output.accept(ModItems.GIANT_COPPER_HEAD);
                        output.accept(ModItems.GIANT_AMETHYST_HEAD);
                        output.accept(ModItems.GIANT_GOLD_HEAD);
                        output.accept(ModItems.GIANT_DIAMOND_HEAD);
                        output.accept(ModItems.GIANT_NETHERITE_HEAD);
                        output.accept(ModItems.TINY_STICK);
                        output.accept(ModItems.COPPER_HEAD);

                    }).build());
    public static final Supplier<CreativeModeTab> HAMMER_MOD_TOOLS = CREATIVE_MODE_TAB.register("hammer_mod_tools",
            ()-> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HAMMER_SMITHING_TEMPLATE.get()))
                    .title(Component.translatable("creativetab.hammer_mod.hammer_mod_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STONE_HAMMER);
                        output.accept(ModItems.IRON_HAMMER);
                        output.accept(ModItems.COPPER_HAMMER);
                        output.accept(ModItems.AMETHYST_HAMMER);
                        output.accept(ModItems.GOLD_HAMMER);
                        output.accept(ModItems.DIAMOND_HAMMER);
                        output.accept(ModItems.NETHERITE_HAMMER);
                        output.accept(ModItems.TINY_STONE_HAMMER);
                        output.accept(ModItems.TINY_IRON_HAMMER);
                        output.accept(ModItems.TINY_COPPER_HAMMER);
                        output.accept(ModItems.TINY_AMETHYST_HAMMER);
                        output.accept(ModItems.TINY_GOLD_HAMMER);
                        output.accept(ModItems.TINY_DIAMOND_HAMMER);
                        output.accept(ModItems.TINY_NETHERITE_HAMMER);
                        output.accept(ModItems.GIANT_STONE_HAMMER);
                        output.accept(ModItems.GIANT_IRON_HAMMER);
                        output.accept(ModItems.GIANT_COPPER_HAMMER);
                        output.accept(ModItems.GIANT_AMETHYST_HAMMER);
                        output.accept(ModItems.GIANT_GOLD_HAMMER);
                        output.accept(ModItems.GIANT_DIAMOND_HAMMER);
                        output.accept(ModItems.GIANT_NETHERITE_HAMMER);
                        output.accept(ModItems.HAMMER_SMITHING_TEMPLATE);


                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
