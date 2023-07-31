import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int arr[] = {1,1,3,1,1,1,1,1,4,5,6,6,7,8,9,9};
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            h.put(arr[i],h.getOrDefault(arr[i], 0)+1);
        }

        for (int i : h.keySet()) {
            if (h.get(i)>(arr.length/3)) {
                System.out.println(i);
            }
        }
    }
    
}
