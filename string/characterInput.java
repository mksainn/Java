import java.util.*;
public class characterInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.print("Enter any character : ");
        ch = sc.next().charAt(0);
        System.out.println(ch);
    }
}