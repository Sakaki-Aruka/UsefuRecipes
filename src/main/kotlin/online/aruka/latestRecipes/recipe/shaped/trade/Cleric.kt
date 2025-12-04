package online.aruka.latestRecipes.recipe.shaped.trade

import io.github.sakaki_aruka.customcrafter.api.interfaces.recipe.CRecipe
import online.aruka.latestRecipes.recipe.shaped.Util
import org.bukkit.Material

object Cleric {
    val ROTTEN_FLESH: CRecipe = Util.tradeRecipe(Material.ROTTEN_FLESH, 32, 2)
    val GOLD_INGOT: CRecipe = Util.tradeRecipe(Material.GOLD_INGOT, 3, 10)
    val RABBIT_FOOT: CRecipe = Util.tradeRecipe(Material.RABBIT_FOOT, 2, 20)
    val TURTLE_SCUTE: CRecipe = Util.tradeRecipe(Material.TURTLE_SCUTE, 4, 30)
    val GLASS_BOTTLE: CRecipe = Util.tradeRecipe(Material.GLASS_BOTTLE, 9, 30)
    val NETHER_WART: CRecipe = Util.tradeRecipe(Material.NETHER_WART, 22, 30)
}