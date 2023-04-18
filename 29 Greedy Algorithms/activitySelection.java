import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class activitySelection {

    public static void main(String[] args) {
        int s[] = {1,3,0,5,8,5};
        int e[] = {2,4,6,7,9,9};
        
        int activities[][] = new int[s.length][3];

        for (int index = 0; index < s.length; index++) {
            activities[index][0] = index;
            activities[index][1] = s[index];
            activities[index][2] = e[index];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 0;

        maxAct = 1;
        ans.add(0);
        
        int lastEnd = activities[0][2];

        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("No. of activities = " + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }

    }
}