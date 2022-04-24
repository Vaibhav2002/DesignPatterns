package observer;

import java.util.Observable;
import java.util.Observer;

public abstract class Player implements Observer {
    Game game;
    int score = 0;
    String name = "";

    void setName(String name){
        this.name = name;
    }

    void printName(){
        System.out.println(name);
    }

    abstract void printAbility();

    void move(){
        game.increaseScore(this);
    }

}
