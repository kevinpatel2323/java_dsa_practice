import java.util.ArrayList;

//roated sorted array
public class pairSum2 {
    public static void pair(ArrayList<Integer> arr,int sum) {
        int bp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>arr.get(i+1)) {
                bp = i;
                break;
            }
        }
        int rp = bp;
        int lp = bp+1;

        int n  = arr.size();
        while (lp!=rp) {
            int t = arr.get(lp) + arr.get(rp);
            if (t==sum) {
                System.out.println(lp);
                System.out.println(rp);
                break;
            }
            if (t<sum) {
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n ;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);

        pair(arr, 6);
    }
}
