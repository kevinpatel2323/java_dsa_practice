import java.util.Arrays;

public class counting_sort {
    //time-complexity = O(n^2)
    
    public static void sort(int a[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max = a[i];
            }
        }
        int c[] = new int[max+1];
        for (int i = 0; i < c.length; i++) {
            int x = a[i];
            c[x]++;
        }
        System.out.print("Aux array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(c[i] +" ");
        }
        int j = 0;
        for (int i = 0; i < c.length; i++) {
            while (c[i]>0) {
                a[j] = i;
                j++;
                c[i]--;
            }
        }
        System.out.println();
        System.out.print("Sorted array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        int[] a = {1,4,1,3,2,4,3,7};
        System.out.print("Unsorted : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sort(a);
    }
}
