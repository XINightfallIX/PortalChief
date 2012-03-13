package net.aufdemrand.portalchief;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;


public class PortalListener implements Listener {

	PortalChief plugin;
	public PortalListener(PortalChief instance) { plugin = instance; }


	@EventHandler
	public void PortalListener(PlayerPortalEvent event) {

		String theWorld = plugin.getConfig().getString("world");
		Boolean useCurrentWorld = plugin.getConfig().getBoolean("use_current_world");
		Player thePlayer = event.getPlayer();
		String theMessage = plugin.getConfig().getString("message");
		Boolean useTheMessage = plugin.getConfig().getBoolean("use_message");
		
		Location TPLocation;
		
		if (useCurrentWorld == true) { TPLocation = thePlayer.getWorld().getSpawnLocation(); }
		
		else { TPLocation = plugin.getServer().getWorld(theWorld).getSpawnLocation(); }
		
		thePlayer.teleport(TPLocation);
				
		if (useTheMessage = true) { thePlayer.sendMessage(theMessage); }
				
		event.setCancelled(true);
	}

}