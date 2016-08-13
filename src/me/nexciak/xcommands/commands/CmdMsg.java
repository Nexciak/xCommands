package me.nexciak.xcommands.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.nexciak.xcommands.utils.StringUtils;

public class CmdMsg implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if(cmd.getName().equalsIgnoreCase("msg")){
			if(sender.hasPermission("xcommands.msg")){
				if(sender instanceof Player){
					if(args.length == 0 || args.length == 1){
						sender.sendMessage(StringUtils.colored("&6Msg &3| &aUzyj &c/msg <gracz> <wiadomosc>"));
						return true;
					}
					if(args.length >= 2){
						if(Bukkit.getPlayer(args[0]) !=null){
							String msg = "";
							for (int i = 1; i < args.length; ++i) {
								msg = String.valueOf(msg) + args[i] + " ";
							}
							Player p = (Player) sender;
							Player cel = Bukkit.getPlayer(args[0]);
							p.sendMessage(StringUtils.colored("&6Msg &3| &7● &a" + args[0] + " &3» &e" + msg));
							cel.sendMessage(StringUtils.colored("&6Msg &3| &c● &a" + args[0] + " &3» &e" + msg));
						} else{
							sender.sendMessage(StringUtils.colored("&4Blad &3| &cGracza &a" + args[0] + "&c nie ma na serwerze"));
						}
					}
				} else{
					sender.sendMessage(StringUtils.colored("&4Blad &3| &cMusisz byc na serwerze"));
				}
			}
		}
		return false;
	}
	
	

}
