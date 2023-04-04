import java.util.ArrayList;

public class pairSum1 {//O(n)
    public static void pairSum(ArrayList<Integer> arr,int sum) {
        int lp = 0;
        int rp = arr.size()-1;
        
        while (lp<rp) {
            int t = arr.get(lp) + arr.get(rp);
            if (t==sum) {
                System.out.println(lp);
                System.out.println(rp);
                break;
            }
            if (t<sum) {
                lp++;
            }
            else{
                rp++;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        pairSum(arr, 6);
    }
}
