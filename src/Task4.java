import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        //problem 1
        //merge 2 Arrays
        int[] minValues = {2, 6, 3, 7};
        int[] maxValues = {11, 20, 18};

        int mergedLength = minValues.length + maxValues.length;
        int[] mergedValues = new int[mergedLength];

        for(int i = 0; i < minValues.length; i++){
            mergedValues[i] = minValues[i];
        }
        for(int i = 0; i < maxValues.length; i++){
            mergedValues[minValues.length + i] = maxValues[i];
        }
        System.out.println("Merged Array: " + Arrays.toString(mergedValues));

    }
}
