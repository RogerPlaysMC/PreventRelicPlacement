/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maestrea.brickmasterraj.preventrelicplacement;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author roger
 */
public class Main extends JavaPlugin{

    @Override
    public void onEnable() {
        
        Bukkit.getServer().getPluginManager().registerEvents(new Events(),this);
    }
    
    @Override
    public void onDisable(){
        
    }
    
}
