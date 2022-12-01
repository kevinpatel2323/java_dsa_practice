import java.util.Scanner;

class sum_of_two_num{
    public static int addition(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("kevin");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int f = sc.nextInt();
        System.out.println("Enter second number : ");
        int s = sc.nextInt();
        int ans =  addition(f, s);
        System.out.println("sum of two numberrrrs is : " + ans);
    }
}