// //   list lli = new LinkedList();
// //   Queue lli = new LinkedList();
// //   Dequeue lli = new LinkedList();
// //   LinededList lli = new LinkedList();         prefead to use this line





// import java.util.LinkedList;

// public class LinkedLis {
//     public static void main(String[] args) {
//         LinkedList ll1 = new LinkedList();              //   list lli = new LinkedList();
//         ll1.add(22);
//         ll1.add("Name");
//         ll1.add('e');
//         System.out.println(ll1);
//     }
// }





// import java.util.*;

// class LinkedLis {
//     public static void main(String[] args) {
//         LinkedList ll1 = new LinkedList<>();
//         ll1.add(12);
//         ll1.add("pawan");
//         ll1.add('2');
//         System.out.println(ll1);

//         LinkedList ll2 = new LinkedList<>();
//         ll2.add(55);
//         ll2.add(ll1);
//         System.out.println(ll2);

//     }
// }






// //......addFirst(value)  addLast(value)  

// import java.util.*;

// class LinkedLis {
//     public static void main(String[] args) {
//         LinkedList ll1 = new LinkedList();
//         ll1.add(23);
//         ll1.add(23);
//         ll1.add(23);
//         ll1.add(2, 0);
//         System.out.println(ll1);

//         ll1.addFirst("pawan");
//         ll1.addLast('B');
//         System.out.println(ll1);

//     }
// }







//......peek()  poll()  get(index)  indexOf(value)  lastIndexOf(value)  getFirst()  getLast()  push(value)  pop()

import java.util.*;

class LinkedLis {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        ll1.add(22);
        ll1.add(55);
        ll1.add(55);
        ll1.add(34);
        ll1.add("pw");
        ll1.add('z');

        System.out.println(ll1);
        
        System.out.println("Value: "+ll1.get(1));            //return value of index
        
        System.out.println("Index: "+ll1.indexOf("pw"));          //return index

        System.out.println("last occurence: "+ll1.lastIndexOf(55));            //return last occurence of the specific value

        System.out.println("first value: "+ll1.getFirst());
        System.out.println("last value: "+ll1.getLast());
        
        System.out.println(ll1.peek());                 //return 1st value....never effect the main list
        System.out.println(ll1);
    
        System.out.println(ll1.poll());                 //return 1st value....but remove 1st element permanently
        System.out.println(ll1);

        ll1.push("OM");                     //push at biggining
        System.out.println(ll1);

        ll1.pop();                              //pop biggining element
        ll1.pop();
        System.out.println(ll1);
    }
}