public class largest_in_array {
    public static int max(int a[]){
        int max = a[0];
        for (int j = 0; j < a.length; j++) {
            if (a[j]>max) {
                max = a[j];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        int ans  = max(arr);
        System.out.println(ans);
    }
}
