import java.util.*;
import java.util.Collections;


public class arrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr);//[1, 2, 3, 4, 5]
        
        System.out.println(arr.size());//5

        System.out.println(arr.get(0));//1

        Collections.sort(arr,Collections.reverseOrder());

        System.out.println(arr);//[5, 4, 3, 2, 1]

        Collections.reverse(arr);

        System.out.println(arr);//[1, 2, 3, 4, 5]

        //Multi-dimensional ArrayList

        ArrayList<ArrayList> mularr = new ArrayList<>();

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);
        arr1.add(9);
        arr1.add(10);

        mularr.add(arr1);
        mularr.add(arr);

        System.out.println(mularr);//[[6, 7, 8, 9, 10], [1, 2, 3, 4, 5]]
    }
}
