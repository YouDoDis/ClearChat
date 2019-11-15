public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
       
        if (cmd.getName().equalsIgnoreCase("clearchat")) {
            if (sender instanceof Player && !sender.hasPermission("clearchat.clear")) {
                sender.sendMessage(cc("&4You do not have access to that command."));
                return true;
            }
            	
               
            	  for (int i = 0; i < 100; i++) {
                      Bukkit.broadcastMessage("");
                      
            	  }
              
               
                Bukkit.broadcastMessage(cc("&b|-------------------+====+-------------------|"));
                Bukkit.broadcastMessage(cc("&c&lThe chat has been cleared by a staff member."));
                Bukkit.broadcastMessage(cc("&b|-------------------+====+-------------------|"));
               
                return true;
               
            }
           
        return false;
}
       
public String cc(String msg) { return ChatColor.translateAlternateColorCodes('&', msg); } 
 
}
