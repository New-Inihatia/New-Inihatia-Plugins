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

public class mineObsidian implements Listener {

    @EventHandler
    public static void onMineObsidian(BlockBreakEvent e) {
        if (!e.getBlock().getBlockData().getMaterial().equals(Material.OBSIDIAN)) {
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
