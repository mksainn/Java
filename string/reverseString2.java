import java.util.*;
public class reverseString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "java coding";
        String b = "";
        int l = a.length();

        for(int i = l-1; i>=0; i--) {
            b = b+a.charAt(i);
        }
        System.out.println(b);
    }
}