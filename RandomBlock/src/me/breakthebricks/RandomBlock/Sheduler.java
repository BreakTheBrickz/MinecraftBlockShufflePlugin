package me.breakthebricks.RandomBlock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class Sheduler extends BukkitRunnable {

	
	private HashMap<Player, Material> playerBlocks;
	private HashMap<Player, PlayerInfo> playerInfos;
	private ArrayList<Player> players;
	
	public static boolean cancelRun = false;
	PlayerScoreboard scoreboard;
	
	
	public Sheduler(JavaPlugin plugin, int counter, HashMap<Player, Material> playerBlocks,HashMap<Player, PlayerInfo> playerInfos, ArrayList<Player> players, PlayerScoreboard scoreboard) {
		this.playerBlocks = playerBlocks;
		this.playerInfos = playerInfos;
		this.players = players;
		this.scoreboard = scoreboard;
		System.out.println("shedular sucessfully initializiert");
		
	}
	
	@Override
	public void run() {
		//Bukkit.broadcastMessage("run is active");
		
		if(cancelRun) {
			this.cancel();
		}
		
		for(Player current:players) {
			PlayerInfo playerInfo = playerInfos.get(current);
			scoreboard.setPlayerScoreboard(current, playerBlocks.get(current),playerInfo.getRemainingTime(), playerInfo.getScore(), playerInfo.getPlayerSatus());
				if(playerInfo.playerStatus) {
					if(playerInfo.getRemainingTime() > 0) {
						playerInfo.decreaseRemainingTime();
						checkBlockBelowPlayer(current,playerInfo);
					}else {
						current.sendMessage("Your Time is up");
						current.setHealth(0);
						playerInfo.setPlayerStatusIsOut();
					}
				} else {
					players.remove(current);
					Bukkit.broadcastMessage("players Lenght: " + players.size());
					if(players.size()<= 1) {
						this.cancel();
						checkWinner();
					}
				}
		
		} 
		
	}
	
	public void checkBlockBelowPlayer(Player current, PlayerInfo playerInfo) {
			Material m = current.getLocation().getBlock().getRelative(BlockFace.DOWN).getType();
			if(playerBlocks.get(current).equals(m)) {
				current.sendMessage("You did it");
				playerInfo.increaseScore();
				current.getInventory().remove(playerInfo.getItem());
				
				ItemStack item = null;
				item = assignBlock(item,playerInfo);
				
						if(item != null) {
								playerBlocks.put(current, item.getType());
								current.getInventory().setItem(1,item);
								playerInfo.setPlayerTime(Commands3.getRemainingTime());
								playerInfo.setItem(item);
								
						}else current.sendMessage("Invalid Score");
			}
	}
	
	private ItemStack assignBlock(ItemStack item, PlayerInfo playerInfo) {
		
		if(playerInfo.getScore() <= 7) {
			item = Blocks.getBlock1();
			Bukkit.broadcastMessage("getBLock1");
		}else if(playerInfo.getScore() <= 13) {
			item = Blocks.getBlock2();
			Bukkit.broadcastMessage("getBLock2");
		}else if(playerInfo.getScore() <= 19){
			item = Blocks.getBlock3();
			Bukkit.broadcastMessage("getBLock3");
		}else if(playerInfo.getScore() > 19) {
			item = Blocks.getBlock4();
			Bukkit.broadcastMessage("getBLock4");
		}
		
		return item;
	}
	
	private void checkWinner() {
		Player winner = null;
		int maxScore = 0;
		
		for(Map.Entry mapElement : playerInfos.entrySet()) {
			
			Player current = (Player)mapElement.getKey();
			PlayerInfo playerInfo = (PlayerInfo)mapElement.getValue();
			
			if(playerInfo.getScore() > maxScore) {
				winner = current;
				maxScore = playerInfo.getScore();
			}
			
		}
		
		if(winner != null && maxScore > 0) {
			Bukkit.broadcastMessage(winner.getDisplayName() + " is the Winner with " + maxScore + " Points");
			
		}else {
			Bukkit.broadcastMessage("Nobody has won");
		}
		
		playerInfos.clear();
		playerBlocks.clear();
		players.clear();
		Commands.gameIsRunning = false;
	}
	
}
