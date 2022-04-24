package observer;

public class Runner {
    public static void main(String[] args) {
        Game game = new Game();
        Player knight = new Knight(game), queen = new Queen(game);
        knight.move();
        queen.move();
    }
}
