import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String str = sc.nextLine();
        
        int x = str.length()-1;
        boolean flag = true;

        for (int i = 0; i <= x/2; i++) {
            if (str.charAt(i) != str.charAt(x-i)) {
                System.out.println("Not palindrome");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        }
    }
}
