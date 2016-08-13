package me.nexciak.xcommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.nexciak.xcommands.utils.StringUtils;

public class CmdGamemode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if(cmd.getName().equalsIgnoreCase("gm")){
			if(sender.hasPermission("xcommands.gm")){
				if(args.length == 0){
					sender.sendMessage(StringUtils.colored("&6GameMode &3| &aUzyj &c/gm <tryb>"));
					sender.sendMessage(StringUtils.colored("&c&m----------------------------"));
					sender.sendMessage(StringUtils.colored("&3» &aSurvival &3| &71"));
					sender.sendMessage(StringUtils.colored("&3» &aCreative &3| &72"));
					sender.sendMessage(StringUtils.colored("&3» &aAdventure &3| &73"));
					sender.sendMessage(StringUtils.colored("&3» &aSpectator &3| &74"));
					return true;
				}
				if(args.length == 1){
					if(sender instanceof Player){
						if(args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("1")){
							((Player) sender).setGameMode(GameMode.SURVIVAL);
							sender.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0]));
							return true;
						}
						if(args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("2")){
							((Player) sender).setGameMode(GameMode.CREATIVE);
							sender.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0]));
							return true;
						}
						if(args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("3")){
							((Player) sender).setGameMode(GameMode.ADVENTURE);
							sender.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0]));
							return true;
						}
						if(args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("4")){
							((Player) sender).setGameMode(GameMode.SPECTATOR);
							sender.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0]));
							return true;
						}
					} else{
						sender.sendMessage(StringUtils.colored("&4Blad &3| &cMusisz byc na serwerze"));
						return true;
					}
				}
					if(args.length == 2){
						if(!(Bukkit.getPlayer(args[1]) !=null)){
							sender.sendMessage(StringUtils.colored("&4Blad &3| &cGracza &a" + args[1] + " &cnie ma na serwerze"));
							return true;	
						}
						Player p = Bukkit.getPlayer(args[1]);
						if(args[0].equalsIgnoreCase("survival") || args[0].equalsIgnoreCase("1")){
							p.setGameMode(GameMode.SURVIVAL);
							p.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0] + " &aprzez &9" + sender.getName()));
							sender.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0] + " &adla &9" + sender.getName()));
							return true;
						}
						if(args[0].equalsIgnoreCase("creative") || args[0].equalsIgnoreCase("2")){
							p.setGameMode(GameMode.CREATIVE);
							p.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0] + " &aprzez &9" + sender.getName()));
							sender.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0] + " &adla &9" + sender.getName()));
							return true;
						}
						if(args[0].equalsIgnoreCase("adventure") || args[0].equalsIgnoreCase("3")){
							p.setGameMode(GameMode.ADVENTURE);
							p.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0] + " &aprzez &9" + sender.getName()));
							sender.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0] + " &adla &9" + sender.getName()));
							return true;
						}
						if(args[0].equalsIgnoreCase("spectator") || args[0].equalsIgnoreCase("4")){
							p.setGameMode(GameMode.SPECTATOR);
							p.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0] + " &aprzez &9" + sender.getName()));
							sender.sendMessage(StringUtils.colored("&6GameMode &3| &aUstawiono tryb &c" + args[0] + " &adla &9" + sender.getName()));
							return true;
						}
					}
			} else{
				sender.sendMessage(StringUtils.colored("&4Blad &3| &cNie masz uprawnien"));
			}
		}
		return false;
	}
	
	

}
