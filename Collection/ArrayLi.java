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







// // ....add() ....add data..and can add specific index......

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






// //.........addAll() ........add another collection..and add another collection in specific index....

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






//........contains(), indexOf(), size(), ensureCapacity(), trimToSize(), clear()

import java.util.*;

// import javax.xml.transform.Source;

class ArrayLi {
    public static void main(String[] args) {
        ArrayList ar1 = new ArrayList();
        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        System.out.println(ar1);
        
        System.out.println( ar1.contains(200 ));        //return boolean value

        int index = ar1.indexOf(20);
        System.out.println("index: "+index);

        System.out.println("size of array: "+ar1.size());        

        ar1.ensureCapacity(10);                 //minimum 10 size occupy
        System.out.println("capacity:"+ar1);
        ar1.trimToSize();               //...after minimum capacity occupy..by ensureCapacity() method trim the number of element we have
        System.out.println("capacity ofter trime: "+ar1.size());

        ar1.clear();
        System.out.println(ar1);
    }
}





