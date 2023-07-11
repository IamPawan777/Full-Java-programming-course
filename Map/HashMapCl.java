////...collection usally store single value....but Map store value "key=value" pair..

import java.util.*;

class HashMapCl {
    public static void main(String[] args) {
    Map<Integer, String> mp = new HashMap<>();
    mp.put(2, "pawan"); 
    mp.put(5, "java"); 
    mp.put(4, "neha"); 
    mp.put(10, "kamal"); 
    mp.put(1, "hema"); 
    mp.put(8, "harry"); 
    mp.put(2, "Bisht");                 //key repeated.....override the value
    mp.putIfAbsent(3, "whatson");                   //put if key not present
    System.out.println(mp);      //or mp.entrySet()

    Set<Map.Entry<Integer, String>> t = mp.entrySet();      //retrive values 
    Iterator itr = t.iterator();
    while(itr.hasNext()) {
        System.out.print(itr.next()+" ");
    }
    System.out.println();
    
    for (var e : mp.entrySet()) {               //retrive values with key  (also use keyset())
        System.out.print(e+" ");
    }
    
    System.out.println(mp.get(3));          //if key not present then the null return 
    System.out.println(mp.containsKey(3));                  //boolean
    System.out.println(mp.containsValue("java"));                   //boolean
    System.out.println(mp.size());
    System.out.println(mp.keySet());            //return only keys
    System.out.println("values: "+mp.values());               //return only values
    System.out.println("entry set: "+mp.entrySet());
    
    }
}