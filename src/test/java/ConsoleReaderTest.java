import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class ConsoleReaderTest {

    IInputStrategy consoleReader;

    @Before
    public void setUp() throws Exception {
        String testInput = "cheat";
        System.setIn(new ByteArrayInputStream(testInput.getBytes()));
        consoleReader = new ConsoleReader();
    }

    @After
    public void tearDown() throws Exception {
        consoleReader = null;
        System.setOut(System.out);
        System.setIn(System.in);
    }

    @Test
    public void shouldReadInputFromConsole() {
        Assert.assertEquals(ValidInput.CHEAT,  consoleReader.getInput());
    }
}