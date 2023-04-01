
public class frndParing {

    public static int frdpar(int n) {
        if (n==1 || n==2) {
            return n;
        }
        //single
        int single = frdpar(n-1);

        //pair
        int pair = (n-1) * frdpar(n-2);

        return single + pair;
    }
    
    public static void main(String[] args) {
        System.out.println(frdpar(3));
    }
}