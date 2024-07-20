// //...collection usally store single value....but Map store value "key=value" pair..

// import java.util.*;
// class HashMapCl {
//     public static void main(String[] args) {
//         HashMap m = new HashMap();
//         // Map hm = Collections.synchronizedMap(m);                    //..synchronized map so thread safe
//         hm.put(1, 4);
//         hm.put(null, "XX");
//         hm.put("pawan", "Bisht");
//         hm.put(2, "Bisht");
//         hm.put(null, 3);                    //same 'key' so override the 'value'
//         hm.putIfAbsent(null, "2323");       //by 'putIfAbsent()' method not override the 'value'

//         System.out.println(hm);
//     }
// }






// //......** get or Iterates on keys, value or Entry.........

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
//             int i = (int)itr1.next();                    //can downcast as well
//             // Object i = itr1.next();
//             System.out.println(i);
//         }
// //..or..
//         for (Object ss : s) {
//             System.out.print(ss+" ");
//         }


//         //.....print values only.....
//         Collection c = hm.values();
//         Iterator itr2=c.iterator();
//         while(itr2.hasNext()){
//             String str = (String)itr2.next();
//             System.out.println(str);
//         }
// //..or..
//         for (Object ss : c) {
//             System.out.print(ss+" ");
//         }
//         System.out.println();


//         //.......print key-value(entry)....
//         Set ss=hm.entrySet();
//         Iterator itr = ss.iterator();
//         while(itr.hasNext()){
//             Map.Entry e = (Entry)itr.next();
//             System.out.println(e.getKey()+" :: "+e.getValue());
//             // System.out.println(e);
//         }
// //..or..
//         // for (Map.Entry sss : hm.entrySet()) {               //generic are required
//         //     System.out.println(sss.getKey()+" :: "+sss.getValue());
//         // }

//         System.out.println(hm);
//     }
// }








// //.........example methods.........


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

// //..or...

//     for (var e : mp.entrySet()) {               //retrive values with key  (also use keyset())
//         System.out.print(e+" ");
//     }
//     System.out.println();

// //..or..

//     for (Map.Entry<Integer, String> e : mp.entrySet()) {
//         System.out.print(e.getKey()+" "+e.getValue()+", ");
//     }



//     System.out.println("Element: "+mp.get(3));          //if key not present then the null return 
//     System.out.println(mp.containsKey(3));                  //boolean
//     System.out.println(mp.containsValue("java"));                   //boolean
//     System.out.println(mp.size());
//     System.out.println("Key: "+mp.keySet());            //return only keys
//     System.out.println("values: "+mp.values());               //return only values
//     System.out.println("entry set: "+mp.entrySet());
    
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








// //.........map for employee class.....if we have duplicate keys.........

// import java.util.*;
// import java.util.Map.*;

// class EmpId {                       //get id.....
//     int id;
//     EmpId(int id) {
//         this.id = id;
//     }
//     public String toString() {
//         return id+" ";
//     }
//     public int hashCode(){                  //..(resposible encription)...if we have duplicate keys...{ (capacity)k % key) }
//         return id;
//     }
//     public boolean equals(Object o){
//         if(o instanceof EmpId) {
//             EmpId i= (EmpId)o;
//             if (i.id ==this.id) {
//                 return true;
//             } 
//             else {
//                 return false;
//             }
//         }
//         return false;
//     }
// }


// class EmpName {                       //get value............
//     String name;
//     EmpName(String name){
//         this.name = name;
//     }
//     public String toString() {
//         return name;
//     }
// }
// class HashMapCl {
//     public static void main(String[] args) {
//         EmpId id1 = new EmpId(101);
//         EmpId id2 = new EmpId(101);
//         EmpId id3 = new EmpId(23);
//         EmpName name1 = new EmpName("Ram");
//         EmpName name2 = new EmpName("jojo");
//         EmpName name3 = new EmpName("ishan");

//         HashMap<EmpId, EmpName> h = new HashMap<>();                    ///...HashMap
//         h.put(id1, name1);
//         h.put(id2, name2);
//         h.put(id3, name3);

//         // HashMap<EmpId, EmpName> obj2 = new HashMap<>();
//         // HashMap<EmpId, EmpName> obj3 = new HashMap<>();

//         for (Map.Entry<EmpId, EmpName> s : h.entrySet()) {              //...generic is required
//             System.out.println(s.getKey()+" "+s.getValue());
//         }
// //or...................
//         // Set<Map.Entry<EmpId, EmpName>> ss=h.entrySet();
//         // Iterator itr = ss.iterator();
//         // while(itr.hasNext()){
//         //     Map.Entry e = (Entry)itr.next();
//         //     System.out.println(e.getKey()+"  "+e.getValue());
//         // }


//     }
// }





// highest frequency of element in an array.............

import java.util.HashMap;
import java.util.Map;

public class HashMapCl {
    static void findMostFreqad(int[] a) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(var i : a){
            if(!mp.containsKey(i)){
                mp.put(i, 1);
            }
            else{
                mp.put(i, mp.get(i)+1);
            }
        }
        
        int maxFreq = 0;
        int ans = -1;
        for(var i : mp.keySet()) {              // key
            if(maxFreq < mp.get(i)){            // value
                maxFreq = mp.get(i);
                ans = i;
            }
        }
        System.out.printf("%d has occurs %d times", ans, maxFreq);              // formating
    }
    public static void main(String[] args) {
        int[] a = {1,9,5,2,5,1,2,5, };
        findMostFreqad(a);
    }
    
}