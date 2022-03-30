package me.heinoushare.plughatia118.items;

import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

import static me.heinoushare.plughatia118.items.steelHelmet.createSteelHelmet;
import static me.heinoushare.plughatia118.items.steelIngot.createSteelIngot;

public class itemManager {

    public static ItemStack steelIngot;
    public static ItemStack steelHelmet;

    public static void init() {
        createSteelIngot();
        createSteelHelmet();
    }

    public static void checkCraft(ItemStack result, CraftingInventory inv, HashMap<Integer, ItemStack> ingredients) {
        ItemStack[] matrix = inv.getMatrix();
        for (int i = 0; i < 9; i++) {
            if (ingredients.containsKey(i)) {
                if (matrix[i] == null || !matrix[i].equals(ingredients.get(i))) {
                    return;
                }
            } else if (matrix[i] != null) {
                    return;
            }
        }
        inv.setResult(result);
    }

}
