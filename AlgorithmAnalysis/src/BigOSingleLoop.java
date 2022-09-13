import java.util.ArrayList;

public class BigOSingleLoop {
    public static void main(String[] args) {
        int numberOfOperations=0;
        int n=100000;//size of Data
        int m=500;
        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n);
        // Task 1 Single Loop...................
        startTime=System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Single loop of operations "+numberOfOperations+ " in "+(endTime-startTime)+ " milliseconds");
        // Task 2 Nested Loops...................
        System.out.println("                       TASK 2                  ");
        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n ; j++) {
                numberOfOperations+=1;
            }

        }
        endTime=System.currentTimeMillis();
        System.out.println("Nested loop of operations "+numberOfOperations+ " in "+(endTime-startTime)+ " milliseconds");
        // Task 2 End...................
// ......................................................................................................
        // Task 3 Three Nested Loops...................
        System.out.println("           TASK 3              ");
        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n ; j++) {
                for (int k = 0; k <n ; k++) {
                    numberOfOperations+=1;
                }
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Triple nested loop of operations "+numberOfOperations+ " in "+(endTime-startTime)+ " milliseconds");
        // Task 3 End...................
// ......................................................................................................
        // Task 4 N and M Nested Loops...................
        System.out.println("           TASK 4              ");
        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m ; j++) {
                    numberOfOperations+=1;
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("N*M nested loop of operations "+numberOfOperations+ " in "+(endTime-startTime)+ " milliseconds");
        // Task 4 End...................
        System.out.println("           TASK 5              ");
        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 0; i <n ; i++) {
            numberOfOperations+=1;
        }
            for (int j = 0; j < m ; j++) {
                numberOfOperations+=1;
            }


        endTime=System.currentTimeMillis();
        System.out.println("N+M loop of operations "+numberOfOperations+ " in "+(endTime-startTime)+ " milliseconds");
        // Task 2 End...................
        // Task 5 Logarithmic Complexity...................
        System.out.println("           TASK 5 COmplexity              ");
        numberOfOperations=0;
        startTime=System.currentTimeMillis();
        for (int i = 1; i <n ; i*=2) {
            numberOfOperations+=1;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of logarithmic operations  "+numberOfOperations+ " in "+(endTime-startTime)+ " milliseconds");
       // Task 5 End...................*/
    }
}


