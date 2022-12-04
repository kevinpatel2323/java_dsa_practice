public class key_in_sorted_array {
    // public static void search(int a[][],int key){
    //     for (int i = 0; i < a.length; i++) {
    //         int j;
    //         int mid;
    //         boolean x = false;
    //         int start = 0;
    //         int end = 3;
            
    //         while (start<=end) {
                
    //             j = (start+end)/2;

    //             mid = a[i][j];
    //             if (mid == key){
    //                 System.out.println(i+" "+j);
    //                 x=true;
    //                 break;
    //             } 
    //             if(key>mid){
    //                 start = j+1;
    //             }
    //             if(key<mid){
    //                 end = j-1;
    //             }
                
    //         }
    //         if (x) {
    //             break;
    //         }
    //     }
    // }
    //time-complexity = O(n+m)
    public static void search(int a[][],int key){
        int i = 0;
        int j = a[0].length-1;
        int value = a[i][j];

        while(i<=3 || j>=0) {
            if (value==key) {
                System.out.println(i+" "+j);
                break;
            }
            if (key > value) {
                i++;
            }
            else{
                j--;
            }
            value = a[i][j];
        }
        
    }
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

        search(a, 10);
    }
}
