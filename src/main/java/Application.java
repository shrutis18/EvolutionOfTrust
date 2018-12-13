public class Application {
    public static void main(String[] args) {
        Game game = new Game(
                new Player("Shruti", ()->ValidInput.CHEAT),
                new Player("Ankit", new ConsoleReader()));
        game.startGame();
    }
}
