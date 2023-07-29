import java.util.*;
public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.print("Enter any operator that you want to perform like + _ * /  = ");
        String operator = sc.next(); 
        float ans = 0.0f;

        switch(operator) {
            case "+" :
                ans = a + b;
                break;
            case "-" :
                ans = a - b; 
                break;
            case "*" :
                ans = a*b;
                break;
            case "/" :
                ans = a/b;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println(a + " " + operator + " " + b + " = " + ans);
    }
}