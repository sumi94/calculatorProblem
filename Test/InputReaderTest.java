import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class InputReaderTest {

    @Test
    public void shouldReturnadd5WhenAnInputIsGivenFromScanner() {

        String data = "add 5";
        System.setIn(new ByteArrayInputStream(data.getBytes()));

        InputReader inputReader = new InputReader(new Scanner(System.in));
        assertEquals("add 5",inputReader.getInput());
    }



}