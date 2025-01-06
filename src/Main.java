public class Main {
    public static void main(String[] args) {


        String[] myArray = {"1", "4", "3"};
        boolean isPresent = false;
        for (int i = 0; i < myArray.length; i++) {
            String element = myArray[i];
            System.out.println(element);

            if(element.equalsIgnoreCase("a")) {
                isPresent = true;
            }
        }
        System.out.println( "answer " + isPresent);

    }


}