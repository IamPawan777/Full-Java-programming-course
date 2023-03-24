

import java.util.*;

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue value = new PriorityQueue();
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

        value.add("ppawan");        //not allow
        value.add(null);        //not allow
        
        value.remove();             //delete first value
        System.out.println(value);
    }
}
