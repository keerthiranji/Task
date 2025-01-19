import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {
    public static <list> void main(String[] args) {

        //missing numbers
        int[] numbers = {1,3,6};
        List<Integer> missingNumbers = new ArrayList<>();
        int start = numbers[0];
        int end = numbers[numbers.length - 1];

        for(int i = start; i <= end; i++){
            boolean found = false;
            for(int k=0; k < numbers.length; k++){
                if (numbers[k] == i){
                    found = true;
                    break;
                }
            }
            if(found){
                System.out.println("Already present");
            }else{
                missingNumbers.add(i);
            }
        }
        System.out.println(missingNumbers);

    }

    public static List<Integer> findMissingNumbers ( int[] numArray){
        if (numArray == null || numArray.length < 2) {
            return Collections.emptyList();
        }
        int previous;
        int current;
        List<Integer> missingList = new ArrayList<>();
        for (int i = 1; i < numArray.length; i++) {
            previous = numArray[i - 1];
            current = numArray[i];
            int delta = current - previous;
            if (delta > 1) {
                for (int j = previous + 1; j < current; j++) {
                    missingList.add(j);
                }
            }
        }

        return missingList;
    }
}
