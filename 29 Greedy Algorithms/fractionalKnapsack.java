import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapsack {

    public static void main(String[] args) {
        int[] weight = {10,20,30};
        int[] value = {60,100,120};
        int maxWeight = 50;

        int[] ratio = new int[weight.length];

        for (int i = 0; i < ratio.length; i++) {
            ratio[i] = value[i]/weight[i];
        }

        int[][] weight_value = new int[weight.length][4];

        for (int i = 0; i < weight.length; i++) {
            weight_value[i][0] = i;
            weight_value[i][1] = value[i];
            weight_value[i][2] = weight[i];
            weight_value[i][3] = ratio[i];
        }

        Arrays.sort(weight_value,Comparator.comparingDouble(o -> o[3]));

        int currWeight;
        int totalValue = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = weight_value.length-1; i >= 0 ; i--) {
            currWeight = weight_value[i][2];
            if (maxWeight>currWeight) {
                maxWeight -= currWeight;
                totalValue += weight_value[i][1];
                ans.add(weight_value[i][0]);
            }
            else{
                totalValue += maxWeight*weight_value[i][3];
                ans.add(weight_value[i][0]);
                // maxWeight = 0;
                break;
            }
        }

        System.out.println("Total = " +totalValue);

        System.out.println(ans);

        System.out.println(maxWeight + " KG's "+ ans.get(ans.size()-1) + " is selected");




    }
}