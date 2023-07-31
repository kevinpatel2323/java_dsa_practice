import java.util.HashSet;

public class unionAndIntersectionOfTwoArray {
    public static void main(String[] args) {
        int a1[] = {2,3,4,5};
        int a2[] = {4,5,6,7};

        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < a1.length; i++) {
            h.add(a1[i]);
        }

        for (int i = 0; i < a2.length; i++) {
            h.add(a2[i]);
        }

        System.out.println(("Union count = "+ h.size()));

        h.clear();

        for (int i = 0; i < a1.length; i++) {
            h.add(a1[i]);
        }

        for (int i = 0; i < a2.length; i++) {
            if (!h.contains(a2[i])) {
                h.add(a2[i]);
            }
        }

        System.out.println("Intersection = "+ (a1.length+a2.length-h.size()));
    }
}
