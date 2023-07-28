import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueueJCF {

    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());//to reverse sort order

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(8);

        System.out.println(pq);//Makes MIN/MAX heap accordingly

        pq.remove();

        System.out.println(pq);
    }
}