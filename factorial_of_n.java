import java.util.Scanner;

public class factorial_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            answer = answer*i;
        }
        System.out.println(answer);
    }
}
