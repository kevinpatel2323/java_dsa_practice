import java.util.Scanner;

public class binomial_coefficent {

    public static int n_fact(int n) {
        int n_factorial = 1;
        for (int i = 1; i <=n; i++) {
            n_factorial *= i;
        }
        return n_factorial;
    }

    public static int r_fact(int r){
        int r_factorial = 1;

        for (int i = 1; i <= r; i++) {
            r_factorial *= i;
        }
        return r_factorial;
    }

    public static int n_r_fact(int n, int r){
        int nr = n-r;
        int nra = 1;

        for (int i = 1; i <= nr; i++) {
            nra *= i;
        }
        return nra;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int r;
         
        System.out.println("Enter n : ");
        n = sc.nextInt();
        System.out.println("Enter r : ");
        r = sc.nextInt();

        int nfact = n_fact(n);
        // System.out.println(nfact);
        int rfact = r_fact(r);
        // System.out.println(rfact);
        int nrfact = n_r_fact(n,r);
        // System.out.println(nrfact);

        int answer  = nfact/(rfact * nrfact);

        System.out.println(answer);


    }
}
