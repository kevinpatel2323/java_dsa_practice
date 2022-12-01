import java.util.Scanner;

public class bin_to_dec{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int b = sc.nextInt();

        int count = 0;
        int sum = 0;

        int bin = b;
        int temp;

        while (bin > 0) {
            temp = bin%10;
            sum = sum + temp * (int)Math.pow(2, count);
            bin = (int)bin/10;
            count++;
        }

        System.out.println(sum);

    }

}