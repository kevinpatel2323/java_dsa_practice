public class selection_sort {
    public static void sort(int a[]){
        
        for (int i = 0; i < a.length-1; i++) {
            int min = a[i];
            int idx=i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<min) {
                    min = a[j];
                    idx = j;
                }
            }
            int temp = a[i];
            a[i] = a[idx];
            a[idx] = temp;
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
