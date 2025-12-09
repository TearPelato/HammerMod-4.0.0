package net.tier1234.hammermod;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.Set;

public class Config
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.IntValue VEIN_MINER_MAX_BLOCK_GROUP =
            BUILDER.comment("Defines the maximum block VeinMiner enchant can break.")
                    .defineInRange("veinminer_group", 10, 1, 250
                    );

    static final ModConfigSpec SPEC = BUILDER.build();


    public static Set<Item> items;

    private static boolean validateItemName(final Object obj) {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(Identifier.parse(itemName));
    }

    public static int getveinminergroup() {
        return VEIN_MINER_MAX_BLOCK_GROUP.get();
    }


    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {

        HammerAdditions.LOGGER.info("Hammer Additions Config Loaded: getveinminergroup={}",
                getveinminergroup());
    }
}