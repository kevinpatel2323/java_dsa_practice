import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class maxLenChainPair {
    public static void main(String[] args) {
        int[][] a = {{5,24},{39,60},{5,28},{27,40},{50,90}};

        Arrays.sort(a,Comparator.comparingDouble(o -> o[1]));

        int chainLen = 0;

        chainLen++;
        int currLast = a[0][1];

        for (int i = 1; i < a.length; i++) {
            if (a[i][0] > currLast) {
                chainLen++;
                currLast = a[i][1];
            }
        }

        System.out.println("Maximum length of chain = "+ chainLen);


    }
}
