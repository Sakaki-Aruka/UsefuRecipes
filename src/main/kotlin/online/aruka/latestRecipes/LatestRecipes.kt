package online.aruka.latestRecipes

import io.github.sakaki_aruka.customcrafter.CustomCrafterAPI
import online.aruka.latestRecipes.recipe.shaped.trade.Butcher
import online.aruka.latestRecipes.recipe.shaped.trade.Cleric
import online.aruka.latestRecipes.recipe.shaped.trade.Farmer
import online.aruka.latestRecipes.recipe.shaped.trade.Mason
import org.bukkit.plugin.java.JavaPlugin

class LatestRecipes : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        CustomCrafterAPI.registerRecipe(Farmer.WHEAT)
        CustomCrafterAPI.registerRecipe(Farmer.POTATO)
        CustomCrafterAPI.registerRecipe(Farmer.CARROT)
        CustomCrafterAPI.registerRecipe(Farmer.BEETROOT)
        CustomCrafterAPI.registerRecipe(Farmer.PUMPKIN)
        CustomCrafterAPI.registerRecipe(Farmer.WATERMELON)

        CustomCrafterAPI.registerRecipe(Butcher.SWEET_BERRIES)
        CustomCrafterAPI.registerRecipe(Butcher.MUTTON)
        CustomCrafterAPI.registerRecipe(Butcher.RABBIT)
        CustomCrafterAPI.registerRecipe(Butcher.BEEF)
        CustomCrafterAPI.registerRecipe(Butcher.PORKCHOP)
        CustomCrafterAPI.registerRecipe(Butcher.RAW_CHICKEN)
        CustomCrafterAPI.registerRecipe(Butcher.DRIED_KELP_BLOCK)
        CustomCrafterAPI.registerRecipe(Butcher.COAL)

        CustomCrafterAPI.registerRecipe(Cleric.NETHER_WART)
        CustomCrafterAPI.registerRecipe(Cleric.GLASS_BOTTLE)
        CustomCrafterAPI.registerRecipe(Cleric.ROTTEN_FLESH)
        CustomCrafterAPI.registerRecipe(Cleric.GOLD_INGOT)
        CustomCrafterAPI.registerRecipe(Cleric.TURTLE_SCUTE)
        CustomCrafterAPI.registerRecipe(Cleric.RABBIT_FOOT)

        CustomCrafterAPI.registerRecipe(Mason.QUARTZ)
        CustomCrafterAPI.registerRecipe(Mason.DIORITE)
        CustomCrafterAPI.registerRecipe(Mason.GRANITE)
        CustomCrafterAPI.registerRecipe(Mason.STONE)
        CustomCrafterAPI.registerRecipe(Mason.ANDESITE)
        CustomCrafterAPI.registerRecipe(Mason.CRAY_BALL)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
