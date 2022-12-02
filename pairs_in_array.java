public class pairs_in_array {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                System.out.println(a[i]+","+a[j]);
            }
        }
    }
}
