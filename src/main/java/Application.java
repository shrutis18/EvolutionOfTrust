public class Application {
    public static void main(String[] args) {
        Player player2 = new Player("Ankit", new ConsoleReader());
        Player player1 = new Player("Shruti", new CopyInput(player2));
        Game game = new Game(
                player1,
                player2);
        game.startGame();
    }
}
