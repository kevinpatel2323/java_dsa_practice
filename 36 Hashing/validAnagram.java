import java.util.HashMap;

public class validAnagram {

    public static boolean validity(String s1,String s2){
        HashMap<Character,Integer> h = new HashMap<>();

        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            h.put(s1.charAt(i),h.getOrDefault(s1.charAt(i), 0)+1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (h.get(s2.charAt(i))==null) {
                return false;
            }
            else{
                h.put(s2.charAt(i), h.get(s2.charAt(i))-1);
            }
        }

        return h.isEmpty();
    }
    public static void main(String[] args) {
        
        String s1 = "nkevi";
        String s2 = "evnik";

        System.out.println(validity(s1, s2));
    }
}
