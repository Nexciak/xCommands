package me.nexciak.xcommands.commands;

import me.nexciak.xcommands.utils.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdKill implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String args2, String[] args) {
        if(cmd.getName().equalsIgnoreCase("kill")){
            if(args.length == 0){
        	if(!(sender instanceof Player)){
        		sender.sendMessage(StringUtils.colored("&4Blad &3| &cMusisz byc na serwerze"));
        		return true;
        		}
        	}
            if(sender.hasPermission("xcommands.kill")){
                if(args.length == 0){
                	if(sender instanceof Player){
                    Player p = (Player) sender;
                    p.setHealth(0);
                    p.sendMessage(StringUtils.colored("&6Kill &3| &aZabiles sie"));
                	} else{
                		sender.sendMessage(StringUtils.colored("&4Blad &3| &cMusisz byc na serwerze"));
                	}
                }
                if(args.length == 1){
                    Player cel = Bukkit.getPlayer(args[0]);
                    if(!(Bukkit.getPlayer(args[0]) != null)){
                        sender.sendMessage(StringUtils.colored("&4Blad &3| &cGracza &a" + args[0] + " &cnie ma na serwerze"));
                        return true;
                    }
                    cel.setHealth(0);
                    sender.sendMessage(StringUtils.colored("&6Kill &3| &aZabiles gracza &c" + cel.getName()));
                    cel.sendMessage(StringUtils.colored("&6Kill &3| &cZostales zabity przez &a" + sender.getName()));
                }
            } else{
                sender.sendMessage(StringUtils.colored("&4Blad &3| &cNie masz uprawnien"));
            }
        }
        return false;
    }
}
