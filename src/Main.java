import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String[] myArray = {"1", "a", "3"};
        boolean isPresent = false;
        for (int i = 0; i < myArray.length; i++) {
            String element = myArray[i];
            System.out.println(element);

            //if("a".equalsIgnoreCase(element))
            if(element.equalsIgnoreCase("a")) {
                isPresent = true;
            }
        }

        System.out.println( "answer: " + isPresent);


        //anpther way
        String[] myArray1 = {"1", "a", "3"};
        boolean isPresent1 = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to find: ");
        String input = scanner.nextLine();
        for(int i = 0; i < myArray1.length; i++){
            String element = myArray1[i];

            if(element.equalsIgnoreCase(input)){
                isPresent1 = true;
            }
        }
        System.out.println("answer: " + isPresent1);

    }

}