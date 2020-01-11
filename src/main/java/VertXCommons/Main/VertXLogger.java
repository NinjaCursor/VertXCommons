package VertXCommons.Main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class VertXLogger {

    private static String prefix = "[  ]: ";

    public static void log(String message) {
        Bukkit.getLogger().info(prefix + message);
    }

    public static void error(String message) {
        log(ChatColor.RED + message);
    }

    public static void warning(String message) {
        log(ChatColor.YELLOW + message);
    }

}
