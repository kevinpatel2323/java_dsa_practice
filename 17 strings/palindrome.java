public class palindrome {
    public static void check(int a){
        int temp = a;
        int sum = 0;
        int count = 0;
        int x;
        while (temp>0) {
            x = temp%10;
            sum = sum + (x*((int)Math.pow(10, count)));
            temp = (int)temp/10;
            count += 1;
        }
        System.out.print(sum);
        if (sum == a) {
            System.out.print(" Is Palindrome");
        }
        else{
            System.out.print(" Is Not palindrome");
        }
    }
    public static void main(String[] args) {
        check(121);
    }
}
