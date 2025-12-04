package online.aruka.latestRecipes.recipe.shaped.trade

import io.github.sakaki_aruka.customcrafter.api.interfaces.recipe.CRecipe
import online.aruka.latestRecipes.recipe.shaped.Util
import org.bukkit.Material

object Farmer {
    val WHEAT: CRecipe = Util.tradeRecipe(Material.WHEAT, 20, 2)
    val POTATO: CRecipe = Util.tradeRecipe(Material.POTATO, 26, 2)
    val CARROT: CRecipe = Util.tradeRecipe(Material.CARROT, 22, 2)
    val BEETROOT: CRecipe = Util.tradeRecipe(Material.BEETROOT, 15, 2)
    val PUMPKIN: CRecipe = Util.tradeRecipe(Material.PUMPKIN, 6, 10)
    val WATERMELON: CRecipe = Util.tradeRecipe(Material.MELON, 4, 20)
}