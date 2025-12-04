package online.aruka.latestRecipes.recipe.shaped.trade

import io.github.sakaki_aruka.customcrafter.api.interfaces.recipe.CRecipe
import online.aruka.latestRecipes.recipe.shaped.Util
import org.bukkit.Material

object Mason {
    val CRAY_BALL: CRecipe = Util.tradeRecipe(Material.CLAY_BALL,10, 2)
    val STONE: CRecipe = Util.tradeRecipe(Material.STONE, 20, 10)
    val GRANITE: CRecipe = Util.tradeRecipe(Material.GRANITE, 16, 20)
    val ANDESITE: CRecipe = Util.tradeRecipe(Material.ANDESITE, 16, 20)
    val DIORITE: CRecipe = Util.tradeRecipe(Material.DIORITE, 16, 20)
    val QUARTZ: CRecipe = Util.tradeRecipe(Material.QUARTZ, 12, 30)
}