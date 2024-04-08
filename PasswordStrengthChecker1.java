import java.util.Scanner;

public class PasswordStrengthChecker1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==<======Welcome to Lisa's Password Strength Checker!======>==");
        System.out.println("=<==========================================================>=");
        System.out.print("Enter your desired Password: ");
        String password = scanner.nextLine();
        scanner.close();

        String strengthFeedback = checkPasswordStrength(password);
        System.out.println(strengthFeedback);

    }

    public static String checkPasswordStrength(String password) {

        int lengthCriteria = 8;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        String specialCharacters = "!@#$%^&*()_+[]{}|;:,.<>?~";

        if (password.length() >= lengthCriteria) {

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (specialCharacters.contains(String.valueOf(c))) {
                    hasSpecial = true;
                }
            }

            if (hasUppercase && hasLowercase && hasDigit && hasSpecial) {
                return "It is Strong Password!!!\nThank You for using Lisa's Password Strength Checkers!!!";
            } else {
                return "It is a Weak Password. Please include Uppercase Letters, Lowercase Letters, Numbers & Special Characters!!!";
            }
        } else {
            return "Password length must be at least " + lengthCriteria + " characters!!!";
        }
    }
}