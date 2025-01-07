public class Task2 {
    public static void main(String[] args) {
        // Define two arrays
        String[] array1 = {"1", "a", "3"};
        String[] array2 = {"a", "1", "3", "4"};

        // Check if both arrays contain the same elements
        boolean areEqual = arraysContainSameElements(array1, array2);

        // Print the result
        System.out.println("Both arrays contain the same elements: " + areEqual);
    }

    public static boolean arraysContainSameElements(String[] array1, String[] array2) {
        // Check lengths
        if (array1.length != array2.length) {
            return false;
        }

        // Check each element in array1 exists in array2 the same number of times
        for (int i = 0; i < array1.length; i++) {
            int countInArray1 = 0;
            int countInArray2 = 0;

            // Count occurrences in array1
            for (int j = 0; j < array1.length; j++) {
                if (array1[i].equals(array1[j])) {
                    countInArray1++;
                }
            }

            // Count occurrences in array2
            for (int k = 0; k < array2.length; k++) {
                if (array1[i].equals(array2[k])) {
                    countInArray2++;
                }
            }

            // If counts don't match, the arrays are not equal
            if (countInArray1 != countInArray2) {
                return false;
            }
        }

        return true;
    }
}
