import java.util.HashMap;
import java.util.Set;

public class hashmaps{
    public static void main(String[] args) {
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

    }
}