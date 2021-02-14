package me.breakthebricks.RandomBlock;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands2 implements CommandExecutor{
	
	private HashMap<Player, Material> playerBlocks;
	private final MainClass plugin;
	HashMap<Player, PlayerInfo> playerInfos;
	private ArrayList<Player> players;
	
	public Commands2(HashMap<Player, Material> playerBlocks, MainClass plugin, HashMap<Player, PlayerInfo> playerInfos, ArrayList<Player> players) {
		
		this.playerBlocks = playerBlocks;
		this.plugin = plugin;
		this.playerInfos = playerInfos;
		this.players = players;
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("stopshuffle")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.isOp()) {
					Sheduler.cancelRun = true;
					playerInfos.clear();
					playerBlocks.clear();
					players.clear();
					Bukkit.broadcastMessage("Game has been stoped");
					return true;
				}
			}
		}return false;
	}
	
}
