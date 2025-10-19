package net.tier1234.hammermod.item;



import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tier1234.hammermod.HammerAdditions;
import net.tier1234.hammermod.item.custom.HammerItem;
import net.tier1234.hammermod.item.custom.HammerItem2x2;
import net.tier1234.hammermod.item.custom.HammerItem5x5;


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

    public static final DeferredItem<HammerItem> STONE_HAMMER = ITEMS.registerItem("stone_hammer",
            (properties) -> new HammerItem(ToolMaterial.STONE,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem> COPPER_HAMMER = ITEMS.registerItem("copper_hammer",
            (properties) -> new HammerItem( ModToolTiers.COPPER,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem> IRON_HAMMER = ITEMS.registerItem("iron_hammer",
            (properties) -> new HammerItem( ToolMaterial.IRON,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem> GOLD_HAMMER = ITEMS.registerItem("gold_hammer",
            (properties) -> new HammerItem( ToolMaterial.GOLD,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem> DIAMOND_HAMMER = ITEMS.registerItem("diamond_hammer",
            (properties) -> new HammerItem( ToolMaterial.DIAMOND,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem> NETHERITE_HAMMER = ITEMS.registerItem("netherite_hammer",
            (properties) -> new HammerItem( ToolMaterial.NETHERITE,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem> AMETHYST_HAMMER = ITEMS.registerItem("amethyst_hammer",
            (properties) -> new HammerItem( ModToolTiers.AMETHYST,7F, -3.5f, properties));








//TinyHammers
public static final DeferredItem<HammerItem2x2> TINY_STONE_HAMMER = ITEMS.registerItem("tiny_stone_hammer",
        (properties) -> new HammerItem2x2( ToolMaterial.STONE,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem2x2> TINY_COPPER_HAMMER = ITEMS.registerItem("tiny_copper_hammer",
            (properties) -> new HammerItem2x2( ModToolTiers.COPPER,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem2x2> TINY_IRON_HAMMER = ITEMS.registerItem("tiny_iron_hammer",
            (properties) -> new HammerItem2x2( ToolMaterial.IRON,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem2x2> TINY_GOLD_HAMMER = ITEMS.registerItem("tiny_gold_hammer",
            (properties) -> new HammerItem2x2( ToolMaterial.GOLD,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem2x2> TINY_DIAMOND_HAMMER = ITEMS.registerItem("tiny_diamond_hammer",
            (properties) -> new HammerItem2x2( ToolMaterial.DIAMOND,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem2x2> TINY_NETHERITE_HAMMER = ITEMS.registerItem("tiny_netherite_hammer",
            (properties) -> new HammerItem2x2( ToolMaterial.NETHERITE,7F, -3.5f, properties));;
    public static final DeferredItem<HammerItem2x2> TINY_AMETHYST_HAMMER = ITEMS.registerItem("tiny_amethyst_hammer",
            (properties) -> new HammerItem2x2( ModToolTiers.AMETHYST,7F, -3.5f, properties));



//GiantHamemrs
public static final DeferredItem<HammerItem5x5> GIANT_STONE_HAMMER = ITEMS.registerItem("giant_stone_hammer",
        (properties) -> new HammerItem5x5( ToolMaterial.STONE,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem5x5> GIANT_COPPER_HAMMER = ITEMS.registerItem("giant_copper_hammer",
            (properties) -> new HammerItem5x5(ModToolTiers.COPPER,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem5x5> GIANT_IRON_HAMMER = ITEMS.registerItem("giant_iron_hammer",
            (properties) -> new HammerItem5x5( ToolMaterial.IRON,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem5x5> GIANT_GOLD_HAMMER = ITEMS.registerItem("giant_gold_hammer",
            (properties) -> new HammerItem5x5( ToolMaterial.GOLD,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem5x5> GIANT_DIAMOND_HAMMER = ITEMS.registerItem("giant_diamond_hammer",
            (properties) -> new HammerItem5x5( ToolMaterial.DIAMOND,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem5x5> GIANT_NETHERITE_HAMMER = ITEMS.registerItem("giant_netherite_hammer",
            (properties) -> new HammerItem5x5( ToolMaterial.NETHERITE,7F, -3.5f, properties));
    public static final DeferredItem<HammerItem5x5> GIANT_AMETHYST_HAMMER = ITEMS.registerItem("giant_amethyst_hammer",
            (properties) -> new HammerItem5x5( ModToolTiers.AMETHYST,7F, -3.5f, properties));


    //Templates
    public static final DeferredItem<Item> HAMMER_SMITHING_TEMPLATE = ITEMS.registerItem("hammer_smithing_template",
            SmithingTemplateItem::createNetheriteUpgradeTemplate);



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
