import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CalculatorAppTest {
    @Test
    public void testAddOfCalculatorIsCalledWhenAdd5CommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator);
        calculatorApp.executeCommand("add 5");
        verify(calculator).add(5);
    }
    @Test
    public void testSubtractOfCalculatorIsCalledWhenSubtract5CommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator);
        calculatorApp.executeCommand("subtract 5");
        verify(calculator).subtract(5);
    }
    @Test
    public void testMultiplicationOfCalculatorIsCalledWhenMultiply3CommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator);
        calculatorApp.executeCommand("multiply 3");
        verify(calculator).multiply(3);
    }

    @Test
    public void testDivisionOfCalculatorIsCalledWhenDivide5CommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator);
        calculatorApp.executeCommand("divide 5");
        verify(calculator).divide(5);
    }

    @Test
    public void testCancelOfcalculatorIsCalledWhenCancelCommandIsGiven() {
        Calculator calculator = Mockito.mock(Calculator.class);
        CalculatorApp calculatorApp = new CalculatorApp(calculator);
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
        CalculatorApp calculatorApp = new CalculatorApp(calculator);

        when(calculator.add(5)).thenReturn(5.0);
        when(calculator.cancel()).thenReturn(0.0);

        calculatorApp.run();
        assertEquals("5.0\n0.0\n",outContent.toString());
    }
}
