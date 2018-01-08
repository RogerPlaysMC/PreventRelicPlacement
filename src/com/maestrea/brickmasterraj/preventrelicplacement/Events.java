/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestrea.brickmasterraj.preventrelicplacement;

import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 *
 * @author roger
 */
public class Events implements Listener{
    
    @EventHandler
    public void onRelicPlace(BlockPlaceEvent e){
        List l = e.getItemInHand().getItemMeta().getLore();
        if(l == null){
            return;
        }
        if(l.contains(ChatColor.DARK_GRAY + "Tier: " + ChatColor.DARK_RED + "Relic")){
            e.setCancelled(true);
        }
    }
}
