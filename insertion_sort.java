public class insertion_sort {
    //time-complexity = O(n^2)
    public static void sort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int curr =a[i];
            int prev = i-1;

            while (prev >= 0 && a[prev]>curr) {
                a[prev+1] = a[prev];
                prev--;
            }
            a[prev+1] = curr;
        }
        System.out.print("Sorted : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
    }
    public static void main(String[] args) {
        int[] a ={5,4,1,3,2};
        System.out.print("Unsorted : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println();
        sort(a);
    }
}
