import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        char[] inputArray = {'a', 'z', '4', 'i', 'm', '7'};

// collecting vowels, consonants and numbers in separate array list
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();

        for (char c : inputArray) {
            if (Character.isDigit(c)) {
                numbers.add(c);
            } else if (isVowel(c)) {
                vowels.add(c);
            } else if (Character.isLetter(c)) {
                consonants.add(c);
            }
        }
                System.out.println("Vowels: " + vowels);
                System.out.println("Consonants: " + consonants);
                System.out.println("Numbers: " + numbers);
            }

            private static boolean isVowel(char c) {
                c = Character.toLowerCase(c);
                return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}
