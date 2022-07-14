package me.jonakls.tictactoe.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GameWinEvent extends Event {

    private final HandlerList handlers = new HandlerList();
    private final Player winner;
    private final Player loser;

    public GameWinEvent(Player winner, Player loser) {
        this.winner = winner;
        this.loser = loser;
    }

    public Player getWinner() {
        return winner;
    }

    public Player getLoser() {
        return loser;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
