package observer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Queen extends Player{
    Queen(Game game){
        super.game = game;
        setName("Queen");
        game.addPlayer(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        var player = (Player) arg;
        System.out.println("Queen: "+player.name);
    }

    @Override
    void printAbility() {
        System.out.println("This is Queen");
    }

}
