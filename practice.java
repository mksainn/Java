
public class practice {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }
}
public class practice {
    public static void main(String[] args){
        int a = 10;
        int b = 25;
        int sum = a + b;
        System.out.print(sum);
    }
}

! first time input in java for string
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}

! first time input an Integer
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}

! Check three number that all are equal or any of two are equal
import java.util.Scanner;
public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Enter third number");
        c = sc.nextInt();
        
        System.out.println("all are equal "+(a==b&&b==c&&c==a));
        System.out.println("any two are equal "+(a==b|| b==c||c==a));
    }
}

!Write a program to find square of a number.
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num*=num;
        System.out.println(num);
    }
}

! check adult or not if else 
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }
    }
}

! Type of variable in java
public class practice {
    int a = 10;   //instance variable
    static double b = 20.8;   //static variable

    public static void main(String args[]) {

        boolean c = true;   // local variable
        practice s = new practice();

        System.out.println(s.a);
        System.out.println(b);
        System.out.println(c);

    }
}

! Swap two number
import java.util.*;
public class practice {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a ");
        a = sc.nextInt();
        System.out.println("Enter valuw of b ");
        b = sc.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("value of a :"+a);
        System.out.println("value of a :"+b);

    }
}

! password checker
import java.util.Scanner;
public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pass : ");
        int pass = sc.nextInt();
        if(pass == 2424) {
            System.out.println("Name = Mukul kumar");
            System.out.println("Age = 19");
            System.out.println("Mobile number = 0402840248");
            System.out.println("Address  = patna");
        }else {
            System.out.println("Wrong pass");
        }
    }
}

! find the gratest of three number
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter any three number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b) {
            if(a>c) {
                System.out.println(" a is greater");
            } else {
                System.out.println(" c is greater");
            }
        } else {
            if(b>c) {
                System.out.println("b is greater");
            } else {
                System.out.println("c is greater");
            }
        }
    }
}


! Check Even or odd if else
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("0dd");
        }
    }
}

! import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        } else {
            if(a>b) {
                System.out.println("a is greater");
            }
            else {
                System.out.println("b is greater");
            }
        }
    }
}

! buttom  if else
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buttom = sc.nextInt();

        if(buttom == 1){
            System.out.println("hello");
        } else if(buttom == 2) {
            System.out.println("Namaste");
        } else if(buttom ==3){
            System.out.println("bonjo");
        } else {
            System.out.println("Invalid buttom");
        }
    }
}

! A school has following rules for grading system:
! a. Below 25 - F
! b. 25 to 45 - E
! c. 45 to 50 - D
! d. 50 to 60 - C
! e. 60 to 80 - B
! f. Above 80 - A
! Ask user to enter marks and print the corresponding grade.
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter makrs of student : ");
        int marks = sc.nextInt();
        if(marks<25) {
            System.out.println("F");
        } else if (marks<45) {
            System.out.println("E");
        } else if (marks<50) {
            System.out.println("D");
        } else if (marks<60) {
            System.out.println("C");
        } else if (marks<80) {
            System.out.println("B");
        } else if (marks<100) {
            System.out.println("A");
        }
    }
}


! buttom choice with switch 
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buttom = sc.nextInt();

        switch(buttom){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Buttom");
        }
    }
}

! for loop simple program 1 to 10
public class practice {
    public static void main(String[] args) {
        for(int i =0; i < 11; i++){
            System.out.print(i+" ");
            System.out.println("hello");
        }
    }
}

! print the sum of first n natural number
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}

! Reverse a number
import java.util.*;
public class practice {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num, rev = 0, r;
       System.out.println("Enter any number");
       num = sc.nextInt();
       while(num>0) {
          r = num % 10;
          rev = rev * 10 + r;
          num = num / 10;
       }
       System.out.println("Reverse : " + rev);
    }
}

! Factorial of any number
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, fact = 1;
        a = sc.nextInt();
        for(int i = 1; i<=a; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+ a + " is " + fact);
    }
}

! Check Leap year
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year");
        int year  = sc.nextInt();
        if((year % 400 ==0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}

 **********pattern in java***************

// print rectangle star pattern
****
****
****
****

public class practice {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        for(int i= 1; i<=n; i++){
            for(int j = 1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

! print rectangle star pattern
    ****
    *  *
    *  *
    ****
public class practice {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        for(int i= 1; i<=n; i++){
            for(int j = 1; j<=m; j++) {
                if(i==1 || j==1 || i==n ||j==m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


! print rectangle star pattern
*
**
***
****

public class practice {
    public static void main(String[] args) {
        int n = 4;
        
        for(int i= 1; i<=n; i++){
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

! print rectangle star pattern
****
***
**
* 

public class practice {
    public static void main(String[] args) {
        int n = 4;
        
        for(int i= n; i>=1; i--){
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

! printf Star
   *
  **
 ***
****

public class practice {
    public static void main(String[] args) {
        int n = 4;
        
        for(int i= 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
! pattern
****
 ***
  **
   *
public class practice2 {
    public static void main(String args[]) {
        int n =6;
        for(int i=1; i<=n; i++) {
            for(int j= n;  j>=n-i; j--) {
                System.out.print(" ");
            }
            for(int k = n; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

! number pattern 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 

public class practice {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i= 1; i<=n; i++){
            
            for(int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

! number pattern 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

public class practice {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i= n; i>=1; i--){
            
            for(int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

! number pattern 
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15

public class practice {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        
        for(int i= 1; i<=5; i++){
            
            for(int j = 1; j<=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}

! num pattern
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1

public class practice {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i= 1; i<=5; i++){
            
            for(int j = 1; j<=i; j++) {
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1"+" ");
                } else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}

! Butterfly star pattern
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *

import java.util.*;
public class practice {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 1; i<=4; i++) {
            
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            int space = 2 *(n-i);
            for(int j = 1; j<= space; j++) {
                System.out.print(" ");
            }

            for(int j= 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = n; i>=1; i--) {
            
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }

            int space = 2 *(n-i);
            for(int j = 1; j<= space; j++) {
                System.out.print(" ");
            }

            for(int j= 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

rumbos  pattern
    *****
   *****
  *****
 *****
*****

! public class practice {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i = 1; i<=5; i++) {

            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

! print name by function

import java.util.*;
public class practice {
        
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
        }
}

! sum of two number by using function
import java.util.*;
public class practice {
        
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("sum of two number = "+ sum);
        }
}

! product of two number by function without third variable
import java.util.*;
public class practice {
        
    public static int calculateProduct(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product of two number = "+ calculateProduct(a, b));
        }
}

! factorial of any number with function and loop

import java.util.*;
public class practice {

    public static void printFactorial(int n) {
        if(n<0){
            System.out.println("invalid number");
            return;
        }

        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);

    }
}

! Time complexity of this code is O(n*n), if n=5 then it print 25 times hello
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i= 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.println("hello");
            }
        }
    }
}

! Recursion example sum of n natural number
public class practice2 {
    public static void main(String args[]) {
        practice2 sc = new practice2();
        int i = sc.sum(3);
        System.out.println(i);
    }
    int sum(int b) {
        if(b>0) {
            return b + sum(b-1);
        }
        else {
            return 0;
        }
    }
}

! print an array element usning loop?
import java.util.*;
public class practice {
    public static void main(String[] args) {
        
        //int marks[] = new int[3];
        int marks[] = {45, 55, 4};
        // marks[0] = 45;
        // marks[1] = 55;
        // marks[2] = 4;

        for(int i = 0; i<3; i++) {
            System.out.println(marks[i]);
        }

    }
} 
  
! Take an array element from the user and print by using loop
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the size of an array :");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter "+size +" number ");
        for(int i = 0; i<size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Number that you entered :");
         for(int i = 0; i<size; i++) {
            System.out.println(number[i]);
        }
    }
}

! Take an aray as input from the user. Search for a given number x and print the index at which it occurs.
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the size of an array :  ");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter "+size +" number ");
        for(int i = 0; i<size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.print("Enter the number that you want to find : ");
        int x = sc.nextInt();

        for(int i = 0; i<number.length; i++) {
            if(number[i] == x)  {
                System.out.println(x+" is on index : " + i);
            }
        }
    }
}

!  Iniselize an 2D array; Take an aray as input from the user. In 2D array and print it 
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][]  number = new int[rows][cols]; 
        System.out.println("Enter "+ rows*cols +" numbers : ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("output ");
        for(int i=0; i<rows; i++) {
            for(int j= 0; j<cols; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();

        }
    }
}

!  Take an 2D array as input from the user. Search for a given number x and print the index at which it occurs.
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][]  number = new int[rows][cols]; 
        System.out.println("Enter "+ rows*cols +" numbers : ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter number");
        int x = sc.nextInt();

        System.out.println("output ");
        for(int i=0; i<rows; i++) {
            for(int j= 0; j<cols; j++) {
                if(number[i][j] == x) {
                    System.out.print("x found at location (" + i + " , " + j + ")");
                }
            }
            System.out.println();

        }
    }
 }

! print an string and add two string.
import java.util.*;
public class practice {
    public static void main(String[] args) {
        //! Concatenation   when we add two string
        String first = "mukul";
        String last = "kumar";
        String fullname = first + " "+ last;  
        System.out.println(first);
        System.out.println(last);
        System.out.println(fullname);

    }
}

! Take two different string input and print them in same line
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterr first half name");
        String halfName = sc.next();
        System.out.println("Enterr second half name");
        String halfName2 = sc.next();
        String fullName = halfName + halfName2;
        System.out.println(fullName);

    }
}

Take an String from keyboardand print by using length() function and charAt().
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullname = "Mukul kumar";
        System.out.println(fullname.length());
        //!  charAt()
        for(int i=0; i<fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
}

compare two string by using compareTo function
import java.util.*;
public class practice {
    public static void main(String[] args) {
        String name1 = "Mukul";
        String name2 = "Mukul";
        //! compareTo is use to compare two string
        //1 s1 > s2 : +ve value
        //2 s1 == s2: 0
        //3 s1 < s2 : -ve value
        if(name1.compareTo(name2) == 0) {
            System.out.print("Equal");
        } else {
            System.out.print("Not equal");
        }
    }
}

substring() funcion - it subtract character from sentence 
import java.util.*;
public class practice {
    public static void main(String[] args) {
        //! parcing concept
        String sentence = "TonyStark";
        String name = sentence.substring(4);
        System.out.println(name);
    }
}

simple take an input from keyboar and bring with  space by using //!nextLine()
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
 
        System.out.print(fullName);
    }
}

String builder 
import java.util.*;
public class practice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //*char at index 0
        System.out.println(sb.charAt(0));

        //*set char at indes 0 replace 'T' to 'P'
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //! insert function it insert new character to the string
        sb.insert(2, 'n');
        System.out.println(sb);

        //*delete the extra 'n'
         sb.delete(0, 3);
         System.out.println(sb);
    }
}

//* append function to add an character/string to string without make new stirng
import java.util.*;
public class practice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e"); // str = str + "e";
        sb.append("l"); // str = str + "e";
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

    }
}

//reverse an string
import java.util.*;
public class practice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}

bit Manipulation  by Get Bit that 
//! Get the 3nd bit (posion = 2) of a number n. (n= 0101) with and operation

import java.util.*;
public class practice {
    public static void main(String[] args) {
        int n = 9;
        int pos = 2;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}
 //! Set the 2nd bit (posion = 2) of a number n. (n= 0101) with OR operation

import java.util.*;
public class practice {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}

import java.util.*;
public class practice {
    public static void printArray(int arr[]) {
        for ( int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int arr[] = {7,8,3,1,9};
        for(int i = 0; i<arr.length-1; i++) {
            for(int j = 0; j<arr.length-i-1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    printArray(arr);
    }
}




5         