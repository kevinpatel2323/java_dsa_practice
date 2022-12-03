public class bubble_sort {
    //time-complexity = O(n^2)
    public static void sort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] =temp;
                }
            }
        }
        System.out.print("Sorted : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        int[] a = {1,8,3,5,4,6,7,2,9};
        System.out.print("Unsorted : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sort(a);
    }
}
