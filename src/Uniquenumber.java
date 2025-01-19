import java.util.*;

public class Uniquenumber {
    public static void main(String[] args) {
        int[] numArray1 = {2, 3, 4, 2, 1, 6, 1, 1};
        int[] numArray2 = {2, 2, 3, 2, 4, 6, 3, 3, 3};
        findUniqueNumbers(numArray1);
        findUniqueNumbers(numArray2);

    }
    public static void findUniqueNumbers(int[] numArray) {
        //{2, 3, 4, 2, 1, 6, 1};
        if (numArray == null || numArray.length < 2) {
            System.out.println(numArray[0]);
            return;
        }

        HashMap<Integer, Integer> numberCount = new HashMap<>();
        for (int a : numArray) {
            if (Objects.isNull(numberCount.get(a))) {
                numberCount.put(a, 1);
            } else {
                numberCount.put(a, numberCount.get(a) + 1);
            }
        }

        List<Integer> uniqueNumber = new ArrayList<>();
        List<Integer> duplicateNumber = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumber.add(entry.getKey());
            } else {
                duplicateNumber.add(entry.getKey());
            }
        }
        System.out.println("Unique numbers: " + uniqueNumber);
        System.out.println("Duplicate numbers: " + duplicateNumber);

    }
}