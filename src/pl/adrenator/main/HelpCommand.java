package pl.adrenator.main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import pl.adrenator.api.gracz;



public class HelpCommand implements Listener{

	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void ChatListinerek(AsyncPlayerChatEvent e) {
	   
		
		
	
		
		
		
	if(e.getMessage().startsWith("/pl") || e.getMessage().startsWith("/plugins") || e.getMessage().startsWith("/?") || e.getMessage().startsWith("/help")){
		if(!e.getPlayer().hasPermission("adrtools.command.help.extemp")){
			e.setCancelled(true);
			gracz.ShowHelp(e.getPlayer());
			
		}else{
			gracz.Message(e.getPlayer(), "Posiadasz uprawnienia ignorujàce pokazywanie si´ /help po wypisaniu komendy! \n Aby uzyskaç pomoc wpisz /help admin.");
		}
	}
		
	if(e.getMessage().contains("a")){
		e.getPlayer().sendMessage("fdfdf");
		
	}
	
	}
	
}
