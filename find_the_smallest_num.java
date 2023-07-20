import java.util.*;
public class find_the_smallest_num {
    public static void main(String args[] ) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n1<n2) {
            if(n2<n3) {
                System.out.println(n2);
            } else {
                System.out.println(n1);
            }
        }else {
            if(n1<n3) {
                System.out.println(n1);
            } else {
                System.out.println(n3);
                syso    
            }
        }

    }
}
