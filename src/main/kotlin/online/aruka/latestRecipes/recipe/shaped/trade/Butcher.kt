package online.aruka.latestRecipes.recipe.shaped.trade

import io.github.sakaki_aruka.customcrafter.api.interfaces.recipe.CRecipe
import online.aruka.latestRecipes.recipe.shaped.Util
import org.bukkit.Material

object Butcher {
    val RAW_CHICKEN: CRecipe = Util.tradeRecipe(Material.CHICKEN, 14, 2)
    val RABBIT: CRecipe = Util.tradeRecipe(Material.RABBIT, 4, 2)
    val PORKCHOP: CRecipe = Util.tradeRecipe(Material.PORKCHOP, 7, 2)
    val COAL: CRecipe = Util.tradeRecipe(Material.COAL, 15, 2)
    val BEEF: CRecipe = Util.tradeRecipe(Material.BEEF, 10, 20)
    val MUTTON: CRecipe = Util.tradeRecipe(Material.MUTTON, 7, 20)
    val DRIED_KELP_BLOCK: CRecipe = Util.tradeRecipe(Material.DRIED_KELP_BLOCK, 10, 30)
    val SWEET_BERRIES: CRecipe = Util.tradeRecipe(Material.SWEET_BERRIES, 10, 30)
}