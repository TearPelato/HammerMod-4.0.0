package net.tier1234.hammermod.item;



import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.hammermod.HammerAdditions;
import net.tier1234.hammermod.item.custom.HammerItem;
import net.tier1234.hammermod.item.custom.HammerItem2x2;
import net.tier1234.hammermod.item.custom.HammerItem5x5;
import net.tier1234.hammermod.item.custom.HammerTemplateItem;


public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HammerAdditions.MOD_ID);

//Items
    public static final DeferredItem<Item> STONE_HEAD = ITEMS.registerItem("stone_head",
        Item:: new,new Item.Properties());
    public static final DeferredItem<Item> IRON_HEAD = ITEMS.registerItem("iron_head",
            Item:: new,new Item.Properties());
    public static final DeferredItem<Item> GOLD_HEAD = ITEMS.registerItem("gold_head",
            Item:: new, new Item.Properties());
    public static final DeferredItem<Item> DIAMOND_HEAD = ITEMS.registerItem("diamond_head",
            Item:: new, new Item.Properties());
    public static final DeferredItem<Item> NETHERITE_HEAD = ITEMS.registerItem("netherite_head",
            Item:: new,new Item.Properties());
    public static final DeferredItem<Item> TINY_STICK = ITEMS.registerItem("tiny_stick",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> COPPER_HEAD = ITEMS.registerItem("copper_head",
            Item::new, new Item.Properties());
    public static final DeferredItem<Item> AMETHYST_HEAD = ITEMS.registerItem("amethyst_head",
            Item::new, new Item.Properties());



//Hammers Basics

    public static final DeferredItem<HammerItem> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new HammerItem(Tiers.STONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.STONE, 7F, -3.5f))));


    public static final DeferredItem<HammerItem> COPPER_HAMMER = ITEMS.register("copper_hammer",
            () -> new HammerItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.COPPER, 7F, -3.5F))));

    public static final DeferredItem<HammerItem> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new HammerItem(Tiers.IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, 7F, -3.5f))));

    public static final DeferredItem<HammerItem> GOLD_HAMMER = ITEMS.register("gold_hammer",
            () -> new HammerItem(Tiers.GOLD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.GOLD, 7F, -3.5f))));

    public static final DeferredItem<HammerItem> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new HammerItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 7F, -3.5f))));

    public static final DeferredItem<HammerItem> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new HammerItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 7F, -3.5f))));

    public static final DeferredItem<HammerItem> AMETHYST_HAMMER = ITEMS.register("amethyst_hammer",
            () -> new HammerItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, 7F,-3.5F))));








//TinyHammers
public static final DeferredItem<HammerItem2x2> TINY_STONE_HAMMER = ITEMS.register("tiny_stone_hammer",
        () -> new HammerItem2x2(Tiers.STONE, new Item.Properties()
                .attributes(PickaxeItem.createAttributes(Tiers.STONE, 7F, -3.5F))));

    public static final DeferredItem<HammerItem2x2> TINY_COPPER_HAMMER = ITEMS.register("tiny_copper_hammer",
            () -> new HammerItem2x2(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.COPPER, 7F, -3.5F))));

    public static final DeferredItem<HammerItem2x2> TINY_IRON_HAMMER = ITEMS.register("tiny_iron_hammer",
            () -> new HammerItem2x2(Tiers.IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, 7F,-3.5F))));

    public static final DeferredItem<HammerItem2x2> TINY_GOLD_HAMMER = ITEMS.register("tiny_gold_hammer",
            () -> new HammerItem2x2(Tiers.GOLD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.GOLD, 7F,-3.5F))));

    public static final DeferredItem<HammerItem2x2> TINY_DIAMOND_HAMMER = ITEMS.register("tiny_diamond_hammer",
            () -> new HammerItem2x2(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 7F,-3.5F))));

    public static final DeferredItem<HammerItem2x2> TINY_NETHERITE_HAMMER = ITEMS.register("tiny_netherite_hammer",
            () -> new HammerItem2x2(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 7F,-3.5F))));

    public static final DeferredItem<HammerItem2x2> TINY_AMETHYST_HAMMER = ITEMS.register("tiny_amethyst_hammer",
            () -> new HammerItem2x2(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, 7F,-3.5F))));



//GiantHamemrs
public static final DeferredItem<HammerItem5x5> GIANT_STONE_HAMMER = ITEMS.register("giant_stone_hammer",
        () -> new HammerItem5x5(Tiers.STONE, new Item.Properties()
                .attributes(PickaxeItem.createAttributes(Tiers.STONE, 7F,-3.5F))));

    public static final DeferredItem<HammerItem5x5> GIANT_COPPER_HAMMER = ITEMS.register("giant_copper_hammer",
            () -> new HammerItem5x5(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.COPPER, 7F,-3.5F))));

    public static final DeferredItem<HammerItem5x5> GIANT_IRON_HAMMER = ITEMS.register("giant_iron_hammer",
            () -> new HammerItem5x5(Tiers.IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, 7F,-3.5F))));

    public static final DeferredItem<HammerItem5x5> GIANT_GOLD_HAMMER = ITEMS.register("giant_gold_hammer",
            () -> new HammerItem5x5(Tiers.GOLD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.GOLD, 7F,-3.5F))));

    public static final DeferredItem<HammerItem5x5> GIANT_DIAMOND_HAMMER = ITEMS.register("giant_diamond_hammer",
            () -> new HammerItem5x5(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 7F,-3.5F))));

    public static final DeferredItem<HammerItem5x5> GIANT_NETHERITE_HAMMER = ITEMS.register("giant_netherite_hammer",
            () -> new HammerItem5x5(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 7F,-3.5F))));

    public static final DeferredItem<HammerItem5x5> GIANT_AMETHYST_HAMMER = ITEMS.register("giant_amethyst_hammer",
            () -> new HammerItem5x5(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, 7F,-3.5F))));


    //Template
    public static final DeferredItem<Item> HAMMER_SMITHING_TEMPLATE = ITEMS.register("hammer_smithing_template",
            () -> HammerTemplateItem.createhammerUpgradeTemplate());



//Items
    public static final DeferredItem<Item> GIANT_DIAMOND_HEAD = ITEMS.registerItem("giant_diamond_head",
            Item:: new, new Item.Properties());
    public static final DeferredItem<Item> GIANT_STONE_HEAD = ITEMS.registerItem("giant_stone_head",
            Item:: new, new Item.Properties());
    public static final DeferredItem<Item> GIANT_IRON_HEAD = ITEMS.registerItem("giant_iron_head",
            Item:: new, new Item.Properties());
    public static final DeferredItem<Item> GIANT_GOLD_HEAD = ITEMS.registerItem("giant_gold_head",
            Item:: new,new Item.Properties());
    public static final DeferredItem<Item> GIANT_NETHERITE_HEAD = ITEMS.registerItem("giant_netherite_head",
            Item:: new, new Item.Properties());
    public static final DeferredItem<Item> GIANT_COPPER_HEAD = ITEMS.registerItem("giant_copper_head",
            Item:: new, new Item.Properties());
    public static final DeferredItem<Item> GIANT_AMETHYST_HEAD = ITEMS.registerItem("giant_amethyst_head",
            Item:: new, new Item.Properties());




    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);
    }
}
