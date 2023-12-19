import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Inserting
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        
        //print all element in set
        System.out.println("Number of element in set = " + set);

        //Remove element in HashSet
        set.remove(3);
        if(!set.contains(3)) {
            System.out.println("set does not contain 3 - we delete it ");
        }

        //check how much element in set
        System.out.println("Total num of element in set = " + set.size());

        //!print all element in has set by using  Iterator 
        Iterator it = set.Iterator();
        while(it.hasNext()) {
                System.out.println(it.next());
        }
        
        // searching , contain
        if(set.contains(1)) {
            System.out.println("set contain 1");
        }
        if(!set.contains(6)) {
            System.out.println("set does not contain");
        }
    }
}