import java.util.Scanner;

public class ConsoleReader implements IInputStrategy {

    Scanner scanner;

    public ConsoleReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public ValidInput getInput() {
        return validateInput(scanner.nextLine());
    }

    private ValidInput validateInput(String input1) {
        if(input1.equalsIgnoreCase(ValidInput.CHEAT.toString()))
            return ValidInput.CHEAT;

        else if (input1.equalsIgnoreCase(ValidInput.COOPERATE.toString()))
            return ValidInput.COOPERATE;

        return ValidInput.INVALID;
    }
}
