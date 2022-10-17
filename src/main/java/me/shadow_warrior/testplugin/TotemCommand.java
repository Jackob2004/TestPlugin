package me.shadow_warrior.testplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TotemCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        ItemStack totem = new ItemStack(Material.STICK);
        ItemMeta itemMeta = totem.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Totem");
        totem.setItemMeta(itemMeta);
        player.getInventory().addItem(totem);
        return true;
    }
}
