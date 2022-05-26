package com.xtendera;

import com.xtendera.handlers.ItemFrameHandler;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class IFD extends JavaPlugin {

    public FileConfiguration getConfigFile() {
        return config;
    }
    FileConfiguration config = getConfig();
    int dupeChance = config.getInt("dupeChance");

    @Override
    public void onEnable() {
        // Plugin startup logic
        if (config.getBoolean("dupeEnabled")) {
            config.options().copyDefaults(true);
            saveConfig();
            new ItemFrameHandler(this);
            Bukkit.getLogger().info("Loaded IFD dupe plugin.");
        }
    }

//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic
//    }


}