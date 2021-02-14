package me.breakthebricks.RandomBlock;


import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		getCommand("startshuffle").setExecutor(new Commands(playerBlocks, this, playerInfos,player));
		getCommand("stopshuffle").setExecutor(new Commands2(playerBlocks, this, playerInfos,player));
		getCommand("setPlayersTime").setExecutor(new Commands3());
		getServer().getPluginManager().registerEvents(new Events(this),this);
		
		Blocks b = new Blocks(blocks1,blocks2,blocks3,blocks4);
		Bukkit.broadcastMessage("hi");
		System.out.println("Plugin Enabeld");
	}
	
	@Override
	public void onDisable() {
		
	}
	
	private HashMap<Player, Material> playerBlocks = new HashMap<>();
	private HashMap<Player, PlayerInfo> playerInfos = new HashMap<>();
	private ArrayList<ItemStack> blocks1 = new ArrayList<>();
	private ArrayList<ItemStack> blocks2 = new ArrayList<>();
	private ArrayList<ItemStack> blocks3 = new ArrayList<>();
	private ArrayList<ItemStack> blocks4 = new ArrayList<>();
	private ArrayList<Player> player = new ArrayList<>();
	
	public HashMap<Player, Material> getHashMapMaterial(){
		return playerBlocks;
		
	}
	
	public HashMap<Player, PlayerInfo> getHashMapPlayerInfos(){
		return playerInfos;
	}
	
	
	
	
}


