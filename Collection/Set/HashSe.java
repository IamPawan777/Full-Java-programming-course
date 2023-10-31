// //....unordered set of element into memory.......unique value......

// import java.util.*;
// public class HashSe {
//     public static void main(String[] args) {
//         HashSet hs = new HashSet();
//         hs.add(77);
//         hs.add(66);
//         hs.add(55);
//         hs.add(44);
//         hs.add(33);
//         hs.add(22);
//         hs.add(22);
//         hs.add("pawan");
//         System.out.println(hs);

//     }
// }



//....addAll(obj)......

import java.util.*;
public class HashSe {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(77);
        hs.add(66);
        hs.add(55);
        hs.add(44);
        hs.add(33);
        hs.add(22);
        hs.add(22);
        System.out.println(hs);

        HashSet<Integer> hs2 = new HashSet<>(20, 1f);
        hs2.add(33);
        hs2.add(1);
        hs2.add(2);
        hs2.add(4);
		// hs.addAll(hs2);         //.......Union.......
        // System.out.println(hs);

        // hs.retainAll(hs2);           //...intersection
        // System.out.println(hs2);

        hs.removeAll(hs2);                  //.....unique in 1st set..
        System.out.println(hs);

    }
}
