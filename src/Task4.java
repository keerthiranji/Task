import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        //problem 1
        //merging 2 Arrays
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

        //Problem 2
        int[] val = {10, 25, 9, 67, 54, 23, 6, 20, 11, 45};

        int endIndex = 5;
        if(endIndex < 0 || endIndex > val.length){
            System.out.println("Invalid end index");
            return;
        }
        int[] subArray = new int[endIndex];
        for(int i = 0; i < endIndex; i++){
            subArray[i] = val[i];
        }
        System.out.println("Subarray: " + Arrays.toString(subArray));


        //Problem 3
        int[] array = {10, 25, 9, 67, 54, 23, 6, 20, 11, 45};

        int startIndex = 4;
        if(startIndex < 0 || startIndex >= array.length) {
            System.out.println("Invalid start index");
            return;
        }
        int subArray1Length = array.length - startIndex;
        int[] subArray1 = new int[subArray1Length];

        for (int i = 0; i < subArray1Length; i++){
            subArray1[i] = array[startIndex + i];
        }
        System.out.println("Subarray1: " + Arrays.toString(subArray1));

    }
}
