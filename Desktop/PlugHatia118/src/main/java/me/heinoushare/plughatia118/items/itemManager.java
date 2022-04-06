package me.heinoushare.plughatia118.items;

import org.bukkit.entity.Item;
import org.bukkit.inventory.CraftingInventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

import static me.heinoushare.plughatia118.items.elvenSteelArmor.elvenSteelArmorInit;
import static me.heinoushare.plughatia118.items.elvenSteelIngot.createElvenSteelIngot;
import static me.heinoushare.plughatia118.items.elvenSteelTools.elvenSteelToolsInit;
import static me.heinoushare.plughatia118.items.mithrilArmor.mithrilArmorInit;
import static me.heinoushare.plughatia118.items.mithrilIngot.createMithrilIngot;
import static me.heinoushare.plughatia118.items.mithrilTools.mithrilToolsInit;
import static me.heinoushare.plughatia118.items.steelArmor.steelArmorInit;;
import static me.heinoushare.plughatia118.items.steelIngot.createSteelIngot;
import static me.heinoushare.plughatia118.items.steelTools.steelToolsInit;

public class itemManager {

    /* Base materials */
    public static ItemStack steelIngot;
    public static ItemStack elvenSteelIngot;
    public static ItemStack mithrilIngot;

    /* Steel Items */

    // Steel Armor
    public static ItemStack steelHelmet;
    public static ItemStack steelChestplate;
    public static ItemStack steelLeggings;
    public static ItemStack steelBoots;
    public static ItemStack steelShield;

    // Steel Tools
    public static ItemStack steelSword;
    public static ItemStack steelAxe;
    public static ItemStack steelPickaxe;
    public static ItemStack steelShovel;
    public static ItemStack steelHoe;

    /* Elven Steel Items */

    // Elven Steel Armor
    public static ItemStack elvenSteelHelmet;
    public static ItemStack elvenSteelChestplate;
    public static ItemStack elvenSteelLeggings;
    public static ItemStack elvenSteelBoots;
    public static ItemStack elvenSteelShield;

    // Elven Steel Tools
    public static ItemStack elvenSteelSword;
    public static ItemStack elvenSteelAxe;
    public static ItemStack elvenSteelPickaxe;
    public static ItemStack elvenSteelShovel;
    public static ItemStack elvenSteelHoe;

    /* Mithril Items */

    // Mithril Armor
    public static ItemStack mithrilHelmet;
    public static ItemStack mithrilChestplate;
    public static ItemStack mithrilLeggings;
    public static ItemStack mithrilBoots;
    public static ItemStack mithrilShield;

    // Mithril Tools
    public static ItemStack mithrilSword;
    public static ItemStack mithrilAxe;
    public static ItemStack mithrilPickaxe;
    public static ItemStack mithrilShovel;
    public static ItemStack mithrilHoe;

    public static void init() {
        createSteelIngot();
        steelArmorInit();
        steelToolsInit();

        createElvenSteelIngot();
        elvenSteelArmorInit();
        elvenSteelToolsInit();

        createMithrilIngot();
        mithrilArmorInit();
        mithrilToolsInit();
    }

    public static boolean checkCraft(ItemStack result, CraftingInventory inv, HashMap<Integer, ItemStack> ingredients) {
        ItemStack[] matrix = inv.getMatrix();
        try {
            // If result equals item being checked
            if (inv.getResult().equals(result)) {
                inv.setResult(null);
            }
        } catch (Exception ex) {
            // If inv.getResult() == null
        }
        for (int i = 0; i < 9; i++) {
            if (ingredients.containsKey(i)) {
                if (matrix[i] == null && ingredients.get(i) == null) {

                }
                else if (matrix[i] == null || !matrix[i].equals(ingredients.get(i))) {
                    return false;
                }
            } else if (matrix[i] != null) {
                return false;
            }

        }

        inv.setResult(result);
        return true;
    }

}

