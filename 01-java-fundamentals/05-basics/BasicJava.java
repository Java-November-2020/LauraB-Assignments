import java.util.Arrays;
import java.util.ArrayList;

public class BasicJava{
    public static void main(String[] args){
        int[] numbers = new int[255];
        for(int num = 0; num < numbers.length; num++){
            numbers[num] = num + 1;
        }
        System.out.println("\n***********Print 1-255*************\n");
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        System.out.println("\n***********Print odd numbers between 1-255*************\n");
        int[] numbers2 = new int[256];
        for(int a = 1; a < numbers2.length; a++){
            if(a % 2 != 0){
                System.out.print(a + " ");
            }
        }

        System.out.println("\n***********Print Sum*************\n");
        int[] printSum = new int[256];
        int sum = 0;

        for(int i = 0; i < printSum.length; i++){
            System.out.print("New number: " + i + "    ");
            sum = i + sum;
            System.out.println("Sum: " + sum);
        }

        System.out.println("\n***********Iterating through an array*************\n");
        ArrayList<Integer> iterateArray = new ArrayList<Integer>();
        iterateArray.add(1);
        iterateArray.add(3);
        iterateArray.add(5);
        iterateArray.add(7);
        iterateArray.add(9);
        iterateArray.add(13);

        System.out.println("The values added to the array are:  ");
        for (int x : iterateArray){
            System.out.print(x + " ");
        }



        System.out.println("\n\n***********Find Max*************\n");

        int findMaxArray[] = {89, -32, -2, -234, 0, 28};
        Arrays.sort(findMaxArray);
    
        System.out.println("Maximum value in the array is = " + findMaxArray[findMaxArray.length - 1]);		


        System.out.println("\n***********Get Average*************\n");
        double averageArray[] = {120, 75.82, 245, 6};
        double total = 0.0;

        for (double nmbr : averageArray) {
            total += nmbr;
        }

        double average = total / averageArray.length;
        System.out.println("The average of the values in the array is:  " + average);


        System.out.println("\n***********Array with Odd Numbers*************\n");

        ArrayList<Integer> oddNumbersArray = new ArrayList<Integer>();
        for(int o = 0; o <= 255; o++){
            if(o % 2 != 0){
                oddNumbersArray.add(o);
                System.out.print(o + " ");
            }
        }            
        // return oddNumbersArray;

        System.out.println("\n***********Greater Than Y*************\n");
        int greaterThanY[] = {1, 3, 5, 7};
        int count = 0;
        int y = 3;
		for(int num7 : greaterThanY) {
			if(num7 > y){
                count++;
            }
        }
        System.out.println("Number of values greater than Y: " + count);


        System.out.println("\n***********Square the values*************\n");
        int squareVals[] = {1, 5, 10, -2};
        System.out.println("The square of the values in the array are: ");
		for(int v = 0; v < squareVals.length; v++) {
            squareVals[v] = squareVals[v] * squareVals[v];
            System.out.println(squareVals[v] + " ");
        }

        System.out.println("\n***********Eliminate Negative Numbers*************\n");

        System.out.println("Negative values have been changed to 0:");

        int negNums[] = {1, 5, -100, 10, -2, 6};

		for(int n = 0; n < negNums.length; n++) {
            if(negNums[n] < 0){
                negNums[n] = 0;
            }
            System.out.println(negNums[n] + " ");
        }


        System.out.println("\n\n***********Max, Min, and Average*************\n");

        int minMaxAvg[] = {1, 5, 10, -2};

        double result = 0.0;
        for(double val8 : minMaxAvg){
            result = result + val8;
        }
        double avg = result / minMaxAvg.length;
        Arrays.sort(minMaxAvg);

        System.out.println("Minimum: " + minMaxAvg[0]);
        System.out.println("Maximum: " + minMaxAvg[minMaxAvg.length - 1]);
        System.out.println("Average: " + avg);


        System.out.println("\n***********Shifting the Values in the Array*************\n");
        ArrayList<Integer> shiftPosition = new ArrayList<Integer>(Arrays.asList(1, 5, 10, 7, -2));
        int done = 0;
        System.out.println("Current Array set: " + shiftPosition);

        for (int h = 0; h <= shiftPosition.size() - 1; h++){
            if (h == shiftPosition.size() - 1){
                shiftPosition.set(h, 0);
            }
            else{
                done = shiftPosition.get(h + 1);
                shiftPosition.set(h, done);
            }
        }
        System.out.println("Array after shift: " + shiftPosition);

    }
}








