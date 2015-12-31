import java.io.PrintStream;

public class OutputWriter {
    private PrintStream printStream;

    public OutputWriter(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void print(String output) {
        printStream.append(output);
    }
}
