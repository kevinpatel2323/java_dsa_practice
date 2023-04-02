public class searchRtedSrtdArr{
    

    public static int search(int arr[],int trgt, int si,int ei){

        if(si>=ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(arr[mid]==trgt){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(trgt >= arr[si] && trgt<=arr[mid]){
                return search(arr,trgt,si,mid-1);
            }
            else{
                return search(arr,trgt,mid+1,ei);
            }
        }
        else{
            if(trgt >= arr[mid] && trgt<=arr[ei]){
                return search(arr,trgt,mid+1,ei);
            }
            else{
                return search(arr,trgt,si,mid-1);
            }
        }
        
        
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(search(arr,1,0,4));
    }
}