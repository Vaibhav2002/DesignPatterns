package observer;

import java.util.Observable;

public class Game extends Observable {

    public void addPlayer(Player player) {
        addObserver(player);
        notifyPlayers(player);
    }

    public void increaseScore(Player player) {
        deleteObserver(player);
        player.score++;
        addObserver(player);
        notifyPlayers(player);
    }

    public void notifyPlayers(Player player) {
        setChanged();
        notifyObservers(player);
    }
}
