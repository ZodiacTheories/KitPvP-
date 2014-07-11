package org.zodiactheories.kitpvpplus;

import org.bukkit.java.JavaPlugin;

public class KitPvP extends JavaPlugin {

    public static Main pl;

    @Override
    public void onEnable() {
        pl = this;
    }
    
    @Override
    public void onDisable(){
        pl = null;
    }
}
