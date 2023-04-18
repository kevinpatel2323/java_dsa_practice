import java.lang.reflect.Array;
import java.util.Arrays;

//mininum sum absolute difference
public class minSumAbsDif {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        int[] a2 = {2,1,3};

        Arrays.sort(a1);
        Arrays.sort(a2);

        int minDiff = 0;

        for (int i = 0; i < a2.length; i++) {
            minDiff += Math.abs(a1[i] - a2[i]);
        }

        System.out.println("Min sum absolute difference = " + minDiff);
    }
}
