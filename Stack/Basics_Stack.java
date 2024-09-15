package Stack;

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






// // // pop at any position

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
        
        
        
//     }
// }








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







// // stack Implemantation using Array

// class Basics_Stack {
//     static class Stack{
//         int n = 5;
//         int[] arr = new int[n];
//         int top = -1;

//         void push(int x) {                                             // push
//             if(top==n-1)    {
//                 System.out.println("Stack overflow");
//                 return;
//             }   
//             else {
//                 top++;
//                 arr[top] = x;
//             }
//         }

//         int peek() {                                                    // peek
//             if(top == -1)  {
//                 System.out.println("Stack Empty...");
//                 return 0;
//             } 
//             return arr[top];
//         }

//         int pop() {                                                    // pop
//             if(top==-1){
//                 System.out.println("Stack Underflow..");
//                 return 0;
//             }
//             int val = arr[top];
//             arr[top] = 0;
//             top--;
//             return val;
//         }

//         void display() {                                                // display
//             System.out.println("Elements are: ");
//             for (int i = top; i >= 0; i--) {   
//                 System.out.print(arr[i]+" ");
//             }
//             System.out.println();
//         }
        
//         int size(){                                                     // size
//             return top+1;
//         }

//         boolean isEmpty() {                                             // check empty
//             if(top==-1) return true;
//             else return false;
//         }

//         boolean isFull() {                                              // check full or not
//             if(top == n-1) return true;
//             return false;
//         }
        
//         int capacity() {                                                // check stack size
//             return n;
//         }
//     }
//      public static void main(String[] args) {
//         Stack st = new Stack();
//         st.push(12);
//         st.push(12);
//         st.push(33);
//         st.push(33);
//         st.push(90);
//         // st.push(90);

//         st.display();

//         System.out.println("Peek element is: "+st.peek());

//         System.out.println("Size : "+st.size());
//         int val1 = st.pop();
//         int val2 = st.pop();
//         System.out.println("pop : "+val1);
//         System.out.println("pop : "+val2);

//         System.out.println("Size : "+st.size());
//         System.out.println("Is stack empty ?: "+st.isEmpty());
//         System.out.println("Is stack full ?: "+st.isFull());
        

//         System.out.println("Stack capacity: "+st.capacity());
//      }
// }









// // Linked List Implementation of Stack

// class Basics_Stack{
//     public static class Node {
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//         }
//     }

//     public static class Stack {
//         private Node head = null;
//         int size = 0;

//         void push(int x) {                      // push
//             Node node = new Node(x);
//             node.next = head;
//             head = node;
//             size++;
//         }

//         int peek(){                             // peek
//             if(size == 0)   {
//                 System.out.println("Stack is empty");
//                 return 0;
//             }
//             int top = head.data;
//             return top;
//         }

//         int pop() {                             // pop
//             if(size == 0)   {
//                 System.out.println("Stack is empty");
//                 return 0;
//             }
//             int top = head.data;
//             head = head.next;
//             size--;
//             return top;
//         }

//         void display() {                    // display
//             Node temp = head;
//             while(temp != null) {
//                 System.out.print(temp.data+" ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }

//         int size() {                                // size
//             return size;
//         }

//         boolean isEmpty() {
//             if(size == 0)   return true;
//             else return false;
//         }
//     }

//     public static void main(String[] args) {
//         Stack st = new Stack();
//         st.push(12);
//         st.push(33);
//         st.push(90);
//         st.push(90);

//         st.display();

//         System.out.println("Peek element is: "+st.peek());

//         System.out.println("Size : "+st.size());

//         int val1 = st.pop();
//         int val2 = st.pop();
//         System.out.println("pop : "+val1);
//         System.out.println("pop : "+val2);
//         System.out.println("Size : "+st.size());

//         st.display();

//         System.out.println("Is stack empty ?: "+st.isEmpty());
//     }
// }










// privious smaller element........

import java.util.Stack;
public class Basics_Stack {

    public static int[] dis(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st= new Stack<>();

        for(int i=0; i<n; i++ ){
            while(!st.empty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return ans;
    }

    public static void print(int[] a, int[] ans) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,13,11,5,9,7,8,6};

        int [] ans = dis(arr, arr.length);

        print(arr, ans);
    }
}