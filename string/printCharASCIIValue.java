import java.util.*;
public class printCharASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);
        int a = ch;
        System.out.println("ASCII value of " + ch + " is = " + a);
        
    }
}