package me.breakthebricks.RandomBlock;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitTask;



public class Commands implements CommandExecutor {
	
	private HashMap<Player, Material> playerBlocks;
	private final MainClass plugin;
	HashMap<Player, PlayerInfo> playerInfos;
	private ArrayList<Player> players;
	
	public Commands(HashMap<Player, Material> playerBlocks, MainClass plugin, HashMap<Player, PlayerInfo> playerInfos, ArrayList<Player> players) {
		
		this.playerBlocks = playerBlocks;
		this.plugin = plugin;
		this.playerInfos = playerInfos;
		this.players = players;
		
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if(label.equalsIgnoreCase("startshuffle")) {
				if(sender instanceof Player) {
					Player p = (Player) sender;
					if(p.isOp()) {
						Sheduler.cancelRun = false;
						playerInfos.clear();
						playerBlocks.clear();
						players.clear();
						Bukkit.broadcastMessage("Let the games begin");
						for(Player current:Bukkit.getOnlinePlayers()) {
							ItemStack item = Blocks.getBlock1();
							playerBlocks.put(current, item.getType());
							current.getInventory().setItem(1,item);
							initializePlayerInfo(current,item);
							players.add(current);
						} 
						PlayerScoreboard scoreboard = new PlayerScoreboard();
						BukkitTask task = new Sheduler(this.plugin, 5,playerBlocks,playerInfos,players,scoreboard).runTaskTimer(this.plugin, 0, 5);
						return true;
					}
				} 
			}
			return false;
	}
	
		
		private void initializePlayerInfo(Player current, ItemStack item) {
			
			PlayerInfo playerInfo = new PlayerInfo(item);
			playerInfos.put(current, playerInfo);
			playerInfo.setPlayerTime(Commands3.getRemainingTime());
			
		}
	
	
	
}
