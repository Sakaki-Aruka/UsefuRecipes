package online.aruka.latestRecipes

import io.github.sakaki_aruka.customcrafter.CustomCrafterAPI
import online.aruka.latestRecipes.recipe.shaped.Farmer
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
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
