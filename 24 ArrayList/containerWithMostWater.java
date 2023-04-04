import java.util.*;

public class containerWithMostWater {//O(n^2)
    public static int bruteForce(ArrayList<Integer> arr){
        int area = 0;
        int l = 0;
        int b = 0;
    
        int max = Integer.MIN_VALUE;
    
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                l = Math.min(arr.get(i), arr.get(j));
                b = j-i;
    
                area = l*b;
    
                max = Math.max(max, area);
            }
        }
    
        return max;
    }

    public static int twoPointer(ArrayList<Integer> arr) {//O(n)
        int lp = 0;
        int rp = arr.size()-1;
        int area = Integer.MIN_VALUE;

        while (lp<rp) {
            int t = Math.min(arr.get(lp), arr.get(rp)) * (rp-lp);
            area = Math.max(area, t);

            if (arr.get(rp)>arr.get(lp)) {
                lp++;
            }
            else{
                rp--;
            }
        }

        return area;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);

        // System.out.println(arr.size());
        System.out.println(twoPointer(arr));
    }
}
