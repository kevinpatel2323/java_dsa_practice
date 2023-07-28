//This code is not running proprely 
public class heapSort {
    public static void heapify(int arr[],int i,int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;

        if (right<size && arr[maxIdx]>arr[left]) {
            maxIdx = left;
        }
        if (left<size && arr[maxIdx]>arr[right]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            heapify(arr, maxIdx, size);
        }
    }
    public static void hsort(int a[]){
        int n = a.length;
        for(int i=n/2;i>=0;i--){
            heapify(a,i,n);
        }

        for(int i=n-1;i>0;i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a,0,i);
        }
    }
    public static void main(String args[]){
            int[] a = {2,3,1,8,10};

            hsort(a);

            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

    }
}
