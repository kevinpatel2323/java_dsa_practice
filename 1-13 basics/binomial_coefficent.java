import java.util.Scanner;

public class binomial_coefficent {

    public static int n_fact(int n) {
        int n_factorial = 1;
        for (int i = 1; i <=n; i++) {
            n_factorial *= i;
        }
        return n_factorial;
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
        int rfact = n_fact(r);
        int nrfact = n_fact(n-r);

        int answer  = nfact/(rfact * nrfact);

        System.out.println(answer);
    }
}
