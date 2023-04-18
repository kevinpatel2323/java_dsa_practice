import java.util.ArrayList;
import java.util.Collections;

public class jobSequencing {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a,b)->b.profit-a.profit);//lambda function

        ArrayList<Integer> ans = new ArrayList<>();
        int time = 0;
        int profit = 0;    
        for (int index = 0; index < jobs.size(); index++) {
            Job curr = jobs.get(index);
            if (curr.deadline>time) {
                ans.add(curr.id);
                profit += curr.profit;
                time++;
            }
        }

        System.out.println(ans + " " +profit);

    }
}
