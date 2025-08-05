package net.tier1234.hammermod.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.neoforge.common.Tags;
import net.tier1234.hammermod.util.ModTags;

import javax.tools.Tool;

public class ModToolTiers {
    public static final ToolMaterial COPPER = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
                190, 3f, 3f, 25,ModTags.Items.COPPER_REPAIRABLE);

    public static final ToolMaterial AMETHYST = new ToolMaterial(ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL,
            150, 2f, 2f, 25, ModTags.Items.AMETHYST_REPAIRABLE );
}




