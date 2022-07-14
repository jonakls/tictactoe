package me.jonakls.tictactoe.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GameTieEvent extends Event {

    private final HandlerList handlers = new HandlerList();
    private final Player player1;
    private final Player player2;

    public GameTieEvent(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayerOne() {
        return player1;
    }

    public Player getPlayerTwo() {
        return player2;
    }

    @Override
    public HandlerList getHandlers() {
        return null;
    }
}
