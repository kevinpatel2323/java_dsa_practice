/**
 * btArray
 */
public class btArray {

    public static void backtrackArray(int arr[],int n,int i){

        if (i == arr.length) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            return;
        }
        arr[i] = n;
        backtrackArray(arr, n+1,i+1);
        arr[i] = arr[i] - 2;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];

        backtrackArray(arr, 1,0);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}