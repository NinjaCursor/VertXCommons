package VertXCommons.Listeners;

import VertXCommons.Main.VertXCommons;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.EventHandler;

import java.util.UUID;

public class LogInListener implements Listener {

    @EventHandler
    public void onLogin(PlayerLoginEvent event) {
        Player player = event.getPlayer();
        UUID uuid = player.getUniqueId();
        VertXCommons.getLog().log("Login detected!");
    }
}
