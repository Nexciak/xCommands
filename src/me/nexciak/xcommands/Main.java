package me.nexciak.xcommands;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.nexciak.xcommands.commands.CmdDifficulty;
import me.nexciak.xcommands.commands.CmdGamemode;
import me.nexciak.xcommands.commands.CmdKill;
import me.nexciak.xcommands.commands.CmdMsg;
import me.nexciak.xcommands.utils.StringUtils;

public class Main extends JavaPlugin {

    @Override
    public void onDisable() {

    }

    @Override
    public void onEnable() {
    	registerCommands();
        Bukkit.getServer().getConsoleSender().sendMessage(StringUtils.colored("&6xCommands &3| &aWlaczanie..."));
        Bukkit.getServer().getConsoleSender().sendMessage(StringUtils.colored("&c&m------------------------"));
    }
    
    private void registerCommands(){
        getCommand("kill").setExecutor(new CmdKill());
        getCommand("gm").setExecutor(new CmdGamemode());
        getCommand("difficulty").setExecutor(new CmdDifficulty());
        getCommand("msg").setExecutor(new CmdMsg());
    }
}
