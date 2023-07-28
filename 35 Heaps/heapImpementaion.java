import java.util.ArrayList;

public class heapImpementaion {

    static class Heap{
        ArrayList<Integer> a = new ArrayList<>();

        public void add(int data){
            a.add(data);

            int x = a.size()-1;
            int par = (x-1)/2;

            while (a.get(x)<a.get(par)) {
                int temp = a.get(x);
                a.set(x,a.get(par));
                a.set(par,temp);

                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return a.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left<a.size() && a.get(minIdx)>a.get(left)){
                minIdx = left;
            }

            if(right<a.size() && a.get(minIdx)>a.get(right)){
                minIdx = right;
            }

            if (minIdx != i) {
                int temp = a.get(minIdx);
                a.set(minIdx, a.get(i));
                a.set(i,temp);

                heapify(i);
            }
        }
        public int remove(){
            int data = a.get(0);

            int temp = a.get(a.size()-1);
            a.set(a.size()-1, a.get(0));
            a.set(0,temp);

            a.remove(a.size()-1);

            heapify(0);

            return data;
        }

        public void printHeap(){
            System.out.println(a);
        }
        
        
    }
    public static void main(String arge[]){
        Heap h = new Heap();

        h.add(3);
        h.add(8);
        h.add(1);
        h.add(2);

        h.printHeap();

        System.out.println(h.peek());

        System.out.println(h.remove());

        h.printHeap();

    }
}
