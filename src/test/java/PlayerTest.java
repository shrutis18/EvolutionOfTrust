import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    Player aPlayer;
    ConsoleReader consoleReader;

    @Before
    public void setUp() {
        consoleReader = new ConsoleReader();
        String name = "Bob";
        aPlayer = new Player(name, consoleReader);
    }

    @After
    public void tearDown() {
        aPlayer = null;
        consoleReader = null;
    }


    @Test
    public void shouldHaveAName() {
        String playerName = aPlayer.getName();
        Assert.assertEquals("Bob", playerName);
    }

    @Test
    public void shouldHaveScore() {
        int score = aPlayer.getScore();
        Assert.assertEquals(0, score);
    }

    @Test
    public void shouldAddScore() {
        aPlayer.addScore(1);
        int score = aPlayer.getScore();
        Assert.assertEquals(1, score);
    }

}
