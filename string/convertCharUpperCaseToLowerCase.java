import java.util.*;
public class convertCharUpperCaseToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        System.out.println("In lowerCase = " + ch);
    }
}