package pl.adrenator.api;



import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class warp {

	
	 

	
	
	public static void Create(String nazwa,Player player){
		
		

        Location loc;
        loc = player.getLocation();

        Config.getConfig("warpy").set("warpy." + nazwa+  ".W", loc.getWorld().getName());
        Config.getConfig("warpy").set("warpy." + nazwa+  ".X", loc.getX());
        Config.getConfig("warpy").set("warpy." + nazwa+  ".Y", loc.getY());
        Config.getConfig("warpy").set("warpy." + nazwa+  ".Z", loc.getZ());
        Config.getConfig("warpy").set("warpy." + nazwa+  ".YA", loc.getYaw());
        Config.getConfig("warpy").set("warpy." + nazwa+  ".P", loc.getPitch());
        Config.getConfig("warpy").set("warpy." + nazwa+  ".public", "false");
        Config.getConfig("warpy").getStringList("lista warpow").add(nazwa);
        
	}
	
	public static boolean isSet(String nazwa){
		if(Config.getConfig("warpy").contains("warpy." + nazwa)){
			
			
				
			
			return true;
			
		}else{
			
			return false;
		}
		
		
	}
	
	
	public static List<String> list(){
		
		if(Config.getConfig("warpy").getStringList("lista warpow").isEmpty()){
			
			
			
			return null;
			
		}else{
			
			
			return Config.getConfig("warpy").getStringList("lista warpow");
			
		}
		
		
		
	

	}
	
	
	public static boolean isSystemEnable(){
		
		if(Config.getConfig("config").getBoolean("WarpEnable")){
			return true;
		}else{
			
			return false;
		}
		
	}
	
	
	
}
