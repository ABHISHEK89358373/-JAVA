import java.util.Scanner;

public class UniqueCompleteString {

    public static boolean isPerfectString(String input) {
        for (int i = 0; i < input.length(); i++) {
            int frequency = 1;
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency > 1) {
                return false; // Duplicate character found
            }
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!input.contains(Character.toString(ch))) {
                return false; // Missing character in the alphabet
            }
        }
        return true; // All characters are unique and complete
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the string perfect? " + isPerfectString(userInput));
    }
}
