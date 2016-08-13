package me.nexciak.xcommands.utils;

import net.md_5.bungee.api.ChatColor;

public class StringUtils {

    public static String colored(String text){
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
