//for in 2*n
public class tiling_prblm {

    public static int tiling(int n) {
        if (n==0||n==1) {
            return 1;
        }

        int ver = tiling(n-1);
        int hor = tiling(n-2);

        int total = ver + hor;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}