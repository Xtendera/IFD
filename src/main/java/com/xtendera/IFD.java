package com.xtendera;

import com.xtendera.handlers.ItemFrameHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class IFD extends JavaPlugin {


    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        // Plugin startup logic
        if (getConfig().getInt("dupeChance") > 100) {
            Bukkit.getLogger().warning("dupeChance is has a value greater than 100, value has been corrected to 5.");
            getConfig().set("dupeChance", 5);
        }
        if (getConfig().getInt("dupeChance") > 0) {
            new ItemFrameHandler(this);
            Bukkit.getLogger().info("Loaded IFD dupe plugin.");
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
