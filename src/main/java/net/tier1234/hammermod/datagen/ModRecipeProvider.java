package net.tier1234.hammermod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.tier1234.hammermod.HammerAdditions;
import net.tier1234.hammermod.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.tier1234.hammermod.item.ModItems.NETHERITE_HEAD;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }
    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
            super(packOutput, provider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "My Recipes";
        }
    }
    @Override
    protected void buildRecipes(){
        List<ItemLike> HAMMER_RECIPE_ITEMS = List.of(Items.STICK, Items.DIAMOND,Items.GOLD_INGOT,Items.IRON_INGOT,Items.NETHERITE_INGOT,Items.COBBLESTONE,
                Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE);


//Hammers
        shaped(RecipeCategory.MISC, ModItems.STONE_HAMMER.get())
                .pattern("###")
                .pattern("#C#")
                .pattern(" C ")
                .define('C', Items.STICK.asItem())
                .define('#', Items.COBBLESTONE.asItem())
                .unlockedBy("has_iron", has(Items.COBBLESTONE))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.COPPER_HAMMER.get())
                .pattern("###")
                .pattern("#C#")
                .pattern(" C ")
                .define('C', Items.STICK.asItem())
                .define('#', Items.COPPER_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.COPPER_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.GOLD_HAMMER.get())
                .pattern("###")
                .pattern("#C#")
                .pattern(" C ")
                .define('C', Items.STICK.asItem())
                .define('#', Items.GOLD_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.GOLD_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.DIAMOND_HAMMER.get())
                .pattern("###")
                .pattern("#C#")
                .pattern(" C ")
                .define('C', Items.STICK.asItem())
                .define('#', Items.DIAMOND.asItem())
                .unlockedBy("has_iron", has(Items.DIAMOND))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.AMETHYST_HAMMER.get())
                .pattern("###")
                .pattern("#C#")
                .pattern(" C ")
                .define('C', Items.STICK.asItem())
                .define('#', Items.AMETHYST_SHARD.asItem())
                .unlockedBy("has_iron", has(Items.AMETHYST_SHARD))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.IRON_HAMMER.get())
                .pattern("###")
                .pattern("#C#")
                .pattern(" C ")
                .define('C', Items.STICK.asItem())
                .define('#', Items.IRON_INGOT.asItem())
                .unlockedBy("has_iron", has(Items.IRON_INGOT))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);


        //Netherite Hammers
        netheriteSmithing(ModItems.DIAMOND_HAMMER.get(), RecipeCategory.TOOLS, ModItems.NETHERITE_HAMMER.get());
        netheriteSmithing(ModItems.TINY_DIAMOND_HAMMER.get(), RecipeCategory.TOOLS, ModItems.TINY_NETHERITE_HAMMER.get());
        netheriteSmithing(ModItems.GIANT_DIAMOND_HAMMER.get(), RecipeCategory.TOOLS, ModItems.GIANT_NETHERITE_HAMMER.get());

        netheriteSmithing(ModItems.GIANT_DIAMOND_HEAD.get(), RecipeCategory.TOOLS, ModItems.GIANT_NETHERITE_HEAD.get());

        //Template
        shaped(RecipeCategory.MISC, ModItems.HAMMER_SMITHING_TEMPLATE.get(), 2)
                .pattern("#X#")
                .pattern("#C#")
                .pattern("###")
                .define('C', ModItems.DIAMOND_HEAD.asItem())
                .define('#', Items.DIAMOND.asItem())
                .define('X', ModItems.HAMMER_SMITHING_TEMPLATE.asItem())
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .unlockedBy("has_diamond_head", has(ModItems.DIAMOND_HEAD))
                .unlockedBy("has_hammer_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output);

        //Heads

        shaped(RecipeCategory.MISC, ModItems.STONE_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.COBBLESTONE.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_cobblestone", has(Items.COBBLESTONE))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.IRON_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.IRON_INGOT.asItem())
                .define('C', Items.IRON_NUGGET.asItem())
                .unlockedBy("has_cobblestone", has(Items.IRON_INGOT))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.GOLD_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.GOLD_INGOT.asItem())
                .define('C', Items.GOLD_NUGGET.asItem())
                .unlockedBy("has_cobblestone", has(Items.GOLD_INGOT))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.DIAMOND_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.DIAMOND.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_cobblestone", has(Items.DIAMOND))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.AMETHYST_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.AMETHYST_SHARD.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_cobblestone", has(Items.AMETHYST_SHARD))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.COPPER_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.COPPER_INGOT.asItem())
                .define('C', Items.COPPER_NUGGET.asItem())
                .unlockedBy("has_cobblestone", has(Items.COPPER_INGOT))
                .save(output);



        //Giant Heads
        shaped(RecipeCategory.MISC, ModItems.GIANT_STONE_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.COBBLESTONE.asItem())
                .define('C', Items.STONE_BRICKS.asItem())
                .unlockedBy("has_cobblestone", has(Items.COBBLESTONE))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.GIANT_IRON_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.IRON_BLOCK.asItem())
                .define('C', Items.IRON_INGOT.asItem())
                .unlockedBy("has_cobblestone", has(Items.IRON_INGOT))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.GIANT_GOLD_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.GOLD_BLOCK.asItem())
                .define('C', Items.GOLD_INGOT.asItem())
                .unlockedBy("has_cobblestone", has(Items.GOLD_INGOT))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.GIANT_DIAMOND_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.DIAMOND_BLOCK.asItem())
                .define('C', Items.DIAMOND.asItem())
                .unlockedBy("has_cobblestone", has(Items.DIAMOND))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.GIANT_AMETHYST_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.AMETHYST_BLOCK.asItem())
                .define('C', Items.AMETHYST_SHARD.asItem())
                .unlockedBy("has_cobblestone", has(Items.AMETHYST_SHARD))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.GIANT_COPPER_HEAD.get())
                .pattern("###")
                .pattern("#C#")
                .define('#', Items.COPPER_BLOCK.asItem())
                .define('C', Items.COPPER_INGOT.asItem())
                .unlockedBy("has_cobblestone", has(Items.COPPER_INGOT))
                .save(output);


        //Giant Hammers
           SmithingTransformRecipeBuilder.smithing(
                   Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                   Ingredient.of(ModItems.GIANT_NETHERITE_HEAD),
                   Ingredient.of(Items.STICK),
                   RecipeCategory.TOOLS,
                   ModItems.GIANT_NETHERITE_HAMMER.get()
           )
                   .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                   .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "giant_netherite_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.GIANT_DIAMOND_HEAD),
                        Ingredient.of(Items.STICK),
                        RecipeCategory.TOOLS,
                        ModItems.GIANT_DIAMOND_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "giant_diamond_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.GIANT_IRON_HEAD),
                        Ingredient.of(Items.STICK),
                        RecipeCategory.TOOLS,
                        ModItems.GIANT_IRON_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "giant_iron_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.GIANT_GOLD_HEAD),
                        Ingredient.of(Items.STICK),
                        RecipeCategory.TOOLS,
                        ModItems.GIANT_GOLD_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "giant_gold_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.GIANT_COPPER_HEAD),
                        Ingredient.of(Items.STICK),
                        RecipeCategory.TOOLS,
                        ModItems.GIANT_COPPER_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "giant_copper_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.GIANT_AMETHYST_HEAD),
                        Ingredient.of(Items.STICK),
                        RecipeCategory.TOOLS,
                        ModItems.GIANT_AMETHYST_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "giant_amethyst_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.GIANT_STONE_HEAD),
                        Ingredient.of(Items.STICK),
                        RecipeCategory.TOOLS,
                        ModItems.GIANT_STONE_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "giant_stone_hammer")));


//Tiny Hammers

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.NETHERITE_HEAD),
                        Ingredient.of(ModItems.TINY_STICK),
                        RecipeCategory.TOOLS,
                        ModItems.TINY_NETHERITE_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "tiny_netherite_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.DIAMOND_HEAD),
                        Ingredient.of(ModItems.TINY_STICK),
                        RecipeCategory.TOOLS,
                        ModItems.TINY_DIAMOND_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "tiny_diamond_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.IRON_HEAD),
                        Ingredient.of(ModItems.TINY_STICK),
                        RecipeCategory.TOOLS,
                        ModItems.TINY_IRON_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "tiny_iron_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.GOLD_HEAD),
                        Ingredient.of(ModItems.TINY_STICK),
                        RecipeCategory.TOOLS,
                        ModItems.TINY_GOLD_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "tiny_gold_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.COPPER_HEAD),
                        Ingredient.of(ModItems.TINY_STICK),
                        RecipeCategory.TOOLS,
                        ModItems.TINY_COPPER_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "tiny_copper_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.AMETHYST_HEAD),
                        Ingredient.of(ModItems.TINY_STICK),
                        RecipeCategory.TOOLS,
                        ModItems.TINY_AMETHYST_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "tiny_amethyst_hammer")));

        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.HAMMER_SMITHING_TEMPLATE),
                        Ingredient.of(ModItems.STONE_HEAD),
                        Ingredient.of(ModItems.TINY_STICK),
                        RecipeCategory.TOOLS,
                        ModItems.TINY_STONE_HAMMER.get()
                )
                .unlocks("has_custom_template", has(ModItems.HAMMER_SMITHING_TEMPLATE))
                .save(output, String.valueOf(Identifier.fromNamespaceAndPath(HammerAdditions.MOD_ID, "tiny_stone_hammer")));

























    }

    @Override
    protected void copySmithingTemplate(ItemLike template, Ingredient baseItem) {
        super.copySmithingTemplate(template, baseItem);
    }

    @Override
    protected void netheriteSmithing(Item ingredientItem, RecipeCategory category, Item resultItem) {
        super.netheriteSmithing(ingredientItem, category, resultItem);
    }

    protected <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, HammerAdditions.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
