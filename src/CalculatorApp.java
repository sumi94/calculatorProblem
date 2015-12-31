import java.util.Scanner;

public class CalculatorApp {
    private Calculator calculator;
    private Parser parser;

    public CalculatorApp(Calculator calculator, Parser parser, InputReader inputReader, OutputWriter outputWriter) {


        this.calculator = calculator;
        this.parser = parser;
    }



    public double executeCommand(String command) {

        String[] commands = command.split(" ");
        if(commands[0].equals("cancel")){
            return calculator.cancel();
        }
        double operand = Double.parseDouble(commands[1]);
        if(commands[0].equals("add")){
            return calculator.add(operand);
        }
         if(commands[0].equals("subtract")){
            return calculator.subtract(operand);
        }
        if(commands[0].equals("multiply")){
            return calculator.multiply(operand);
        }
        if(commands[0].equals("divide")){
            return calculator.divide(operand);
        }

        return 0.0;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
//        CalculatorApp calculatorApp = new CalculatorApp(calculator, new ConsoleParser(new Scanner(System.in)));
//        calculatorApp.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        String line = null;
        while (!(line = scanner.nextLine()).equals("exit")) {
            System.out.println(executeCommand(line));
        }
    }
}
