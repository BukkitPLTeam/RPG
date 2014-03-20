package pl.adrenator.api;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class gracz {

	
	
	public static void ShowHelp(Player p){
		
		p.sendMessage("DIPA");
				}
	

	public static void ErrorMessage(CommandSender p, String l) {
		if(l.equalsIgnoreCase("Perm")){
			p.sendMessage(ChatColor.DARK_AQUA + "AdrTools>> " + ChatColor.RED + "Brak uprawnien");
			
		}else{
			
		p.sendMessage(ChatColor.DARK_AQUA + "Adrtools>> " + ChatColor.RED + "Blad");
	}
	}
	
	
	
	public static void Message(CommandSender p,String msg){
		
		p.sendMessage(ChatColor.DARK_AQUA + "AdrTools>>" + ChatColor.GOLD + msg);
		
	}
	
	
	
	
	
}
