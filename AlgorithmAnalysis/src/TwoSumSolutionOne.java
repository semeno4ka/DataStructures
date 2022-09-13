import java.util.Arrays;

public class TwoSumSolutionOne {
    public static void main(String[] args) {
        int[] array =new int[]{4,7,2,11};
        System.out.println(Arrays.toString(twoSumSolution(array,9)));

        /*
        -sorted?
        -duplicates?
         */


    }
    //Bruteforce solution
    public static int[] twoSumSolution(int[] array, int targetValue){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 1; j <array.length ; j++) {
                if (i != j) {
                    if (array[i] + array[j] == targetValue) {
                        return new int[]{i, j};
                    }
                }
            }
        }
     return new int[]{};
    }

}
