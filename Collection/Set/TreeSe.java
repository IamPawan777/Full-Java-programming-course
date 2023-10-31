//...store unique element and sorted order......

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






// //    higher(value)  lower(value)  ceiling(value)  floor(value)

// import java.util.*;
// public class TreeSe {
//     public static void main(String[] args) {
//         TreeSet<Integer> ts1 = new TreeSet<>();
//         ts1.add(50);
//         ts1.add(10);
//         ts1.add(5);
//         ts1.add(20);
//         ts1.add(80);
//         ts1.add(90);
//         ts1.add(40);
//         ts1.add('t');

//         // ts1.add(40);                   //but occured one time only
//         System.out.println(ts1);          //  [5, 10, 20, 40, 50, 80, 90]

//         System.out.println( ts1.higher(10));
//         System.out.println( ts1.lower(10));

//         System.out.println(ts1.ceiling(17));
//         System.out.println(ts1.floor(18));

//         System.out.println(ts1.headSet(40));

//         System.out.println(ts1.subSet(20, 81));             //[ 20 40 50 80 )
//     }
// }







//...comparable constructor....default treeSet Constructor.

// class TreeSe {
//     public static void main(String[] args) {
//         System.out.println("Z".compareTo("A"));
//         System.out.println("A".compareTo("Z"));
//         System.out.println("S".compareTo("S"));
//     }
// }






//.....comparator constructor.........

import java.util.*;
class TreeSe {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>( new Demo());
        ts.add(12);
        ts.add(33);
        ts.add(1);
        ts.add(9);
        ts.add(5);
        ts.add(67);
        ts.add(23);
        ts.add(77);
        ts.add(3);
        ts.add(1);
        System.out.println(ts);
    }
}

class Demo implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;

        if(I1 < I2) return +1;
        else if(I1 > I2) return -1;
        else return 0;

    }
}