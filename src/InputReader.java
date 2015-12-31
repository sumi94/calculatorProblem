import java.util.Scanner;

public class InputReader{

    private Scanner scanner;

    public InputReader(Scanner scanner) {

        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.nextLine();
    }
}
