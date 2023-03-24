// import java.util.*;
// public class TreeSe {
//     public static void main(String[] args) {
//         TreeSet ts1 = new TreeSet();
//         ts1.add(100);
//         ts1.add(50);
//         ts1.add(22);
//         ts1.add(70);
//         ts1.add(20);
//         ts1.add(85);
//         System.out.println(ts1);
//     }
// }






//    higher(value)  lower(value)  ceiling(value)  floor(value)

import java.util.*;
public class TreeSe {
    public static void main(String[] args) {
        TreeSet ts1 = new TreeSet();
        ts1.add(50);
        ts1.add(10);
        ts1.add(5);
        ts1.add(20);
        ts1.add(80);
        ts1.add(90);
        ts1.add(40);
        // ts1.add(40);                   //but occured one time only
        System.out.println(ts1);

        System.out.println( ts1.higher(10));
        System.out.println( ts1.lower(10));

        System.out.println(ts1.ceiling(17));
        System.out.println(ts1.floor(18));
    }
}