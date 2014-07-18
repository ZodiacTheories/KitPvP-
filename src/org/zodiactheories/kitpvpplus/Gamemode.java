package org.zodiactheories.kitpvpplus;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("You can't switch gamemodes!");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("kpgamemode")) {
			if(args.length == 0) {
				p.sendMessage(ChatColor.RED + "Correct Usage: /kpgamemode <gamemode number>.");
			}
			else if(args.length == 1) {
				p.sendMessage(ChatColor.RED + "Correct Usage: /kpgamemode <gamemode number>.");
			}
			else if(args.length == 2) {
				if(p.hasPermission("kp.gamemode"))
				try {
				int gamemode = Integer.parseInt(args[1]);
				if(gamemode == 0) {
					p.setGameMode(GameMode.SURVIVAL);
					p.sendMessage(ChatColor.GREEN + "Gamemode is now survival!");
				}
				else if(gamemode == 1) {
					p.setGameMode(GameMode.CREATIVE);
					p.sendMessage(ChatColor.GREEN + "Gamemode is now creative!");
				}
				else if(gamemode == 2) {
					p.setGameMode(GameMode.ADVENTURE);
					p.sendMessage(ChatColor.GREEN + "Gamemode is now adventure!");
				}
			}
				catch(NumberFormatException e) {
					p.sendMessage(ChatColor.RED + "Invalid Gamemode!");
				}
			}
		}
		return true;
	}
}
