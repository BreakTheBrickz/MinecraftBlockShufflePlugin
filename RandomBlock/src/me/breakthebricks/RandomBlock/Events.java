package me.breakthebricks.RandomBlock;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
 import org.bukkit.inventory.ItemStack;

public class Events implements Listener {
	
	MainClass plugin;
	private HashMap<Player, PlayerInfo> playerInfos;
	
	public Events(MainClass plugin) {
		this.plugin = plugin;
		playerInfos = plugin.getHashMapPlayerInfos();
	}
	
	
	
	@EventHandler
	public void onBlockPlaceEvent(BlockPlaceEvent event) {
		
		ItemStack item = event.getItemInHand();
		Player player = event.getPlayer();
		
		PlayerInfo playerInfo = playerInfos.get(player);
		//Bukkit.broadcastMessage("Event recognized");
		
		if(playerInfo.getItem().equals(item) && !playerInfo.getTestMode()) {
			event.setCancelled(true);
			//Bukkit.broadcastMessage("Event canceld");
		}
	}
		
	@EventHandler
	public void onDropEvent(PlayerDropItemEvent event) {
		
		ItemStack item = event.getItemDrop().getItemStack();
		Player player = event.getPlayer();
		
		PlayerInfo playerInfo = playerInfos.get(player);
		//Bukkit.broadcastMessage("Event recognized");
		
		if(playerInfo.getItem().equals(item)) {
			event.setCancelled(true);
			//Bukkit.broadcastMessage("Event canceld");
		}
		
	}
	
	@EventHandler
	public void onPlayerDeathEvent(PlayerDeathEvent event) {
		
		Player player = event.getEntity().getPlayer();
		
		playerInfos.get(player).setPlayerStatusIsOut();
		
		//player.setGameMode(GameMode.SPECTATOR);
		
	}
	
	@EventHandler
	public void onCraftEvent(PrepareItemCraftEvent event) {
		
		Player player = (Player) event.getInventory().getHolder();
		PlayerInfo playerInfo = playerInfos.get(player);
		Bukkit.broadcastMessage("Event recognized");
		
		for(int a = 1; a < 9;a++) {
			
			ItemStack item = event.getInventory().getItem(a);
			
			if(playerInfo.getItem().equals(item)) {
				event.getInventory().setResult(new ItemStack(Material.AIR));
				//Bukkit.broadcastMessage("Event canceld");
			}
		}
		
	}
	
	@EventHandler
	public void onRenameEvent(InventoryClickEvent event) {
		
		if(event.getInventory().getType() == InventoryType.ANVIL) {
			event.setCancelled(true);
		}
		
	}
		
		
}
