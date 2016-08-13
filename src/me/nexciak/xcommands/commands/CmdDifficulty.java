package me.nexciak.xcommands.commands;

import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.nexciak.xcommands.utils.StringUtils;

public class CmdDifficulty implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if(cmd.getName().equalsIgnoreCase("defficulty")){
			if(sender.hasPermission("xcommands.difficulty")){
				
				args[0] = args[0].replaceAll(String.valueOf(0), "Peaceful");
				args[0] = args[0].replaceAll(String.valueOf(1), "Easy");
				args[0] = args[0].replaceAll(String.valueOf(2), "Normal");
				args[0] = args[0].replaceAll(String.valueOf(3), "Hard");
				
				if(!(args.length == 1)){
					sender.sendMessage(StringUtils.colored("&6Difficulty &3| &aUzyj &c/dif <tryb>"));
					sender.sendMessage(StringUtils.colored("&c&m----------------------------"));
					sender.sendMessage(StringUtils.colored("&3» &aPeaceful &3| &70"));
					sender.sendMessage(StringUtils.colored("&3» &aEasy &3| &71"));
					sender.sendMessage(StringUtils.colored("&3» &aNormal &3| &72"));
					sender.sendMessage(StringUtils.colored("&3» &aHard &3| &73"));
					return true;
				}
				if(args.length == 1){
					if(args[0].equalsIgnoreCase("peaceful") || args[0].equalsIgnoreCase("0")){
					World w = ((Player) sender).getWorld();
					w.setDifficulty(Difficulty.PEACEFUL);
					sender.sendMessage(StringUtils.colored("&6Difficulty &3| &aZmieniono na tryb &c" + args[0]));
					}
					if(args[0].equalsIgnoreCase("easy") || args[0].equalsIgnoreCase("1")){
					World w = ((Player) sender).getWorld();
					w.setDifficulty(Difficulty.EASY);
					sender.sendMessage(StringUtils.colored("&6Difficulty &3| &aZmieniono na tryb &c" + args[0]));
					}
					if(args[0].equalsIgnoreCase("normal") || args[0].equalsIgnoreCase("2")){
					World w = ((Player) sender).getWorld();
					w.setDifficulty(Difficulty.NORMAL);
					sender.sendMessage(StringUtils.colored("&6Difficulty &3| &aZmieniono na tryb &c" + args[0]));
					}
					if(args[0].equalsIgnoreCase("hard") || args[0].equalsIgnoreCase("3")){
					World w = ((Player) sender).getWorld();
					w.setDifficulty(Difficulty.HARD);
					sender.sendMessage(StringUtils.colored("&6Difficulty &3| &aZmieniono na tryb &c" + args[0]));
					}
				} else{
					sender.sendMessage(StringUtils.colored("&6Difficulty &3| &aUzyj &c/dif <tryb>"));
					sender.sendMessage(StringUtils.colored("&c&m----------------------------"));
					sender.sendMessage(StringUtils.colored("&3» &aPeaceful &3| &70"));
					sender.sendMessage(StringUtils.colored("&3» &aEasy &3| &71"));
					sender.sendMessage(StringUtils.colored("&3» &aNormal &3| &72"));
					sender.sendMessage(StringUtils.colored("&3» &aHard &3| &73"));
					return true;
				}
			} else{
				sender.sendMessage(StringUtils.colored("&4Blad &3| &cNie masz uprawnien"));
			}
		}
		return false;
	}
}
