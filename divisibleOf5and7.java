
public class divisibleOf5and7 {
    public static void main(String args[]) {

        int num = 0;
        for(int i = 200; i<=800; i++) {
            if(i%5 == 0 && i%7 ==0) {
            }
            else {
                System.out.print(i +" ");
                num++;
            }
        }
        System.out.println();
        System.out.println("Total number not divisible by 5 and 7 is = " + num);
    }
}

