import java.util.Scanner;

public class PasswordValidator {
    public static boolean validatePassword(String password) {
        boolean isValid = true;

        if (password.length() <= 5 || password.length() >= 12) {
            isValid = false;
            System.out.println("The length is not between 5 and 12!");
            return isValid;
        }

        if (!password.toLowerCase().equals(password)) {
            isValid = false;
            System.out.println("It contains an uppercase letter!");
            return isValid;
        }

        boolean containsDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                containsDigit = true;
            }
            if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64)) {
                isValid = false;
                System.out.println("It contains a special character!");
                return isValid;
            }
        }

        if (!containsDigit) {
            isValid = false;
            System.out.println("It does not contain a digit!");
            return isValid;
        }

        return isValid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String inputPassword = scanner.nextLine();
        System.out.println(validatePassword(inputPassword));
    }
}
