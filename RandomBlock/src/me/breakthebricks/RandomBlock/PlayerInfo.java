package me.breakthebricks.RandomBlock;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class PlayerInfo {
	
	double remainingTime;
	Sheduler shedular;
	boolean playerStatus = true;
	int score = 0;
	ItemStack item;
	
	public PlayerInfo(ItemStack item) {
		this.item = item;
	}
	
	public void decreaseRemainingTime() {
		remainingTime--;
	}
	
	public double getRemainingTime() {
		return remainingTime/4;
	}
	
	public boolean getPlayerSatus() {
		return playerStatus;
	}
	
	public void setPlayerStatusIsOut() {
		playerStatus = false;
	}
	
	public void setPlayerTime(int t) {
		remainingTime = t*4 ;
	}
	
	public int getScore() {
		return score;
	}
	
	public void increaseScore() {
		score++;
	}
	
	public void setItem(ItemStack item) {
		this.item = item;
	}
	
	public ItemStack getItem() {
		return item;
	}
}
