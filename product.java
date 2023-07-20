import java.util.*;
public class product {

    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter Second number");
        int b = sc.nextInt();

        System.out.println("product of two number = "+calculateProduct(a, b));
        
    }
}

// import java.util.*;
// public class product {

//     public static int calculateProduct(int a, int b) {
//         int sum;
//         sum = a*b;
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number");
//         int a = sc.nextInt();

//         System.out.println("Enter Second number");
//         int b = sc.nextInt();
//         int sum = calculateProduct(a, b);
//         System.out.println("product of two number = "+ sum);
        
//     }
// }
