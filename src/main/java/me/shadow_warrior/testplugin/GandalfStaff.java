package me.shadow_warrior.testplugin;


import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class GandalfStaff implements Listener {
    @EventHandler
    public void onRightClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if (e.getPlayer().getItemInHand().getType().equals(Material.BLAZE_ROD) && e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            for (Entity entity : player.getNearbyEntities(8, 8, 8)) {
                    player.playSound(player.getLocation(), Sound.FUSE,1,1);
                    entity.setVelocity(entity.getVelocity().clone().add(player.getLocation().clone().toVector().subtract(entity.getLocation().clone().toVector()).multiply(-0.8).setY(1)));


            }
        }
    }
}