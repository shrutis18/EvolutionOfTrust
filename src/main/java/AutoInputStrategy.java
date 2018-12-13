public class AutoInputStrategy implements IInputStrategy {
    @Override
    public ValidInput getInput() {
        double randomValue = Math.random();
        if (randomValue < 0.5) {
            return ValidInput.COOPERATE;
        }

        return ValidInput.CHEAT;
    }

}
