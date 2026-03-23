package net.tier1234.hammermod.item;


import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.tier1234.hammermod.util.ModTags;


public class ModToolTiers {
    public static final Tier COPPER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
                190, 3f, 3f, 25, ()-> Ingredient.of(ModTags.Items.COPPER_REPAIRABLE));

    public static final Tier AMETHYST = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL,
            150, 2f, 2f, 25, ()-> Ingredient.of(ModTags.Items.AMETHYST_REPAIRABLE));
}




