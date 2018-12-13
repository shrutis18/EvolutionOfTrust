public class CheatOnlyInput implements IInputStrategy {

    @Override
    public ValidInput getInput() {
        return ValidInput.CHEAT;
    }
}
