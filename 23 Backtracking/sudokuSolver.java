public class sudokuSolver {

    public static void printBoard(int arr[][]) {
        System.out.println("-------------------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkSudoku(int arr[][],int i,int j) {
        //vertical
        for (int row = 0; row < arr.length; row++) {
            if (arr[row][j] == arr[i][j] && row!=i) {
                return false;
            }
        }

        //horizontal
        for (int col = 0; col < arr.length; col++) {
            if (arr[i][col] == arr[i][j] && col!=j) {
                return false;
            }
        }

        //grid 
        int rs = (i/3)*3;
        int cs = (j/3)*3;

        for(int row = 0; row<rs+3; row++){
            for(int col = 0;col<cs+3;col++){
                if (arr[rs][cs] == arr[i][j] && rs != i && cs!=j) {
                    return false;
                }
            }
        }


        return true;
    }

    public static void sudoku(int arr[][],int i,int j) {
        if (j==9) {
            j = 0;
            i = i+1;
        }

        if (i == 9 && j==9) {
            printBoard(arr);
            return;
        }

        for (int j2 = 1; j2 < 11; j2++) {
            // System.out.println(j2);
            if(j2==10){
                return;
            }
            
            arr[i][j] = j2;
            // printBoard(arr);
            if (checkSudoku(arr,i,j)) {
                // printBoard(arr);
                sudoku(arr, i, j+1 );
            }
        }
    }
    public static void main(String[] args) {
        int n = 9 ;
        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
            }
        }

        printBoard(arr);

        sudoku(arr, 0, 0);
    }
}
