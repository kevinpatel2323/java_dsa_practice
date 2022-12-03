public class bubble_sort {
    //time-complexity = O(n^2)
    
    public static void sort(int a[]){
        
        for (int i = 0; i < a.length-1; i++) {
            int swap = 0;
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] =temp;
                    swap++;
                }
                
            }
            if (swap==0) {
                break;
            }
        }
        System.out.print("Sorted : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.print("Unsorted : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        sort(a);
    }
}
