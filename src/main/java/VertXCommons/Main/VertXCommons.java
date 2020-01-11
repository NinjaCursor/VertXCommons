package VertXCommons.Main;

import VertXCommons.Listeners.LogInListener;
import VertXCommons.Storage.SQLPool;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class VertXCommons extends JavaPlugin {

    private static JavaPlugin plugin;

    public static JavaPlugin getPlugin() {
        return plugin;
    }

    public static void setPlugin(JavaPlugin other) {
        plugin = other;
    }

    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {
        SQLPool.close();
    }
}
