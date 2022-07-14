package me.jonakls.tictactoe;

import com.google.gson.Gson;
import org.bukkit.plugin.java.JavaPlugin;

public class TicTacToe extends JavaPlugin {

    private final Gson gson = new Gson();

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();


        getLogger().info("TicTacToe has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("TicTacToe has been disabled!");
    }

    public Gson getGson() {
        return gson;
    }
}
