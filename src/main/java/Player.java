public class Player {
    private final String name;
    private IInputStrategy inputStrategy;
    private int score;
    private CopyInput copyInput;

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
        ValidInput input = inputStrategy.getInput();
        storeInput(input);
        return input;
    }

    public void storeInput(ValidInput input) {
        if(copyInput != null) {
            copyInput.storeInput(input);
        }
    }

    public void register(CopyInput copyInput) {
        this.copyInput = copyInput;
    }
}
