import java.util.Scanner;

public class ConsoleParser implements Parser {
    private Calculator calculator;
    private InputReader inputReader;
    private OutputWriter outputWriter;

    public ConsoleParser(Scanner scanner) {
    }

    public ConsoleParser(Calculator calculator, InputReader inputReader, OutputWriter outputWriter) {

        this.calculator = calculator;
        this.inputReader = inputReader;
        this.outputWriter = outputWriter;
    }


    @Override
    public void parseInput() {

        String command = inputReader.getInput();
        String[] commands = command.split(" ");
        if(commands[0].equals("cancel")){
            outputWriter.print(String.valueOf(calculator.cancel()));
        }
        double operand = Double.parseDouble(commands[1]);
        if(commands[0].equals("add")){
            outputWriter.print(String.valueOf(calculator.add(operand)));
        }
        if(commands[0].equals("subtract")){
            outputWriter.print(String.valueOf(calculator.subtract(operand)));
        }
        if(commands[0].equals("multiply")){
            outputWriter.print(String.valueOf(calculator.multiply(operand)));
        }
        if(commands[0].equals("divide")){
            outputWriter.print(String.valueOf(calculator.divide(operand)));
        }

    }
}
