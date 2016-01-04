package net.wintergrasped.WWA.WWMC.pack;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(this, this);
        this.saveDefaultConfig();
        
	}
	
	
	@EventHandler
	public void OnJoin(PlayerJoinEvent e) {
		
		
	}

}
