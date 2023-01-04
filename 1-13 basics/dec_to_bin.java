import java.util.Scanner;

public class dec_to_bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int dec = n;
        int sum =0;
        int count = 0;

        while (dec>0) {
            int temp = dec%2;
            sum = sum + (temp * (int)Math.pow(10, count));
            
            dec = dec/2;
            count++;
        }
        System.out.println(sum);
    }
}
