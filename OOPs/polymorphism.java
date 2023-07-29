// this is known as Compile time polymorphism
// method with argument and method without argument with same method name these two are totly differnt 
public class polymorphism {
    public static void main(String args[]) {

        person p1 = new person();
        p1.name = "mukul";
        p1.age = 19;

        person p2 = new person();
        p2.name = "computer";
        p2.age = 20;

        System.out.println(p1.name + " " + p1.age);
        System.out.println(p2.name + " " + p2.age);

        p1.walk();
        p1.walk(5);

        p2.walk();
        p2.walk(100);
    }
}
class person{
    String name;
    int age;
    
    void walk() {
        System.out.println(name + " " + "Walking the man");
    }
    void walk(int step) {
        System.out.println(name + " step " + step);
    }

}