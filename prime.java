import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to Check prime or not : ");
        int num = sc.nextInt();

        if(isPrime(num) == true) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
        // System.out.println(isPrime(num));

    }
    public static boolean isPrime(int n) {
        if(n == 0 || n == 1) {
            return false;
        }
        if(n == 2) {
            return true;
        }
        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0){
                return false;
            }
            
        }
        return true;
    }
}

