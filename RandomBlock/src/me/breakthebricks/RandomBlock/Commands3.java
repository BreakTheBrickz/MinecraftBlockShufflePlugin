package me.breakthebricks.RandomBlock;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands3 implements CommandExecutor{
	
	static int remainingTime = 300;

		
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(label.equalsIgnoreCase("setPlayersTime")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.isOp()) {
					remainingTime = Integer.parseInt(args[0]);
					Bukkit.broadcastMessage("Time per Round set to: " + remainingTime);
				}
			}
		}
		return false;
	}
	
	public static int getRemainingTime() {
		return remainingTime;
	}

}
