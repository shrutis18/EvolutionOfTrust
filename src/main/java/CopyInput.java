public class CopyInput implements IInputStrategy {
    ValidInput storedInput = ValidInput.COOPERATE;

    public CopyInput(Player player2) {
        player2.register(this);
    }

    public void storeInput(ValidInput input) {
        this.storedInput = input;
    }

    @Override
    public ValidInput getInput() {
        return this.storedInput;
    }
}
