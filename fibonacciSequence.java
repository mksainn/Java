import java.util.*;
public class fibonacciSequence {

    public static void fibonacci(int count) {

        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 1; i<=count; i++) {
            System.out.print(a + ", ");
            a = b; 
            b = c;
            c = a+b;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}

import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}