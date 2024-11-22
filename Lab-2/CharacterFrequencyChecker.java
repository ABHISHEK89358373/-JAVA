import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequencyChecker {

    public static void findCharactersExceedingLimit(String input, int limit) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int frequency = 1;
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency > limit && !result.toString().contains(Character.toString(input.charAt(i)))) {
                result.append(input.charAt(i));
            }
        }
        System.out.println("Characters exceeding the limit: " + result.toString());
    }

    public static void checkFrequencyWithMap(String input, int limit) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
        }
        System.out.print("Characters exceeding the limit using HashMap: ");
        for (Character character : frequencyMap.keySet()) {
            if (frequencyMap.get(character) > limit) {
                System.out.print(character);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter the limit (n): ");
        int limit = scanner.nextInt();
        findCharactersExceedingLimit(inputString, limit);
        checkFrequencyWithMap(inputString, limit);
    }
}
