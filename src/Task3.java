import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //problem 1
        //find maximum value
        int[] array = {2, 6, 11, 20, 3, 7, 18};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(("The maximum value of the array is:  " + max));

        //problem 2
        //find minimum value
        int[] array1 = {2, 6, 11, 20, 3, 7, 18};
        int min = array[0];
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] <  min){
                min = array1[i];
            }
        }
        System.out.println(("The minimum value of the array is:  " + min));

        //problem 3
        int[] input = {2,6,11,20,3,7,18};
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

        System.out.println("Min array:  " + minArray);
        System.out.println("Max array:  " + maxArray);


    }
}
