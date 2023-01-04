public class kadanes_algo_maxsumsubarray {
    //time-complexity = O(n)
    //corner-case = all numbers maybe negative, then
    //return smallest negative number

    public static int max_sum(int a[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            cs = cs+a[i];
            if (cs<0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        return ms;
    }
    public static void main(String[] args) {
        int[] a = {-2,-3,4,-1,-2,1,5,-3};

        int ans = max_sum(a);

        System.out.println(ans);
    }
}
