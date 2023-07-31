import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        //Sorted according by keys
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("a",1);
        tm.put("e",5);
        tm.put("c",3);
        tm.put("b",2);
        tm.put("d",4);
        

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

        Set<String> ts = tm.keySet();
        System.out.println(ts);

        for (String keys : ts) {
            System.out.println(tm.get(keys));
        }
    }
}
