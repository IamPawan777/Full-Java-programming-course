/**    Mandatory import file " java.util.* ";
 * 
 * obj.add(element);                add new object..
 * obj.add(index, object)           add new object at specific index
 * obj.addAll(obj2)                 add new object's in another object
 * obj.size()                       return size of list
 * obj.get(index)                   return element
 * obj.indexOf(element)             return index                     
 ** obj.set(index, element)         (modifie value) add new element but replace
 * obj.contains(element)            return boolean
 * obj.contains(Integer.valueOf(element))      return boolean
 * obj.indexOf(element)             return index of element
 * obj.ensureCapacity(min_size)         atleast occupy size 
 * obj.clear()                      clear the list
 * obj.remove(index)                delete value by index
 * obj.remove(Integer.valueOf(element))      delete value by value
 * Collections.sort(obj);
 */




// //......standerd way......

// import java.util.*;

// class ArrayLi {
//     public static void main(String[] args) {
//         List ar = new ArrayList();          //standerd way
//         ar.add("praveen");
//         ar.add(22);
//         System.out.println(ar);
//     }
// }







// // ....add() ....add data at Rear end..and can add specific index but not recommended......

// import java.util.*;

// public class ArrayLi {
//     public static void main(String[] args) {
//         ArrayList al1 = new ArrayList();                //black array memory
//         al1.add("Naneen");                  // 'Naveen' is an object here
//         al1.add(null);                          //null also allowed
//         al1.add(12);
//         al1.add(232.3);
//         al1.add(89.77f);
//         al1.add('3');
//         al1.add('3');                   //duplicate is allowed
//         System.out.println(al1);

//         al1.add(1, 444);                   //dynamic size add spesific index
//         System.out.println(al1);
//     }
// }






//.........addAll() ........add another collection..and add another collection in specific index....

// import java.util.ArrayList;

// class ArrayLi{
//     public static void main(String[] args) {
//         ArrayList al1 = new ArrayList();
//         al1.add('P');
//         al1.add("hariom");
//         al1.add(2333);
//         al1.add(9569);
//         System.out.println(al1);

//         ArrayList al2 = new ArrayList();
//         al2.add(1);
//         al2.add(2);
//         al2.add(3);
//         al2.add(4);

//         al2.addAll(al1);                    //addAll() add another collection
//         System.out.println(al2);

//         al1.addAll(2, al2);             //addAll()  add another collection......at specific index
//         System.out.println(al1);
//     }
// }






// //........contains(), indexOf(), size(), ensureCapacity(), trimToSize(), clear()

// import java.util.*;

// // import javax.xml.transform.Source;

// class ArrayLi {
//     public static void main(String[] args) {
//         ArrayList ar1 = new ArrayList();
//         ar1.add(10);
//         ar1.add(20);
//         ar1.add(30);
//         System.out.println(ar1);
        
//         System.out.println( ar1.contains(200 ));        //return boolean value

//         int index = ar1.indexOf(20);
//         System.out.println("index: "+index);

//         System.out.println("size of array: "+ar1.size());        

//         ar1.ensureCapacity(10);                 //minimum 10 size occupy
//         System.out.println("capacity:"+ar1);
//         ar1.trimToSize();               //...after minimum capacity occupy..by ensureCapacity() method trim the number of element we have
//         System.out.println("capacity ofter trime: "+ar1.size());

//         ar1.clear();
//         System.out.println(ar1);
//     }
// }




// //.........reverse array............

// import java.util.*;
// class ArrayLi {
//     static void reverseList(List<Float> lis) {
//         int i=0, j=lis.size()-1;
//         while(i < j) {
//             Float temp = lis.get(i);
//             lis.set(i, lis.get(j));
//             lis.set(j, temp);
//             i++; j--;
//         }
//     }
//     public static void main(String[] args) {
//         List<Float> li = new ArrayList<>();
//         li.add(23.2f);
//         li.add(12.1124f);        
//         li.add(.4f);
//         li.add(3f);        

//         System.out.println(li);   
//         System.out.println(li.indexOf(3f));             //return index
//         System.out.println(li.get(0));                  //return value

//         reverseList(li);
//         System.out.println(li);
//     }
// }


// or


// import java.util.*; 

// class ArrayLi {
//     public static void main(String[] args) {
//         ArrayList<Integer> li = new ArrayList<>();
//         li.add(23);
//         li.add(44);
//         li.add(99);
//         li.add(53);

//         Collections.reverse(li);
        
//         for (Integer i : li) {
//             System.out.print(i+" ");
//         }
//     }
// }





// //.......sort an array "ascending and desceding".....

// import java.util.*;

// class ArrayLi {
//     public static void main(String[] args) {
//     List<String> li = new ArrayList<>();
//     li.add("pawan");        
//     li.add("kamal");        
//     li.add("aman");        
//     li.add("kiran");        
//     li.add("zeaden");        
//     li.add("preety");        

//     Collections.sort(li);               //ascending
//     for(String i : li) {
//         System.out.print(i+" ");
//     }
//     System.out.println();

//     Collections.sort(li, Collections.reverseOrder());    //descending
//     for(String i : li) {
//         System.out.print(i+" ");
//     }
        
//     }
// }






//.......change LinkedList to ArrayList.........

// import java.util.*;

// class ArrayLi {
//     public static void main(String[] args) {
//         LinkedList<String> lii = new LinkedList<>();
//         ArrayList<String> li = new ArrayList<>(lii);
//         li.add("pawan");        
//         li.add("kamal");        
//         li.add("aman");        
//         li.add("kiran");        
//         li.add("zeaden");        
//         li.add("preety");        

//         for(String i : li) {
//             System.out.print(i+" ");
//         }   
//     }
// }






// //.......change Collection to Array.........

// import java.util.*;

// class ArrayLi {
//     public static void main(String[] args) {
//         List<Integer> li = new ArrayList<>();
//         li.add(111);        
//         li.add(22);        
//         li.add(444);        
//         li.add(999);        
//         li.add(111);        
//         li.add(5);        
            

//         // Object[] arr = li.toArray();
//         //.....or..... 
//         // Integer[] arr = new Integer[li.size()];
//         // Object[] arr = new Object[li.size()];
//         int[] arr = new int[li.size()];
//         for (int i = 0; i < li.size(); i++) {
//             arr[i] = li.get(i);
//         }

//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         } 
//         //.....or..... 
//         // for (Object o : arr) {
//         //     System.out.print(o+" ");
//         // }  
//     }
// }








// //...change array to collection....


// import java.util.*;
// public class ArrayLi {
//     public static void main (String[] args) {

// 		int[] input = new int[]{1,2,3,4};
// 		List<Integer> output = new ArrayList<>();		
// 		for (int i : input) {
//     		output.add(i);
// 		}
// 	    System.out.println(output);
// 	}
// }




import java.util.*;
class ArrayLi {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(12);
        li.add(11);
        li.add(90);
        li.add(67);
        li.add(3);
        System.out.println(li);

        ArrayList<Integer> lii = new ArrayList<>();
        lii.add(23);
        lii.add(67);
        lii.add(20);
        lii.add(2);
        lii.add(11);

        System.out.println(lii);
        li.retainAll(lii);
        System.out.println(li);
    }
}