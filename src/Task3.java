import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //problem 1
        //find maximum value
        int[] values = {2, 6, 11, 20, 3, 7, 18};
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if(values[i] > max){
                //values[i] -- values of index
                max = values[i];
            }
        }
        System.out.println(("The maximum value of the values is:  " + max));

        //problem 2
        //find minimum value
        int[] array1 = {2, 6, 11, 20, 3, 7, 18};
        int min = values[0];
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] <  min){
                min = array1[i];
            }
        }
        System.out.println(("The minimum value of the values is:  " + min));

        //problem 3
/*        int[] input = {2,6,11,20,3,7,18};
        int pivotalValue = 10;

        List<Integer> minArray = new ArrayList<>();
        List<Integer> maxArray = new ArrayList<>();

        for(int value : input) {
            if(value <= pivotalValue){
                minArray.add(value);
            } else {
                maxArray.add(value);
            }
        }

        System.out.println("Min values:  " + minArray);
        System.out.println("Max values:  " + maxArray);*/


        //prob 3
        // Count the number of elements for each array
        int[] input = {2,6,11,20,3,7,18};
        int pivotalValue = 10;

        int minCount = 0, maxCount = 0;

        for (int value : input) {
            if (value <= pivotalValue) {
                minCount++;
            } else {
                maxCount++;
            }
        }

        // Initialize arrays with determined sizes
        int[] minArray = new int[minCount];
        int[] maxArray = new int[maxCount];

        // Populate the arrays
        int minIndex = 0, maxIndex = 0;

        for (int value : input) {
            if (value <= pivotalValue) {
                minArray[minIndex++] = value;
            } else {
                maxArray[maxIndex++] = value;
            }
        }

        // Print the results
        System.out.println("Min values: " + Arrays.toString(minArray));
        System.out.println("Max values: " + Arrays.toString(maxArray));


        //Problem 4
        int[] input1 = {26,11,20,10,3,7,18};
        int pivotalValue1 = 10;

        List<Integer> minArray1 = new ArrayList<>();
        List<Integer> maxArray1 = new ArrayList<>();

        for(int value : input1) {
            if(value <= pivotalValue1){
                minArray1.add(value);
            } else {
                maxArray1.add(value);
            }
        }

        System.out.println("Min values:  " + minArray1);
        System.out.println("Max values:  " + maxArray1);


    }
}
