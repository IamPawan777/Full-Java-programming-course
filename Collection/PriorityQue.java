//..........follow min heap DS.....(smallest valu....high priority )
//..........but if we use the " Comparator.reverseOrder() " the highest value high priority

import java.util.*;

public class PriorityQue {
    static void priorityExample() {
        PriorityQueue value = new PriorityQueue(Comparator.reverseOrder());
        value.add(5);
        value.add(7);
        value.add(3);
        value.add(6);
        value.add(8);
        value.add(5);
        value.add(9);
        value.add(8);
        value.add(4);
        System.out.println(value);
    
        //value.add("ppawan");        //not allow
       // value.add(null);        //not allow
       System.out.println(value.peek());
        System.out.println(value.poll());          //retrive also delete first value (can remove())
        System.out.println(value);
    }

    public static void main(String[] args) {
        priorityExample();
    }
}
