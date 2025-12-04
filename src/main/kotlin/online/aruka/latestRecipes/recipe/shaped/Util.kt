package online.aruka.latestRecipes.recipe.shaped

import io.github.sakaki_aruka.customcrafter.api.interfaces.matter.CMatter
import io.github.sakaki_aruka.customcrafter.api.interfaces.recipe.CRecipe
import io.github.sakaki_aruka.customcrafter.api.interfaces.result.ResultSupplier
import io.github.sakaki_aruka.customcrafter.api.objects.recipe.CoordinateComponent
import io.github.sakaki_aruka.customcrafter.impl.matter.CMatterImpl
import io.github.sakaki_aruka.customcrafter.impl.recipe.GroupRecipe
import io.github.sakaki_aruka.customcrafter.impl.result.ResultSupplierImpl
import io.github.sakaki_aruka.customcrafter.impl.util.Converter
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.ExperienceOrb
import org.bukkit.inventory.ItemStack
import kotlin.collections.component1
import kotlin.collections.component2

object Util {
    fun tradeSupplier(
        targetMaterial: Material,
        tradeRate: Int,
        expRate: Int
    ): ResultSupplier {
        return ResultSupplierImpl { context ->
            val total: Int = context.mapped.entries
                .count { (_, item) -> item.type == targetMaterial } * context.calledTimes

            val emeraldAmount: Int = total / tradeRate
            if (emeraldAmount < 1) {
                return@ResultSupplierImpl listOf(ItemStack.of(targetMaterial).asQuantity(total))
            }

            Bukkit.getPlayer(context.crafterID)?.let { player ->
                val totalExperience: Int = emeraldAmount * expRate
                if (totalExperience > 0) {
                    repeat(totalExperience / 50) {
                        val orb = player.world.spawn(player.location, ExperienceOrb::class.java)
                        orb.experience = 50
                        orb.spawnAt(player.location)
                    }
                }

                if (totalExperience % 50 > 0) {
                    val orb = player.world.spawn(player.location, ExperienceOrb::class.java)
                    orb.experience = totalExperience % 50
                    orb.spawnAt(player.location)
                }
            }

            val remain: Int = total % tradeRate
            val result: MutableList<ItemStack> = mutableListOf()
            if (emeraldAmount >= 9) {
                result.add(ItemStack.of(Material.EMERALD_BLOCK, emeraldAmount / 9))
            }

            if (emeraldAmount % 9 > 0) {
                result.add(ItemStack.of(Material.EMERALD, emeraldAmount % 9))
            }

            if (remain > 0) {
                result.add(ItemStack.of(targetMaterial).asQuantity(remain))
            }
            result.toList()
        }
    }

    fun tradeRecipe(
        material: Material,
        tradeRate: Int,
        expRate: Int
    ): CRecipe {
        val required: CMatter = GroupRecipe.Matter.of(
            matter = CMatterImpl.of(material)
        )

        val optional: CMatter = GroupRecipe.Matter.of(
            matter = CMatterImpl.of(material),
            includeAir = true
        )

        val items: MutableMap<CoordinateComponent, CMatter> = mutableMapOf()
        items[CoordinateComponent(0, 0)] = required
        Converter.getAvailableCraftingSlotComponents()
            .filter { c -> c.toIndex() != 0 }
            .forEach { c -> items[c] = optional }

        val groups: Set<GroupRecipe.Context> = setOf(
            GroupRecipe.Context.default(CoordinateComponent(0, 0)),
            GroupRecipe.Context.of(
                members = (Converter.getAvailableCraftingSlotComponents() - CoordinateComponent(0, 0)).toSet(),
                min = 0
            )
        )

        return GroupRecipe(
            name = "trading (${material.name})",
            items = items,
            groups = groups,
            results = listOf(tradeSupplier(material, tradeRate, expRate))
        )
    }
}