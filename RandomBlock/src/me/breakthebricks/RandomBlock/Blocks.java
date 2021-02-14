package me.breakthebricks.RandomBlock;

import java.util.ArrayList;
import java.util.Collections;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Blocks {

	private static ArrayList<ItemStack> blocks1;
	private static ArrayList<ItemStack> blocks2;
	private static ArrayList<ItemStack> blocks3;
	private static ArrayList<ItemStack> blocks4;
	
	public Blocks(ArrayList<ItemStack> blocks1,ArrayList<ItemStack> blocks2,ArrayList<ItemStack> blocks3,ArrayList<ItemStack> blocks4) {
		
		Blocks.blocks1 = blocks1;
		Blocks.blocks2 = blocks2;
		Blocks.blocks3 = blocks3;
		Blocks.blocks3 = blocks4;
		
		blocks1.add(new ItemStack(Material.BEDROCK));
		blocks1.add(new ItemStack(Material.WHITE_WOOL));
		blocks1.add(new ItemStack(Material.POLISHED_ANDESITE));
		blocks1.add(new ItemStack(Material.POLISHED_DIORITE));
		blocks1.add(new ItemStack(Material.POLISHED_GRANITE));
		blocks1.add(new ItemStack(Material.STRIPPED_DARK_OAK_LOG));
		blocks1.add(new ItemStack(Material.STRIPPED_DARK_OAK_WOOD));
		blocks1.add(new ItemStack(Material.SAND));
		blocks1.add(new ItemStack(Material.SANDSTONE));
		blocks1.add(new ItemStack(Material.GLASS));
		blocks1.add(new ItemStack(Material.BRICKS));
		blocks1.add(new ItemStack(Material.RED_CONCRETE));
		blocks1.add(new ItemStack(Material.YELLOW_CONCRETE));
		blocks1.add(new ItemStack(Material.DARK_OAK_LEAVES));
		blocks1.add(new ItemStack(Material.CHISELED_STONE_BRICKS));
		blocks1.add(new ItemStack(Material.CLAY));
		blocks1.add(new ItemStack(Material.GRINDSTONE));
		blocks1.add(new ItemStack(Material.FURNACE));
		blocks1.add(new ItemStack(Material.COARSE_DIRT));
		blocks1.add(new ItemStack(Material.SMOKER));
		blocks1.add(new ItemStack(Material.SMOOTH_STONE));
		blocks1.add(new ItemStack(Material.COMPOSTER));
		blocks1.add(new ItemStack(Material.COAL_ORE));
		blocks1.add(new ItemStack(Material.CAMPFIRE));
		blocks1.add(new ItemStack(Material.FLETCHING_TABLE));
		blocks1.add(new ItemStack(Material.LOOM));	
			
			
		
		
		blocks2.add(new ItemStack(Material.ACACIA_LOG));
		blocks2.add(new ItemStack(Material.JUNGLE_LOG));
		blocks2.add(new ItemStack(Material.DRIED_KELP_BLOCK));
		blocks2.add(new ItemStack(Material.BEEHIVE));
		blocks2.add(new ItemStack(Material.BOOKSHELF));
		blocks2.add(new ItemStack(Material.IRON_ORE));
		blocks2.add(new ItemStack(Material.LAPIS_ORE));
		blocks2.add(new ItemStack(Material.REDSTONE_ORE));
		blocks2.add(new ItemStack(Material.NETHERRACK));
		blocks2.add(new ItemStack(Material.COAL_BLOCK));
		blocks2.add(new ItemStack(Material.IRON_BLOCK));
		blocks2.add(new ItemStack(Material.REDSTONE_BLOCK));
		blocks2.add(new ItemStack(Material.LAPIS_BLOCK));
		blocks2.add(new ItemStack(Material.PUMPKIN));
		blocks2.add(new ItemStack(Material.SNOW_BLOCK));
		blocks2.add(new ItemStack(Material.DROPPER));
		blocks2.add(new ItemStack(Material.NOTE_BLOCK));
		blocks2.add(new ItemStack(Material.PODZOL));
		blocks2.add(new ItemStack(Material.SWEET_BERRY_BUSH));
		blocks2.add(new ItemStack(Material.PISTON));
		blocks2.add(new ItemStack(Material.OBSIDIAN));
		blocks2.add(new ItemStack(Material.CAKE));
		blocks2.add(new ItemStack(Material.STONECUTTER));
		blocks2.add(new ItemStack(Material.CAULDRON));
		blocks2.add(new ItemStack(Material.HOPPER));
		blocks2.add(new ItemStack(Material.HAY_BLOCK));
		blocks2.add(new ItemStack(Material.IRON_BARS));
		blocks2.add(new ItemStack(Material.TARGET));
		blocks2.add(new ItemStack(Material.LECTERN));
		blocks2.add(new ItemStack(Material.BLAST_FURNACE));
		blocks2.add(new ItemStack(Material.SMITHING_TABLE));
		blocks2.add(new ItemStack(Material.CARTOGRAPHY_TABLE));
		blocks2.add(new ItemStack(Material.CHAIN));
		
		
		
		
		
		blocks3.add(new ItemStack(Material.NETHER_BRICKS));
		blocks3.add(new ItemStack(Material.NETHER_QUARTZ_ORE));
		blocks3.add(new ItemStack(Material.BASALT));
		blocks3.add(new ItemStack(Material.MAGMA_BLOCK));
		blocks3.add(new ItemStack(Material.GLOWSTONE));
		blocks3.add(new ItemStack(Material.BLACKSTONE));
		blocks3.add(new ItemStack(Material.WARPED_NYLIUM));
		blocks3.add(new ItemStack(Material.WARPED_STEM));
		blocks3.add(new ItemStack(Material.WARPED_PLANKS));
		blocks3.add(new ItemStack(Material.WARPED_WART_BLOCK));
		blocks3.add(new ItemStack(Material.CRIMSON_NYLIUM));
		blocks3.add(new ItemStack(Material.CRIMSON_PLANKS));
		blocks3.add(new ItemStack(Material.CRIMSON_STEM));
		blocks3.add(new ItemStack(Material.BREWING_STAND));
		blocks3.add(new ItemStack(Material.ANVIL));
		blocks3.add(new ItemStack(Material.QUARTZ_BLOCK));
		blocks3.add(new ItemStack(Material.QUARTZ_BRICKS));
		blocks3.add(new ItemStack(Material.QUARTZ_PILLAR));
		blocks3.add(new ItemStack(Material.SLIME_BLOCK));
		blocks3.add(new ItemStack(Material.JUNGLE_LOG));
		blocks3.add(new ItemStack(Material.SCAFFOLDING));
		blocks3.add(new ItemStack(Material.CRYING_OBSIDIAN));
		blocks3.add(new ItemStack(Material.GOLD_BLOCK));
		blocks3.add(new ItemStack(Material.COBWEB));
		blocks3.add(new ItemStack(Material.REDSTONE_LAMP));
		blocks3.add(new ItemStack(Material.STICKY_PISTON));
		blocks3.add(new ItemStack(Material.OBSERVER));
		blocks3.add(new ItemStack(Material.ENCHANTING_TABLE));
		
		
		blocks4.add(new ItemStack(Material.END_PORTAL_FRAME));
		blocks4.add(new ItemStack(Material.END_STONE));
		blocks4.add(new ItemStack(Material.SHULKER_BOX));
		blocks4.add(new ItemStack(Material.END_ROD));
		blocks4.add(new ItemStack(Material.WITHER_SKELETON_SKULL));
		blocks4.add(new ItemStack(Material.DIAMOND_BLOCK));
		blocks4.add(new ItemStack(Material.SEA_PICKLE));
		blocks4.add(new ItemStack(Material.PRISMARINE_BRICKS));
		
		




	}
	
	public static ItemStack getBlock1() {
		Collections.shuffle(blocks1);
		ItemStack item = new ItemStack(blocks1.get(0));
		return setMeta(item);
		
	}
	
	public static ItemStack getBlock2() {
		Collections.shuffle(blocks2);
		ItemStack item = new ItemStack(blocks2.get(0));
		return setMeta(item);
		
	}
	
	public static ItemStack getBlock3() {
		Collections.shuffle(blocks3);
		ItemStack item = new ItemStack(blocks3.get(0));
		return setMeta(item);
		
	}
	
	public static ItemStack getBlock4() {
		Collections.shuffle(blocks4);
		ItemStack item = new ItemStack(blocks3.get(0));
		return setMeta(item);
		
	}
	
	public static ItemStack setMeta(ItemStack item) {
		
		String s = item.getType().toString();
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(ChatColor.DARK_GREEN + s);
		
		item.setItemMeta(meta);
		return item;
		
	}
	
	
	
	
}
