package xyz.n7mn.dev.yukigassen;

import org.bukkit.plugin.java.JavaPlugin;

public final class YukiGassen extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
