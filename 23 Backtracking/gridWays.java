/**
 * gridWays
 */
public class gridWays {

    public static int countGridWays(int n,int m,int i,int j){

        if (n==i-1 || m==j-1) {
            return 1;
        }
        if (n==i || m==i) {
            return 0;
        }

        return countGridWays(n+1, m, i, j) + countGridWays(n, m+1, i, j);
    }
    public static void main(String[] args) {
        System.out.println(countGridWays(0, 0, 3, 3));
    }
}