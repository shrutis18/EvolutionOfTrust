public class Player {
    private final String name;
    private final IInputStrategy inputStrategy;
    private int score;

    public Player(String name, IInputStrategy inputStrategy) {
        this.name = name;
        this.score = 0;
        this.inputStrategy = inputStrategy;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    // TODO: Need to confirm whether it should be here
    public void addScore(int score) {
        this.score += score;
    }

    public ValidInput generateInput(){
        return inputStrategy.getInput();
    }
}
