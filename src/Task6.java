import java.util.ArrayList;
import java.util.List;

public class Task6 {
    public static <list> void main(String[] args) {
        int[] numbers = {1,3,6};
        List<Integer> missingNumbers = new ArrayList<>();
        int start = numbers[0];
        int end = numbers[numbers.length-1];

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
}
