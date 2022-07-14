package me.jonakls.tictactoe.manager;

import me.jonakls.tictactoe.TicTacToe;
import me.jonakls.tictactoe.api.ManagerLoader;
import me.jonakls.tictactoe.listeners.PlayerInventoryListener;
import org.bukkit.event.Listener;

import java.util.Arrays;
import java.util.List;

public class ListenerLoader implements ManagerLoader {

    private final TicTacToe plugin;

    public ListenerLoader(TicTacToe plugin) {
        this.plugin = plugin;
    }

    @Override
    public void load() {
        List<Listener> listeners = Arrays.asList(
                new PlayerInventoryListener(plugin)
        );

        for(Listener listener : listeners) {
            plugin.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }

    @Override
    public void unload() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void save() {

    }

    @Override
    public void saveAll() {

    }
}
