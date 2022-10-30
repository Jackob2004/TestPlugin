package me.shadow_warrior.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Testt(this),this);
        getServer().getPluginManager().registerEvents(new GandalfStaff(),this);
        getServer().getPluginManager().registerEvents(new BuffaloHorn(),this);
        getCommand("tot435236").setExecutor(new TotemCommand());

    }


}
