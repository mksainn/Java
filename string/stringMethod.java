import java.util.*;
public class stringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "Mukul";
        String b = "kumar";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(a.concat(b));
        System.out.println(a.length());

        String  c = "     String     ";
        String d = "";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        System.out.println(a.charAt(2));
        System.out.println(b.indexOf('k'));

        System.out.println(b.equals(a));
        System.out.println(b.replace('r','i'));


    }
}