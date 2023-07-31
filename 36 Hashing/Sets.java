import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Sets{
    public static void main(String[] args) {
        //Like sets in maths 
        //Duplicates not allowed
        //Null values are allowed
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(5);
        hs.add(8);
        hs.add(1);
        hs.add(2);

        System.out.println(hs);
        System.out.println(hs.contains(2));
        hs.remove(2);
        System.out.println(hs.contains(2));

        //Iteration 1 using iterator
        // Iterator it = hs.iterator();
        
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for (Integer x : hs) {
            System.out.println(x);
        }

        //linkedHashSets
        //order same as input

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(8);
        lhs.add(2);
        lhs.add(5);
        lhs.add(1);
        lhs.add(2);

        System.out.println(lhs);

        //TreeSet 
        //Sorted in asending order
        //Null not alowed
        
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(5);
        ts.add(8);
        ts.add(1);
        ts.add(2);

        System.out.println(ts);


        


    }
}
