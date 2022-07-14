package me.jonakls.tictactoe.api;

import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;
import java.util.UUID;

public class GameUser {

    private final String name;
    private final UUID uuid;
    private int wins;
    private int losses;
    private int ties;
    private int gamesPlayed;

    public GameUser(@NotNull String name, @NotNull UUID uuid) {
        this.name = name;
        this.uuid = uuid;
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
        this.gamesPlayed = 0;
    }

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(";");
        joiner.add(name);
        joiner.add(uuid.toString());
        joiner.add(Integer.toString(wins));
        joiner.add(Integer.toString(losses));
        joiner.add(Integer.toString(ties));
        joiner.add(Integer.toString(gamesPlayed));
        return joiner.toString();
    }
}
