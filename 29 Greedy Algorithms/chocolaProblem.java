import java.util.*;

public class chocolaProblem {
    public static void main(String[] args) {
        
        int m = 4,n = 6;

        Integer costVertical[] = {2,1,3,1,4}; 
        Integer costHorizontal[] = {4,2,1};

        Arrays.sort(costHorizontal,Collections.reverseOrder());
        Arrays.sort(costVertical,Collections.reverseOrder());


        int h=0,v = 0;
        int hp=1,vp = 1;
        int cost = 0;
        while (h<costHorizontal.length && v<costVertical.length) {
            if (costVertical[v] <= costHorizontal[h]) {
                cost += (costHorizontal[h] * vp);
                hp++;
                h++;
            }
            else{
                cost += (costVertical[v] * hp);
                vp++;
                v++;
            }
        }

        while (h<costHorizontal.length) {
            cost += (costHorizontal[h] * vp);
            hp++;
            h++;  
        }

        while (v<costVertical.length) {
            cost += (costVertical[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Total cost " + cost);
    }
}
