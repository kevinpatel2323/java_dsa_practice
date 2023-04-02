public class nQueens {

    public static boolean isSafe(char board[][],int i,int j){
        for (int row = i-1; row >= 0; row--) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        for (int row = i-1, col = j-1; row >= 0 && col>=0; row--,col--) {
            if (board[row][col] == 'Q') {
                return false;
            }   
        }

        for (int row = i-1, col = j+1; row >= 0 && col<board.length; row--,col++) {
            if (board[row][col] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("--------------------------------");
        System.out.println(count);
        System.out.println("--------------------------------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void placeQueen(char board[][],int n) {
        if (board.length==n) {
            printBoard(board);
            count++;
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, n, i)==true) {
                board[n][i] = 'Q';
                placeQueen(board, n+1);
                board[n][i] = 'x';
            }
        }
    }

    static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }

        printBoard(board);

        placeQueen(board, 0);
    }
}
