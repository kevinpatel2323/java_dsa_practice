public class print_subarrays {
    //formula = n(n+1)/2
    //time-complexity = O(n^3)
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};
        int max=Integer.MIN_VALUE;

        for (int i = 0; i <= a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(a[j2]);
                    sum += a[j2];
                    if (sum>max) {
                        max = sum;
                    }
                }
                System.out.print(" sum = "+sum);
                System.out.println();
            }
            System.out.println();
        }   
        System.out.println(max);
    }

}
