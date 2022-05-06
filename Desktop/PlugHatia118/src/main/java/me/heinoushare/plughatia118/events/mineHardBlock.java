package me.heinoushare.plughatia118.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.ArrayList;
import java.util.List;

import static me.heinoushare.plughatia118.items.itemManager.*;

public class mineHardBlock implements Listener {

    @EventHandler
    public static void onMineHardBlock(BlockBreakEvent e) {
        Material block = e.getBlock().getBlockData().getMaterial();
        if (!block.equals(Material.OBSIDIAN) && !block.equals(Material.CRYING_OBSIDIAN) && !block.equals(Material.ANCIENT_DEBRIS) && !block.equals(Material.NETHERITE_BLOCK)) {
            return;
        }

        Player p = e.getPlayer();
        PlayerInventory inv = p.getInventory();

        List<ItemStack> picks = new ArrayList<>();
        picks.add(steelPickaxe);
        picks.add(elvenSteelPickaxe);
        picks.add(mithrilPickaxe);

        for (ItemStack pick : picks) {
            if (inv.getItemInMainHand().equals(pick)) {
                inv.addItem(new ItemStack(Material.OBSIDIAN));
                p.sendMessage(ChatColor.GRAY + "You mined obsidian");
                break;
            }
        }
    }

}
