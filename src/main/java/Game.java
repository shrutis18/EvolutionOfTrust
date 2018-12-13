public class Game {

    Player player1;
    Player player2;
    Machine machine;
    public Game(Player player1, Player player2) {
        machine = new Machine();
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        int rounds = 0;
        while (rounds < 5) {
            ValidInput input1 = this.player1.generateInput();
            ValidInput input2 = this.player2.generateInput();
            if(input1 == ValidInput.INVALID || input2 == ValidInput.INVALID) {
                System.out.println("Wrong Input received, try again!!");
                continue;
            }
            int[] output = machine.calculateScore(input1, input2);
            this.player1.addScore(output[0]);
            this.player2.addScore(output[1]);
            System.out.println("Player1 Score is"+ this.player1.getScore());
            System.out.println("Player2 Score is"+ this.player2.getScore());
            rounds++;
        }

        Player winner = getWinner();
        System.out.println("Congratulations, " + winner.getName());
    }

    public Player getWinner(){
        return this.player1.getScore() > this.player2.getScore() ? this.player1 : this.player2;
    }


}
