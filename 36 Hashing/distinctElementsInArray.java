import java.util.HashSet;

public class distinctElementsInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,3,5,6,7,};

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        System.out.println(hs.size());
    }
}
