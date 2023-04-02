public class quickSort{
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }

        int idx = partition(arr,si,ei);
        quickSort(arr,si,idx-1);
        quickSort(arr,idx+1,ei);
    }

    public static int partition(int arr[],int si,int ei) {
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,0,3};
        
        quickSort(arr, 0, 5);

        printArray(arr);
    }
}