package me.jonakls.tictactoe.listeners;

import me.jonakls.tictactoe.TicTacToe;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerInventoryListener implements Listener {

    private final TicTacToe plugin;

    public PlayerInventoryListener(TicTacToe plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    private void handleInventoryClick(InventoryClickEvent event) {
        if (event.getInventory().getName().equals("TicTacToe")) {
            event.setCancelled(true);
        }
    }




}
