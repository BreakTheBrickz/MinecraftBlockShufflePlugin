package me.breakthebricks.RandomBlock;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class PlayerScoreboard {
	
	
	
	public void setPlayerScoreboard(Player player,Material material,double remainingTime,int playerScore,boolean isAlive) {

		int remainingTimeInSeconds = (int)remainingTime;
		
		Scoreboard sb = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective o = sb.registerNewObjective("Scoreboard", "dummy",ChatColor.GOLD + "Scoreboard");

        o.setDisplaySlot(DisplaySlot.SIDEBAR);


        if(isAlive) {

            Score mat = o.getScore(material.toString());
            Score remTime = o.getScore(Integer.toString(remainingTimeInSeconds) + " Seconds");
            Score pScore = o.getScore(Integer.toString(playerScore));
            Score matTitle = o.getScore(ChatColor.BLUE + "Material:");
            Score remTimeTitle = o.getScore(ChatColor.DARK_RED + "Remaining Time:");
            Score scoreTitle = o.getScore(ChatColor.DARK_GREEN + "Your Score:");
            Score blank2 = o.getScore("  ");
            Score blank3 = o.getScore("   ");

            pScore.setScore(0);
            scoreTitle.setScore(1);
            blank3.setScore(2);
            remTime.setScore(3);
            remTimeTitle.setScore(4);
            blank2.setScore(5);
            mat.setScore(6);
            matTitle.setScore(7);

        }else {

            Score dead = o.getScore(ChatColor.RED + "You are dead!");
            Score pScore = o.getScore(Integer.toString(playerScore));
            Score scoreTitle = o.getScore(ChatColor.DARK_GREEN + "Your Score:");
            Score blank1 = o.getScore(" ");

            dead.setScore(3);
            blank1.setScore(2);
            scoreTitle.setScore(1);
            pScore.setScore(0);

        }

        player.setScoreboard(sb);

    }
}
