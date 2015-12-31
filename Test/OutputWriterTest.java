import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class OutputWriterTest {
    @Test
    public void shouldPrintOut5() {
        PrintStream printStream = Mockito.mock(PrintStream.class);
        OutputWriter outputWriter = new OutputWriter(printStream);

        outputWriter.print("5.0");
        verify(printStream).append("5.0");
    }
}
