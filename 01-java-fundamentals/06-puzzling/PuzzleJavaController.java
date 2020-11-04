import java.util.ArrayList;

public class PuzzleJavaController{
    public static void main(String[] args){
        PuzzleJava task = new PuzzleJava();
        /*Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)*/
        ArrayList<Integer> printSum = new ArrayList<Integer>();
        printSum = task.totalOfValues();
        System.out.println(printSum);

        /*Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.*/
        ArrayList<String> moreThan5Letters = new ArrayList<String>();
        moreThan5Letters = task.stringArray();
        System.out.println(moreThan5Letters);

        /*Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.*/
        task.alphabetArray();

        //Generate and return an array with 10 random numbers between 55-100.
        //To get a random integer, you can use the nextInt method of the Random class.      
        task.randomNumsInRange();

        //Generate and return an array with 10 random numbers between 55-100 and have it be sorted 
        //(showing the smallest number in the beginning). 
        //Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
        ArrayList<Integer> sortRandom = new ArrayList<Integer>();
        sortRandom = task.generateSortedRandomNumsInRange();
        System.out.println("SORT 10 Random Numbers between 55 and 100, Lowest to Highest:");

        System.out.println(sortRandom);
        //Display the MINIMUM value
        System.out.println("Lowest Value in the SORTED array: " + "" + sortRandom.get(0));//gets the first value in the array
        //Display the MAXIMUM value
        System.out.println("Highest Value in the SORTED array: " + "" + sortRandom.get(sortRandom.size() - 1));//gets the last value in the array

        // //Create a random string that is 5 characters long.
        task.randomString();

        // //Generate an array with 10 random strings that are each 5 characters long
        task.tenRandomStrings();

    }
}
