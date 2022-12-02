

import java.util.Scanner;

public class linear_search {
    public static int search(int a[],int x){
        for (int i = 0; i < a.length; i++) {
            if (a[i]==x) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc  = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int found =search(arr, 5); 

        System.out.println(found);
    }
}
