// ...HashSet not maintain the order but LinkedHashSet maintain the order.......

import java.util.*;

public class LinkedHashSe {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(22);
        lhs.add(33);
        lhs.add(44);
        lhs.add(55);
        lhs.add(66);
        lhs.add(77);
        lhs.add(88);
        lhs.add(88);
        lhs.add("Bisht ji");

        System.out.println(lhs);
    }
}
