public class parameterrise {
    public static void main(String args[]){
        Pen s1 = new Pen();
        s1.color = "red";
        s1.type = "ball pen";
        s1.quantity = 5;
        s1.penInfo();
    }
}

class Pen {
    String color;
    String type;
    int quantity;
    public void penInfo() {
        System.out.println("Writing something");
        System.out.println(color);
        System.out.println(type);
        System.out.println(quantity);
    }
}