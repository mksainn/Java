import java.util.*;
public class characterIsVowelOrConstent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o') {
            System.out.println("Input character is vowel = " + ch);
        } else {
            System.out.println("Input character is constent");
        }
    }
}