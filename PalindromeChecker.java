import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("*************** WELCOME TO PALINDROME CHECKER ***************");
            System.out.println("-------------------------------------------------------------");
            System.out.println("Enter The String");
            String str = s.nextLine();
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    System.out.println("Not Palindrome String");
                    System.out.println("---------------------");
                    break;
                } else {
                    System.out.println("Palindrome String");
                    System.out.println("-----------------");
                    System.out.println("***Thank You For Using***");
                    System.out.println("-------------------------");
                    break;
                }
            }
        }
    }
}
