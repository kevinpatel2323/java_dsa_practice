public class binary_search {
    //array is already sorted
    //time-complexity  = O(log n)

    public static void bin_search(int a[],int x){
        int start = 0;
        int end = a.length-1;
        while (start<=end) {
            int mid =  (start+end)/2;
            if (a[mid] == x) {
                System.out.println(mid);
                break;
            }
            
            if (x > a[mid]) {
                start = mid+1;
            }
            else{
                end = mid+1;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        bin_search(a,3);
    }
}
