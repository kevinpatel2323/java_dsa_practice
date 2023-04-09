//Implemention of LL using collection framework

import java.util.*;

public class clnFrmLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.addFirst(2);
        ll.addLast(3);
        
        System.out.println(ll);

        Collections.sort(ll);

        System.out.println(ll);
    }
}
