package me.breakthebricks.RandomBlock;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command4 implements CommandExecutor{

	HashMap<Player, PlayerInfo> playerInfos;
	
	public Command4(HashMap<Player, PlayerInfo> playerInfos){
		
		this.playerInfos = playerInfos;
	}
	
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd , String label, String[] arg3) {
		
		if(label.equalsIgnoreCase("Testmode")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.isOp()) {
					if(playerInfos.get(p).getTestMode()) {
						playerInfos.get(p).setTestMode(false);
						Bukkit.broadcastMessage(p.getDisplayName() + " is not in Testmode anymore");
					}else {
						playerInfos.get(p).setTestMode(true);
						Bukkit.broadcastMessage(p.getDisplayName() + " is now in Testmode");
					}
						
					return true;
				}
			}
		}
		return false;
	}

}
