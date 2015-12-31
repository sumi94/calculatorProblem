import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorAppTest {
    private InputReader inputReader;
    private OutputWriter outputWriter;
    private Parser parser;

    @Before
    public void setUp() {
        inputReader = Mockito.mock(InputReader.class);
        outputWriter = Mockito.mock(OutputWriter.class);
        parser = Mockito.mock(ConsoleParser.class);
    }

    @Test
    public void testAddOfCalculatorIsCalledWhenAdd5CommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator, parser, inputReader, outputWriter);
        calculatorApp.executeCommand("add 5");
        verify(calculator).add(5);
    }
    @Test
    public void testSubtractOfCalculatorIsCalledWhenSubtract5CommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator, parser, inputReader, outputWriter);
        calculatorApp.executeCommand("subtract 5");
        verify(calculator).subtract(5);
    }
    @Test
    public void testMultiplicationOfCalculatorIsCalledWhenMultiply3CommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator, parser, inputReader, outputWriter);
        calculatorApp.executeCommand("multiply 3");
        verify(calculator).multiply(3);
    }

    @Test
    public void testDivisionOfCalculatorIsCalledWhenDivide5CommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator, parser, inputReader, outputWriter);
        calculatorApp.executeCommand("divide 5");
        verify(calculator).divide(5);
    }

    @Test
    public void testCancelOfcalculatorIsCalledWhenCancelCommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator, parser, inputReader, outputWriter);
        calculatorApp.executeCommand("cancel");
        verify(calculator).cancel();
    }

    @Test
    public void testReadingAndWritingToConsole() {
        String data = "add 5\ncancel\nexit";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Calculator calculator = Mockito.mock(Calculator.class);

        CalculatorApp calculatorApp = new CalculatorApp(calculator, parser, inputReader, outputWriter);

//        when(parser.parseInput()).thenReturn("add 5").thenReturn("cancel").thenReturn("exit");

        calculatorApp.run();
        assertEquals("5.0\n0.0\n",outContent.toString());
    }
}
