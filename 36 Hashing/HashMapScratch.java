import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class HashMapScratch {
    public static void main(String[] args) {
        //same order as input
        LinkedHashMap<String,Integer> lh = new LinkedHashMap<>();
        lh.put("a",1);
        lh.put("b",2);
        lh.put("d",4);
        lh.put("e",5);
        lh.put("c",3);
        

        HashMap<String,Integer> h = new HashMap<>();

        h.put("a",1);
        h.put("b",2);
        h.put("c",3);
        h.put("d",4);
        h.put("e",5);

        System.out.println(h.get("a"));
        h.putIfAbsent("a",10);
        System.out.println(h.get("a"));

        Set<String> s = h.keySet();

        System.out.println(s);

        for (String keys : s) {
            System.out.println(h.get(keys));
        }

        Set<String> ls = lh.keySet();
        System.out.println(ls);

        for (String keys : ls) {
            System.out.println(lh.get(keys));
        }
    }
}
