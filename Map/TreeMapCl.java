/**
 * ....Constructor.............
 * TreeMap t = new TreeMap();               //....Default sorting 
 * TreeMap t = new TreeMap(Comparator c);               //...custoized sorting order
 * TreeMap t = new TreeMap(SortedMap m);
 * TreeMap t = new TreeMap(Map m);
 * 
 */


// //.....keys are only homogeneouse...

// import java.util.*;
// public class TreeMapCl {
//     public static void main(String[] args) {
//         TreeMap tm = new TreeMap();
//         tm.put(23, "lokesh");
//         tm.put(12, "kamak");
//         tm.put(11, "elephent");
//         tm.put(26, 23);
//         tm.put(33, "harry");

//         System.out.println(tm);
//         System.out.println(tm.firstKey()+"  "+tm.lastKey());
//         System.out.println(tm.headMap(23)+"  "+tm.tailMap(23));
//         System.out.println("sub map: "+tm.subMap(12, 26));
//         System.out.println(tm.comparator());
//     }
// }




//.........customized sorting order........

import java.util.*;
import java.util.Map.*;
public class TreeMapCl {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap(new MyDemo());         //..reverse order........
        tm.put("ZZ", "lokesh");
        tm.put("BB", "kamak");
        tm.put("KK", "elephent");
        tm.put("AA", 23);
        tm.put("YY", "harry");

        for(Object mp : tm.keySet()) {
            // Map.Entry m = (Map.Entry) 

            System.out.print(mp+": "+tm.get(mp)+" ");
        }
        System.out.println();


        // for (Map.Entry s : (Map.Entry)tm.entrySet()) {              //...generic is required
        //     System.out.println(s.getKey()+" "+s.getValue());
        // }


        Set s = tm.entrySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Map.Entry m = (Map.Entry) itr.next();
            System.out.println(m.getKey()+" "+m.getValue());
        }        
    }
}

class MyDemo  implements Comparator {
    public int compare(Object ob1, Object ob2) {
        String s1 = ob1.toString();
        String s2 = ob2.toString();
        return s2.compareTo(s1);
    }
}




// //.....methods...

// import java.util.*;
// public class TreeMapCl {
//     public static void main(String[] args) {
//         TreeMap tm = new TreeMap();
//         tm.put(23, "lokesh");
//         tm.put(12, "kamak");
//         tm.put(11, "elephent");
//         tm.put(26, 23);
//         tm.put(33, "harry");

//         System.out.println(tm);
//         System.out.println(tm.firstEntry()+" "+tm.lastEntry());
//         System.out.println(tm.pollFirstEntry());            //return first entry and remove
//         System.out.println(tm.pollLastEntry());
//     }
// }
