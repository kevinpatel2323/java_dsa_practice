import java.util.HashMap;

public class noOfSubArrWithSumK {
    public static void main(String args[]){
        int arr[] = {10,2,-2,-20,10};

        int k = -10;
        
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (h.containsKey(sum-k)) {
                ans += h.get(sum-k);
            }
            h.put(sum,h.getOrDefault(sum, 0)+1);
        }
        System.out.println(ans);
    }
}
