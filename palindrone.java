import java.util.*;
public class palindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r, s=0;
        while(num>0) {
            r = num%10;
            s = (s*10) + r;
            num/=10;
        }
        System.out.println(s);
    }
}   