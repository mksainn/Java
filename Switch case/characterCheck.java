import java.util.Scanner;
public class characterCheck {

    public static boolean isVowel(char character) {
        // Convert the character to lowercase to handle both upper and lower case vowels.
        char ch = Character.toLowerCase(character);

        // Check if the character is a vowel using a switch statement.
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char characterToCheck = scanner.next().charAt(0); // Replace 'A' with the character you want to check.

        if (isVowel(characterToCheck)) {
            System.out.println(characterToCheck + " is a vowel.");
        } else {
            System.out.println(characterToCheck + " is not a vowel.");
        }
    }
}
