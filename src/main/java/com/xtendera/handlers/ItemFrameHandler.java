package com.xtendera.handlers;

import com.xtendera.IFD;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class ItemFrameHandler implements Listener {
    IFD IFDInstance;
    public ItemFrameHandler(IFD plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
        IFDInstance = plugin;
    }
    @EventHandler
    public void itemFrameDupe(EntityDamageByEntityEvent event) {
        if(event.getEntity() instanceof ItemFrame) {
            Random rand = new Random();
            int chance = rand.nextInt(100);
            if(chance < IFDInstance.getConfig().getInt("dupeChance")) {
                ItemFrame FrameEntity = (ItemFrame) event.getEntity();
                ItemStack dupeItem = FrameEntity.getItem().clone();
                World frameWorld = FrameEntity.getWorld();
                frameWorld.dropItem(FrameEntity.getLocation(), dupeItem);
            }
        }
    }
}
