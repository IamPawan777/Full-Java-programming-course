/*   String:-(Immutable // object never change)
 * 
 * obj.concat("..")  - concat string
 * s1 == s2 || s1.equals(s2) || s1.equalsIgnoreCase(s2)  - compare strings
 * 
 * 
 *   StringBuiler:-(Mutable / changble)
 * 
 * obj.append("..")  - concat string
 * 
 *   StringBuffer:-(Mutable / changble)
 * 
 * obj.append("..")  - concat string
*/



// //.......different mutable and immutable string "declaration"......

// public class StringKnow {
//     public static void main(String[] args) {
//         String name1 = "Harry1";            //...this way
//         System.out.println(name1);

//         StringBuilder name2 = new StringBuilder("Harry1");   //...this way
//         System.out.println(name2);

//         StringBuffer name3 = new StringBuffer("Harry1");            //....this way
//         System.out.println(name3);
//     }
// }





// // ......check mutability and immutability ......

// public class StringKnow {
//     public static void main(String[] args) {
//         String n1 = "Kaviata";            
//         System.out.println(n1);
//         n1.concat("Added");             //...changes in same location but can't
//         System.out.println("after concat: "+n1);

//         StringBuilder n2 = new StringBuilder("Kaviata");   
//         System.out.println(n2);
//         n2.append(" Added");            //...changes in same location and can change
//         System.out.println("after append: "+n2);

//         StringBuffer n3 = new StringBuffer("Kaviata");          
//         System.out.println(n3);
//         n3.append(" Added");            //...changes in same location and can change
//         System.out.println("after append: "+n3);
//     }
// }









// ......Compare ( ==, .equals(), .equalsIgnoreCase() )......

public class StringKnow {
    public static void main(String[] args) {
        String n1 = "Demo";
        String n2 = "Demo";
        String n3 = new String("Demo");
        String n4 = new String("Demo");
        String n5 = new String("DEMO");
        
        System.out.println(n1==n2);     //T
        System.out.println(n1==n3);     //f
        System.out.println(n3==n4);     //f
        System.out.println(n1.equals(n2));      //t
        System.out.println(n1.equals(n3));      //t
        System.out.println(n3.equals(n4));      //t
        System.out.println(n3.equals(n5));      //f
        System.out.println(n1.equalsIgnoreCase(n5));        //t ignore case senstivity
        System.out.println(n3.equalsIgnoreCase(n5));        //t
        
    }
}