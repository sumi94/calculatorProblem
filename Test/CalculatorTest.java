import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @org.junit.Test
    public void shouldReturn3When3IsAdded() {
        Calculator calculator=new Calculator();
        assertEquals(3.0,calculator.add(3),0);
    }

    @Test
    public void shouldReturn7Point0When2IsAddedAndThenFive() {
        Calculator calculator = new Calculator();
        calculator.add(2);
        assertEquals(7.0, calculator.add(5), 0);
    }

    @Test
    public void shouldReturnMinus3When3IsSubtracted() {
        Calculator calculator = new Calculator();
        assertEquals(-3.0, calculator.subtract(3), 0);
    }

    @Test
    public void shouldReturn7point0When10IsAddedAndThenSubtractedFrom17point0() {
        Calculator calculator=new Calculator();
        calculator.add(17);
        assertEquals(7.0,calculator.subtract(10), 0);
    }

    @Test
    public void shouldReturn6point0WhenMultiplying3With2() {
        Calculator calculator = new Calculator();
        calculator.add(2);
        assertEquals(6.0, calculator.multiply(3), 0);
    }

    @Test
    public void shouldReturnTwoPointFiveWhenDividing5By2() {
        Calculator calculator = new Calculator();
        calculator.add(5);
        assertEquals(2.5, calculator.divide(2), 0);
    }

    @Test
    public void shouldReturn0When3IsAddedAndCancelIsSelected() {
        Calculator calculator=new Calculator();
        calculator.add(3);
        assertEquals(0,calculator.cancel(), 0);
    }

    @Test
    public void shouldReturn3Point0After3IsAddedWhenCancelIsCalledAfterAdding4() {
        Calculator calculator = new Calculator();
        calculator.add(4);
        calculator.cancel();
        assertEquals(3.0, calculator.add(3), 0);
    }
}
