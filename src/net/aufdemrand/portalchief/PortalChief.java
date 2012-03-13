package net.aufdemrand.portalchief;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.metadata.LazyMetadataValue;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.metadata.Metadatable;
import org.bukkit.plugin.java.JavaPlugin;

public class PortalChief extends JavaPlugin {


	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) {
		return false;

	}

	@Override
	public void onDisable() {
		
		getLogger().log(Level.INFO, " v" + getDescription().getVersion() + " disabled.");
		
	}

	@Override
	public void onEnable() {

		this.getConfig().options().copyDefaults(true);
		saveConfig();  

		
		getServer().getPluginManager().registerEvents(new PortalListener(this), this);


	}

}