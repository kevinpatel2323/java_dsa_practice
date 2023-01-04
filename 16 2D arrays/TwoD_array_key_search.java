import java.util.Scanner;

public class TwoD_array_key_search {
    public static void search(int a[][],int key){
        int n = a.length;
        int m = a[0].length;
        int x,y;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == key) {
                    System.out.println("i="+i+"j="+j);
                    return;
                }
            }
        }
        System.out.println("key not found");
    }
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int n = a.length;
        int m = a[0].length;

        Scanner sc = new Scanner(System.in);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

            search(a, 5);
            
    }
        
}

