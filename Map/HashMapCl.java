////...collection usally store single value....but Map store value "key=value" pair..

// import java.util.*;
// class HashMapCl {
//     public static void main(String[] args) {
//         HashMap hm = new HashMap();
//         hm.put(1, 4);
//         hm.put(null, "XX");
//         hm.put("pawan", "Bisht");
//         hm.put(2, "Bisht");
//         hm.put(null, 3);                    //same 'key' so override the 'value'
//         hm.putIfAbsent(null, "2323");       //by 'putIfAbsent()' method not override the 'value'

//         System.out.println(hm);
//     }
// }





// //......Iterates on keys, value and Entry.........

// import java.util.*;
// import java.util.Map.*;

// class HashMapCl {
//     public static void main(String[] args) {
//         HashMap hm = new HashMap();
//         // hm.put("aa", "pawan");
//         // hm.put("ab", "pawan");
//         hm.put(2, "Bisht");
//         hm.put(1, "pawan");  
//         hm.put(3, "Harry");
//         hm.put(4, "Lakash");
//         hm.put(5, "naveen");
//         hm.put(6, "ashtha");
//         hm.put(8, "mohamadh");
//         hm.put(7, "faraj");

//         //...print keys only.....
//         Set s = hm.keySet();                    //using 'keySet()'
//         Iterator itr1 = s.iterator();
//         while(itr1.hasNext()) {
//             Integer i = (Integer)itr1.next();
//             System.out.println(i);
//         }

//         //.....print values only.....
//         Collection c = hm.values();
//         Iterator itr2=c.iterator();
//         while(itr2.hasNext()){
//             String str = (String)itr2.next();
//             System.out.println(str);
//         }

//         //.......print key-value(entry)....
//         Set ss=hm.entrySet();
//         Iterator itr = ss.iterator();
//         while(itr.hasNext()){
//             Entry e = (Entry)itr.next();
//             System.out.println(e.getKey()+" :: "+e.getValue());
//             // System.out.println(e);
//         }

//         System.out.println(hm);
//     }
// }







// //.........map for employee class.........

// import java.util.*;
// import java.util.Map.*;

// class Employee {
//     private int id;
//     private String name;
//     private float salary;

//     public Employee(int i, String n, float s){
//         id = i;
//         name = n;
//         salary = s;
//     }
    
//     public String toString() {                  //..Getter return objects...toString() method is use for get the data (Object to String type)
//         return id+" "+name+" "+" "+salary;
//     }
// }
// class HashMapCl {
//     public static void main(String[] args) {
//         Employee em1 = new Employee(1, "Ramesh", 23.23f);
//         Employee em2 = new Employee(3, "Harry", 3.3f);
//         Employee em3 = new Employee(2, "lakshmi", 9.99999f);

//         Map m = new HashMap();
//         m.put(11, em1);
//         m.put(22, em2);
//         m.put(33, em3);

//         Set s = m.entrySet();
//         Iterator itr = s.iterator();
//         while(itr.hasNext()) {
//             Entry e = (Entry)itr.next();
//             System.out.println(e.getKey()+" : "+e.getValue());
//         }
//     }
// }






//.........example.........

import java.util.*;

class HashMapCl {
    public static void main(String[] args) {
        // int arr[] = {1 1 2 2 2 2 3};
        int X = 44;  //o/p 4
        int count=0;
        // ListIterator<Integer> itr = v.listIterator<>();
        // while(itr.hasNext()) {
        //     v.add(itr);
        // }
        // for(int i : arr) {
        //     v.add(i);
        // }
        // for(int i=0; i<n; i++) {
            //     if(v.contains(X)){
            //         count++;
            //     }
            // }
            // return count;
            int[] arr = {2,4,3,3, 5,5,7};

            ArrayList<Integer> v = new ArrayList<>();
 
            for(int i : arr) {
                v.add(i);
            }
            int firstOccurence = v.indexOf(X);
            int lastOccurence = v.lastIndexOf(X);
            int i = lastOccurence - firstOccurence;
            // int i = li.indexOf(x);
            System.out.println(firstOccurence);
            System.out.println(lastOccurence);

        System.out.println(i);
        
        
    }
}








// import java.util.*;

// class HashMapCl {
//     public static void main(String[] args) {
//     Map<Integer, String> mp = new HashMap<>();
//     mp.put(2, "pawan"); 
//     mp.put(5, "java"); 
//     mp.put(4, "neha"); 
//     mp.put(10, "kamal"); 
//     mp.put(1, "hema"); 
//     mp.put(8, "harry"); 
//     mp.put(2, "Bisht");                 //key repeated.....override the value
//     mp.putIfAbsent(3, "whatson");                   //put if key not present
//     System.out.println(mp);      //or mp.entrySet()

//     Set<Map.Entry<Integer, String>> t = mp.entrySet();      //retrive values 
//     Iterator itr = t.iterator();
//     while(itr.hasNext()) {
//         System.out.print(itr.next()+" ");
//     }
//     System.out.println();
    
//     for (var e : mp.entrySet()) {               //retrive values with key  (also use keyset())
//         System.out.print(e+" ");
//     }
    
//     System.out.println(mp.get(3));          //if key not present then the null return 
//     System.out.println(mp.containsKey(3));                  //boolean
//     System.out.println(mp.containsValue("java"));                   //boolean
//     System.out.println(mp.size());
//     System.out.println(mp.keySet());            //return only keys
//     System.out.println("values: "+mp.values());               //return only values
//     System.out.println("entry set: "+mp.entrySet());
    
//     }
// }