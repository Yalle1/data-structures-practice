public class BigONotations {

    public static void main(String[] args) {

        int numberOfOperations = 0;
        int n = 1000; // size of data
        long startTime;
        long endTime;
        System.out.println("Input size n is = "+ n);

        // Task 1 Single Loop ------> O(n)

        startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++){
            numberOfOperations += 1;
        }

        endTime = System.currentTimeMillis();

        System.out.println("Number of operations: "+numberOfOperations + " in "+(endTime-startTime)+" milliseconds");

        //---------------------------------------------------------------------------------------------------------

        // Task 2 Nested Loop

        numberOfOperations = 0;

        startTime = System.currentTimeMillis();

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {
                numberOfOperations += 1;
            }

        }

        endTime = System.currentTimeMillis();

        System.out.println("Number of operations with nested loop: "+numberOfOperations + " in "+(endTime-startTime)+" milliseconds");

        //---------------------------------------------------------------------------------------------------------

        // Task 3 Three Nested Loops
        numberOfOperations = 0;

        startTime = System.currentTimeMillis();

        for (int k = 0; k < n; k++) {

            for (int j = 0; j < n; j++) {

                for (int i = 0; i < n; i++) {
                    numberOfOperations += 1;
                }

            }
        }

        endTime = System.currentTimeMillis();

        System.out.println("Number of operations with 3 nested loop: "+numberOfOperations + " in "+(endTime-startTime)+" milliseconds");


        

    }
}
