import java.util.*;
public class find_the_largest_num {
    public static void main(String args[] ) {
        Scanner sc = new Scanner(System.in);

        int n1 = 11;
        int n2 = 1;
        int n3 = 1;

        if (n1 == n2 || n1 == n3 || n2 == n3)
        {
            System.out.println(n1+ " is largest");
        }
        else if( n2>n1&&n2>n3)
        {
            System.out.println(n2);
        }
        else if(n3>n2&& n3>n1)
        {
            System.out.println(n3);
        }
        else if(n1>n2&&n1>n3){
            System.out.println(" equal");
        }

        else {
            System.out.println(" all equal");
        }

        // if(n1>n2) {
        //     if(n2>n3) {
        //         System.out.println(n2);
        //     } else {
        //         System.out.println(n1);
        //     }
        // } else {
        //     if(n2>n3) {
        //         System.out.println(n1);
        //     } else {
        //         System.out.println(n3);
                
        //     }
        // }

    }
}
