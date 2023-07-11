//....funtions are same as HashMap class.....

import java.util.*;

public class LinkedHashMapCl {
    public static void main(String[] args) {
        Map<Integer, String> mp = new LinkedHashMap<>();
        mp.put(2, "pawan"); 
        mp.put(5, "pawan"); 
        mp.put(4, "neha"); 
        mp.put(10, "kamal"); 
        mp.put(1, "hema"); 
        mp.put(8, "harry"); 
        mp.put(2, "Bisht");             //override
        mp.putIfAbsent(2, "whatson");                   //put if key not present
        System.out.println(mp);

        for (var e : mp.entrySet()) {               //retrive values with key  (also use keyset())
            System.out.print(e+" ");
        }
        
        System.out.println();
        System.out.println(mp.get(3));          //if key not present then the null return 
        System.out.println(mp.containsKey(3));                  //boolean
        System.out.println(mp.containsValue("java"));                   //boolean
        System.out.println(mp.size());
        System.out.println(mp.keySet());            //return only keys
        System.out.println("values: "+mp.values());               //return only values
        System.out.println("entry set: "+mp.entrySet());
        
    }
}
