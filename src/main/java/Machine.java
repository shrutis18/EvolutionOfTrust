public class Machine {
    public int[] calculateScore(ValidInput input1, ValidInput input2) {
        if(input1 == input2) {
            return input1 == ValidInput.CHEAT ? new int[] {0,0} : new int[] {2,2};
        }

        return input1 == ValidInput.CHEAT ? new int[] {3,-1} : new int[] {-1,3};
    }


}
