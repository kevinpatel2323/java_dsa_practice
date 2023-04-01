/**
 * binaryString
 */
public class binaryString {

    public static void binstr(int n,int last,String str){
        if (n==0) {
            System.out.println(str);
            return;
        }

        binstr(n-1, 0, str+"0");

        if (last==0) {
            binstr(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        binstr(3, 0, "");
    }
}