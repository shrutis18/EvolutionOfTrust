import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MachineTest {
    Machine machine;


    @Before
    public void setUp() throws Exception {
        machine = new Machine();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldBeAbleToCalculateScoreWithSameInput_cheat() {
        ValidInput input1 = ValidInput.CHEAT;
        ValidInput input2 = ValidInput.CHEAT;
        int[] output = machine.calculateScore(input1, input2);
        int expectedOutput [] = {0,0};
        Assert.assertEquals(expectedOutput[0], output[0]);
        Assert.assertEquals(expectedOutput[1], output[1]);
    }

    @Test
    public void shouldBeAbleToCalculateScoreWithSameInput_cooperate() {
        ValidInput input1 = ValidInput.COOPERATE;
        ValidInput input2 = ValidInput.COOPERATE;
        int[] output = machine.calculateScore(input1, input2);
        int expectedOutput [] = {2,2};
        Assert.assertEquals(expectedOutput[0], output[0]);
        Assert.assertEquals(expectedOutput[1], output[1]);
    }

    @Test
    public void shouldBeAbleToCalculateScoreWithDiffInput_cheat_cooperate() {
        ValidInput input1 = ValidInput.CHEAT;
        ValidInput input2 = ValidInput.COOPERATE;
        int[] output = machine.calculateScore(input1, input2);
        int expectedOutput [] = {3,-1};
        Assert.assertEquals(expectedOutput[0], output[0]);
        Assert.assertEquals(expectedOutput[1], output[1]);
    }

    @Test
    public void shouldBeAbleToCalculateScoreWithDiffInput_cooperate_cheat() {
        ValidInput input1 = ValidInput.COOPERATE;
        ValidInput input2 = ValidInput.CHEAT;
        int[] output = machine.calculateScore(input1, input2);
        int expectedOutput [] = {-1,3};
        Assert.assertEquals(expectedOutput[0], output[0]);
        Assert.assertEquals(expectedOutput[1], output[1]);
    }
}
