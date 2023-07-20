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