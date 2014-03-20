package pl.adrenator.main;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import pl.adrenator.api.Config;





public class Main extends JavaPlugin{

	@Override
	public void onDisable() {
		
	}

	@Override
	public void onEnable() {
	
		
		if(!Config.getConfig("config").getBoolean("enable")){
			Bukkit.getPluginManager().disablePlugin(this);
			return;
		}
		
		Bukkit.getConsoleSender().sendMessage("[" + "AdrTools" + "] " + "Rejestruje plik config.yml");	
		if(Config.registerConfig("config", "Config.yml", this)){
			Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plik wczytane poprawnie");
		}else{
			
			 Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Blad podczas wczytywania pluginu");
			
		}
		
		Bukkit.getConsoleSender().sendMessage("[" + "AdrTools" + "] " + "Rejestruje plik warpy.yml");	
		if(Config.registerConfig("warpy", "warpy.yml", this)){
			Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plik wczytany poprawnie");
		}else{
			
			 Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Blad podczas wczytywania pluginu");
			
		}
		
		
		
		
		 Bukkit.getConsoleSender().sendMessage("[" + "AdrTools" + "] " + "Wczytuje pliki konfiguracyjne.......");
		 
		 
			if(Config.loadAll()){
				 Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Pliki wczytane poprawnie");
				
			}else{
				 Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Blad podczas wczytywania pluginu");
				 Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Wylaczanie pluginu ......");
				 
				 
			}
			


	
	
	   
	   //event
		
		getServer().getPluginManager().registerEvents(new HelpCommand(), this);
		
		
	}
}
		
		
		
	

	
	
	
	
	
	
	

