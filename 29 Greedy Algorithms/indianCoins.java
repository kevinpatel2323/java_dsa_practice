import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class indianCoins {
    public static void main(String[] args) {
        Integer a[] = {1,2,5,10,20,50,100,500,2000};
        
        Arrays.sort(a,Collections.reverseOrder());

        int value = 1059;
        int[] ans = new int[a.length];

        for (int i = 0; i < ans.length; i++) {
            int x = value/a[i];
            ans[i] = (int) Math.floor(x); 
            value -= x*a[i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.println(a[i]+" = "+ ans[i]);
        }
    }
}
