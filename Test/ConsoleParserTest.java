import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ConsoleParserTest {

    private Calculator calculator;
    private InputReader inputReader;
    private OutputWriter outputWriter;

    @Before
    public void setUp() throws Exception {
        calculator = Mockito.mock(Calculator.class);
        inputReader = Mockito.mock(InputReader.class);
        outputWriter = Mockito.mock(OutputWriter.class);

    }

    @Test
    public void shouldCallCalculatorAddMethodWhenAdd5isPassed() {


        ConsoleParser consoleParser = new ConsoleParser(calculator,inputReader,outputWriter);
        when(inputReader.getInput()).thenReturn("add 5");
        when(calculator.add(5d)).thenReturn(5d);
        consoleParser.parseInput();

        verify(calculator).add(5d);
        verify(outputWriter).print("5.0");
    }
    @Test
    public void shouldCallCalculatorSubtractMethodWhenAdd5isPassed() {


        ConsoleParser consoleParser = new ConsoleParser(calculator,inputReader,outputWriter);
        when(inputReader.getInput()).thenReturn("subtract 5");
        when(calculator.subtract(5d)).thenReturn(-5d);
        consoleParser.parseInput();

        verify(calculator).subtract(5d);
        verify(outputWriter).print("-5.0");
    }

     @Test
    public void shouldCallCalculatorMultipyMethodWhenMultiply5isPassed() {


        ConsoleParser consoleParser = new ConsoleParser(calculator,inputReader,outputWriter);
        when(inputReader.getInput()).thenReturn("multiply 5");
        when(calculator.multiply(5d)).thenReturn(5d);
        consoleParser.parseInput();

        verify(calculator).multiply(5d);
        verify(outputWriter).print("5.0");
    }


}