public class trapping_rainwater {
    //time-complexity = O(n);
    public static void volume(int a[]){
        int[] lm = new int[7];
        int[] rm = new int[7];
        lm[0] = a[0];
        rm[a.length-1] = a[a.length-1];
        int total = 0;

        for (int i = 1; i < lm.length; i++) {
            lm[i] = Math.max(a[i],lm[i-1]);
        }
        for (int i = rm.length-2; i >= 0; i--) {
            rm[i] = Math.max(a[i],rm[i+1]);
        }
        
        for (int i = 0; i < rm.length; i++) {
            int min = Math.min(lm[i],rm[i]);
        
            total += min-a[i];
        }
    
        System.out.println(total + " units of water will be stored");
    }
    public static void main(String[] args) {
        int[] a = {4,2,0,6,3,2,5};
        volume(a);
    }
}
