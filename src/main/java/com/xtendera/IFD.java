package com.xtendera;

import com.xtendera.handlers.ItemFrameHandler;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class IFD extends JavaPlugin {

    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        // Plugin startup logic
        if (config.getInt("dupeChance") > 100) {
            Bukkit.getLogger().warning("dupeChance is has a value greater than 100, value has been corrected to 5.");
            config.set("dupeChance", 5);
        }
        if (config.getInt("dupeChance") > 0) {
            config.options().copyDefaults(true);
            saveConfig();
            new ItemFrameHandler(this);
            Bukkit.getLogger().info("Loaded IFD dupe plugin.");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public FileConfiguration getConfigFile() {
        return config;
    }
}
