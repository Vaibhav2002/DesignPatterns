package observer;

import java.util.Observable;
import java.util.Observer;

public class Knight extends Player {
    Knight(Game game) {
        super.game = game;
        setName("Knight");
        game.addPlayer(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        var player = (Player) arg;
        System.out.println("Knight: "+player.name);
    }

    @Override
    void printAbility() {
        System.out.println("This is Knight");
    }

}
