import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

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
}
