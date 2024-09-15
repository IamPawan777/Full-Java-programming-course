// package Stack;
// import java.util.Stack;

// public class Basics_Stack {
//     public static void main(String[] args) {
//         Stack<Integer> st = new Stack<>();              // dynamic size (unlimited)
//         st.push(23);
//         st.push(12);
//         st.push(98);
//         st.push(77);
        
//         st.pop();
        
//         System.out.println(st.peek());              // peek = top
        
//         System.out.println(st);  
        
//         System.out.println(st.size()); 
//         System.out.println(st.isEmpty());           // boolean
//     }
// }






// // copy the element in another stack

// package Stack;
// import java.util.Stack;

// public class Basics_Stack {
//     public static void main(String[] args) {
//         Stack<Integer> st1 = new Stack<>();             
//         st1.push(11);
//         st1.push(22);
//         st1.push(33);
//         st1.push(44);
//         System.out.println(st1);
        
//         Stack<Integer> st2 = new Stack<>();
//         while(st1.size() > 0){
//             st2.push(st1.pop());
//         }

//         Stack<Integer> st3 = new Stack<>();
//         while(st2.size() > 0){
//             st3.push(st2.pop());
//         }
//         System.out.println(st3);
//         System.out.println(st1);                //now empty
//     }
// }






// // push at any position

// package Stack;
// import java.util.Stack;

// public class Basics_Stack {
//     public static void main(String[] args) {
//         Stack<Integer> st1 = new Stack<>();             
//         st1.push(11);
//         st1.push(22);
//         st1.push(33);
//         st1.push(44);
//         st1.push(55);
//         System.out.println(st1);
        
//         int val = 100;
//         int posi = 2;

//         Stack<Integer> st2 = new Stack<>();         //copy another stack
//         while(st1.size() > posi){
//             st2.push(st1.pop());
//         }

//         st1.push(val);
//         while(st2.size() > 0){
//             st1.push(st2.pop());
//         }
//         System.out.println(st1);
        
//     }
// }






// // pop at any position

package Stack;
import java.util.Stack;

public class Basics_Stack {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();             
        st1.push(11);
        st1.push(22);
        st1.push(33);
        st1.push(44);
        st1.push(55);
        System.out.println(st1);
        
        
        
    }
}





// // print stack element......

// package Stack;
// import java.util.Stack;

// public class Basics_Stack {

//     public static void dispRec(Stack<Integer> st) {
//         if(st.size() == 0){
//             return;
//         }
//         int top  = st.pop();
//         dispRec(st);
//         System.out.println(top);
//         st.push(top);
//     }

//     public static void main(String[] args) {
//         Stack<Integer> st1 = new Stack<>();             
//         st1.push(11);
//         st1.push(22);
//         st1.push(33);
//         st1.push(44);
//         st1.push(55);
        
//         // Stack<Integer> st2 = new Stack<>();                  // using  stack
//         // while(st1.size() > 0) {
//         //     st2.push(st1.pop());
//         // }
//         // while(st2.size() > 0){
//         //     System.out.printf("element is : %d \n",st2.peek());
//         //     st1.push(st2.pop());
//         // }

// //.....or.........

//         // int n = st1.size();                                    // using array
//         // int[] arr = new int[n];
//         // int ind = n;
//         // while(ind-- > 0){
//         //     arr[ind] = st1.pop();
//         // }
//         // for (int i = 0; i < arr.length; i++) {
//         //     System.out.println(arr[i]);
//         //     st1.push(arr[i]);
//         // }

// //...... or..........

//         dispRec(st1);   
//         System.out.println(st1); 
//     }
// }
