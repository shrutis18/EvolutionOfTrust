import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    Game game;

    @Mock
    Player mockPlayer1;

    @Mock
    Player mockPlayer2;

    @Before
    public void setUp() throws Exception {
        Mockito.when(mockPlayer1.generateInput()).thenReturn(ValidInput.CHEAT).thenReturn(ValidInput.CHEAT).thenReturn(ValidInput.CHEAT).thenReturn(ValidInput.COOPERATE).thenReturn(ValidInput.COOPERATE);
        Mockito.when(mockPlayer2.generateInput()).thenReturn(ValidInput.COOPERATE).thenReturn(ValidInput.CHEAT).thenReturn(ValidInput.COOPERATE).thenReturn(ValidInput.COOPERATE).thenReturn(ValidInput.CHEAT);
        Mockito.when(mockPlayer1.getScore()).thenReturn(3).thenReturn(3).thenReturn(6).thenReturn(8).thenReturn(10).thenReturn(10);
        Mockito.when(mockPlayer2.getScore()).thenReturn(-1).thenReturn(-1).thenReturn(-2).thenReturn(0).thenReturn(2).thenReturn(2);
        Mockito.when(mockPlayer1.getName()).thenReturn("Ankit");
        Mockito.when(mockPlayer2.getName()).thenReturn("Shruti");
        game = new Game(mockPlayer1, mockPlayer2);
    }

    @After
    public void tearDown() throws Exception {
        game = null;
        mockPlayer1 = null;
        mockPlayer2 = null;
    }

    @Test
    public void shouldShowWinnerGame() {
        game.startGame();
        Assert.assertEquals(mockPlayer1, game.getWinner());
        Assert.assertEquals("Ankit", game.getWinner().getName());
    }


}
