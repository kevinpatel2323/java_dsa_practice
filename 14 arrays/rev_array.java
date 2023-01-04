public class rev_array {
    //time-complexity = O(n/2)
    //space-complexity = O(1)
    public static void reverse(int a[]) {
        int start = 0;
        int end = a.length-1;

        while (start<end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start += 1;
            end -= 1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        reverse(a);
    }
}
