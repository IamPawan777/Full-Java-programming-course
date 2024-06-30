// package LinkedList;

// public class Basics {
//     public static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//             // this.next = null;            //..automatically null
//         }
//     }
//     static void disp(Node temp) {                          //...traverse simplly.....
//         while (temp!=null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
//     static void dispRecursion(Node temp) {                 //...traversal recursivlly.......
//         if(temp == null) return;
//         System.out.print(temp.data + " ");
//         dispRecursion(temp.next);
//     }

//     public static void main(String[] args) {
//         Node first = new Node(11);
//         Node head = first;                         //....optional.....
//         Node second = new Node(2);
//         Node third = new Node(33);
//         Node forth = new Node(4);
//         Node fivth = new Node(55);
//         Node sixth = new Node(6);
        
//         first.next = second;
//         second.next = third;
//         third.next = forth;
//         forth.next = fivth;
//         fivth.next = sixth;
//         // sixth.next = null;              //...automatically...optional.......

//         disp(head);
//         System.out.println();
//         dispRecursion(head);
//     }
    
// }








// //..2........dynamically insertes element.......Insert at end & biggning ...
// package LinkedList;

// public class Basics {
//     static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//         }        
//     }

//     static class ImplementLL {
//         Node head = null;
//         Node tail = null;
        
//         void insertEnd(int val) {
//             Node temp = new Node(val);
//             if(head == null){                   //..for first node. (empty list ).
//                 head = temp;
//             }
//             else {
//                 tail.next = temp;
//             }
//             tail = temp;
//         }
        
//         void insertHead(int val) {
//             Node node = new Node(val);
//             if(head == null) {              //empty list
//                 tail = node;                 // or insertEnd(val)   (bcz already)
//             }
//             else {
//                 node.next = head;
//             }
//             head = node;
//         }
       
//         void disp() {                       // display linked list.....
//             Node temp = head;                   
//             while (temp!=null) {
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//         }
//         // int size() {
//         //     Node temp = head;
//         //     int count = 0;
//         //     while(temp!=null) {
//         //         count++;
//         //         temp = temp.next;
//         //     }
//         //     return count;
//         // }
//     }
//     public static void main(String[] args) {
//         ImplementLL ll = new ImplementLL();
//         ll.insertEnd(23);
//         ll.insertEnd(9);
//         ll.insertEnd(94);
//         ll.insertEnd(923);
//         ll.insertEnd(88);

//         ll.disp();
//         System.out.println();
//         // System.out.println(ll.size());
//         ll.insertEnd(101);

//         ll.insertHead(11);
//         ll.insertHead(22);

//         ll.disp();
//     }    
// }






// //.....insert at end..........
// package LinkedList;

// class Basics {
//     Node head;              // (automatically)....or...Node head = null;
//     Node tail;              // or...Node tail = null;
    
//     static class Node{
//         int data;
//         Node next;

//         Node(int d){
//             data = d;
//             next = null;
//         }
//     }

//     // insert the node at the very end in the linked list
//     public void insertAtEnd(int newData){
//         // intialize the newNode with the newData entered by the user
//         Node newNode = new Node(newData);

//         // LinkedList is empty
//         if(head == null ){
//             head = newNode;
//             // return;
//         }

//         // LinkedList is not empty
//         // newNode.next = null;
        
//         // traversing the linkedlist at the end of the node
//             // Node temp = head;
//             // while(temp.next != null){
//             //     temp = temp.next;
//             // }

//             // temp.next = newNode;
//             // tail = newNode;
//             // return;
//         else {
//             tail.next = newNode;
//         }
//         tail = newNode;
//         return;
//     }

//     // display all the nodes after the insertion
//     public void printNodes(){
//         Node current = head;
//         while(current!= null){
//             System.out.print(current.data+" ");
//             current = current.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Basics ll = new Basics();
//         // Node b = new Node(22);
//         // Node a = new Node(12);
//         // Node c = new Node(32);
//         // Node d = new Node(42);
//         // a.next = b;
//         // b.next = c;
//         // c.next = d;

//         // function calling
//         ll.insertAtEnd(2);
//         ll.insertAtEnd(4);
//         ll.insertAtEnd(8);
//         ll.insertAtEnd(10);
//         ll.insertAtEnd(15);
//         ll.insertAtEnd(1212);

//         ll.printNodes();
//         System.out.println("Head: "+ll.head.data);
//         System.out.println("Tail: "+ll.tail.data);
//     }
// }




// // insert at "end" using recursion............

// package LinkedList;
// class Basics {
//     static Node head, tail;
//     static class Node{
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//         }
//     }

//     // static void insertEnd(int data) {
//     //     Node temp = new Node(data);
//     //     if(head == null){
//     //         head = temp;
//     //     }
//     //     else {
//     //         tail.next = temp;
//     //     }
//     //     tail = temp;
//     // }

//     static Node insertEnd(Node head, int data){
//         if(head == null)
//             return new Node(data);
//         head.next = insertEnd(head.next, data);
//         return head;
//     }

    
//     static void print(Node head){
//         Node temp = head;
//         if(temp == null)
//             return;
//         System.out.print(temp.data+" ");
//         print(head.next);
//     }

//     public static void main(String[] args) {
//         head = insertEnd(head, 12);
//         head = insertEnd(head, 77);
//         head = insertEnd(head, 2);
//         head = insertEnd(head, 98);
//         head = insertEnd(head, 65);
//         head = insertEnd(head, 653);

//         print(head);
//     }
// }







// //..........dynamically insertes element.......Insert at mid / end / start ...
// package LinkedList;

// public class Basics {
//     static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//         }        
//     }

//     static class ImplementLL {
//         Node head = null;
//         Node tail = null;
        
//         void insertEnd(int val) {
//             Node temp = new Node(val);
//             if(head == null){                   //..for first node. (empty list ).
//                 head = temp;
//             }
//             else {
//                 tail.next = temp;
//             }
//             tail = temp;
//         }
//         void insertHead(int val) {
//             Node node = new Node(val);
//             if(head == null) {              //empty list
//                 tail = node;
//             }
//             else {
//                 node.next = head;
//             }
//             head = node;
//         }
        
//         void insertMid(int position, int val) {
//             if(position == 0) {                 //..beginning
//                 insertHead(val);
//                 return;
//             }
//             else if(position == size()) {            //..end
//                 insertEnd(val);
//                 return;
//             }
//             else if(position < 0 || position > size()) {
//                 System.out.println("Wrong position ");
//                 return;
//             }

//             Node temp = head;                   // mid
//             int ind = 0;
//             while(ind < position-1) {
//                 temp = temp.next;
//                 ind++;
//             }
//             Node node = new Node(val);
//             node.next = temp.next;
//             temp.next = node;            
//         }
        
       
//         void disp() {                       // display linked list.....
//             Node temp = head;                   
//             while (temp!=null) {
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//         int size() {
//             Node temp = head;
//             int count = 0;
//             while(temp!=null) {
//                 count++;
//                 temp = temp.next;
//             }
//             return count;
//         }
//     }
//     public static void main(String[] args) {
//         ImplementLL ll = new ImplementLL();
//         ll.insertEnd(23);
//         ll.insertEnd(9);
//         ll.insertEnd(94);
//         ll.insertEnd(923);
//         ll.insertEnd(88);
//         ll.disp();
        
//         ll.insertMid(2, 100);     


//         ll.disp();
//         // System.out.println(ll.tail.data);
//     }
// }







// //........get element...........
// package LinkedList;

// public class Basics {
//     static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//         }        
//     }

//     static class ImplementLL {
//         Node head = null;
//         Node tail = null;
//         int size = 0;
        
//         void insertEnd(int val) {
//             Node temp = new Node(val);
//             if(head == null){                  
//                 head = temp;
//             }
//             else {
//                 tail.next = temp;
//             }
//             tail = temp;
//             size++;
//         }
//         void disp() {                       // display linked list.....
//             Node temp = head;                   
//             while (temp!=null) {
//                 System.out.print(temp.data + " ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
        
//         int getElement(int index) {
//              if(index < 0 || index > size-1) {
//                 System.out.println("Wrong position ");
//                 return -1;
//              }
//             Node temp = head;
//             while(index != 0){
//                 temp = temp.next;
//                 index--;
//             }
//             return temp.data;
//         }
//     }
//     public static void main(String[] args) {
//         ImplementLL ll = new ImplementLL();
//         ll.insertEnd(23);
//         ll.insertEnd(9);
//         ll.insertEnd(94);
//         ll.insertEnd(923);
//         ll.insertEnd(88);
//         ll.disp();      

//         System.out.println(ll.getElement(1));
//         // System.out.println("Size"+ll.size);

//     }
    
// }






// //..print array and insert at tail......

// package LinkedList;

// class Basics {
//     Node head = null, tail = null;              // no need to write null
//     class Node{
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//         }
//     }
    
//     void insertTail(int[] val) {
//         for (int i = 0; i < val.length; i++) {
//             if(head == null){
//                 head = new Node(val[i]);
//                 tail = head;
//             }
//             else{
//                 tail.next = new Node(val[i]);
//                 tail = tail.next;
//             } 
//         }
//     }

//     void disp() {
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//     }
//     public static void main(String[] args) {
//         Basics ob = new Basics();
        
//         int[] arr = {2,45,6,9,11};
//         ob.insertTail(arr);
//         ob.disp();
//     }
// }









// //......delete element...........
//  package LinkedList;

//  class Basics {
//     static class Node {
//         int data;
//         Node next;        
//         Node(int d) {
//             data = d;
//         }
//     }
//     static class LinkedLL  {
//         Node head = null;
//         Node tail = null;
//         int size = 0;
//         void insertNode(int val) {
//             Node node = new Node(val);
//             if(head == null) {
//                 head = node;                
//             }
//             else{
//                 tail.next = node;
//             }
//             tail = node;
//             size++;
//         }
        
//         void deleteNode(int ind) {
//             if(ind == 0)   {
//                 head = head.next;
//                 size--;
//                 return;
//             } 
//             else if(ind > size-1){
//                 System.out.println("Wrong index");
//                 return;
//             }

//             Node temp = head;
//             while(ind != 1) {
//                 temp = temp.next;
//                 ind--;
//             }
            
//             temp.next = temp.next.next;
//             size--;
//             if(temp.next == null)
//                 tail = temp;
//         }

//         void disp() {
//             Node temp = head;
//             while(temp != null) {
//                 System.out.print(temp.data+" ");
//                 temp = temp.next; 
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         LinkedLL ll = new LinkedLL();
//         ll.insertNode(11);
//         ll.insertNode(2);
//         ll.insertNode(33);
//         ll.insertNode(4);
//         ll.insertNode(55);
//         ll.insertNode(66);
//         ll.insertNode(77);
//         ll.disp();
//         System.out.println(ll.size);

//         ll.deleteNode(5);
//         ll.disp();
//         System.out.println("Size:"+ll.size);
//         System.out.println("head: "+ll.head.data);
//         System.out.println("tail: "+ll.tail.data);
//     }
//  }










// //........delete node..........

// package LinkedList;

// class Basics {
//     Node head;
//     Node tail;
    
//     class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//         }    
//     }

//     // static class LinkedLL {
//         void insertEnd(int val) {
//             Node node = new Node(val);
//             if(head == null) {
//                 head = node;
//                 // return;
//             }
//             else {
//                 tail.next = node;
//             }
//             tail = node;
//         }

//         void deleteNode(int ind) {
//             Node prev = null;
//             Node curr = head;
//             if(ind == 0){
//                 head = curr.next;
//                 curr.next = null;
//                 return;
//             }
            
//             int count = 0;
//             while(count < ind) {
//                 prev = curr;
//                 curr = curr.next;
//                 count++;
//             }
//             prev.next = curr.next;
//             curr.next = null;
//             if(prev.next == null){
//                 tail = prev;
//             }
//         }

//         void print() {
//             Node temp = head;
//             while(temp != null){
//                 System.out.print(temp.data+" ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     // }
//     public static void main(String[] args) {
//         Basics ll = new Basics();
//         ll.insertEnd(12);
//         ll.insertEnd(23);
//         ll.insertEnd(34);
//         ll.insertEnd(45);
//         ll.insertEnd(56);
//         ll.print();
//         ll.deleteNode(2);
//         ll.print();

//         System.out.print("Head: "+ll.head.data+" ");
//         System.out.println("tail: "+ll.tail.data);
//     }
// }







// //..............Insert at end. ......some error in the code..
// package LinkedList;

// public class Basics {
//     static class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//         }        
//     }
    
//     static void disp(Node head) {                       // display linked list.....
//         Node temp = head;                   
//         while (temp!=null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     static void insertEnd(Node head, int da) {
//         Node node = new Node(da);       //77
//         Node temp = head;           //6
//         while(temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = node;
//     }
//     public static void main(String[] args) {
//         Node first = new Node(11);
//         Node head = first;                         //....optional.....
//         Node second = new Node(2);
//         Node third = new Node(33);
//         Node forth = new Node(4);
//         Node fivth = new Node(55);
//         Node sixth = new Node(6);
//         Node tail = sixth;   
        
//         first.next = second;
//         second.next = third;
//         third.next = forth;
//         forth.next = fivth;
//         fivth.next = sixth;   
//         disp(head);

        // insertEnd(tail, 77);   
//         disp(head);

//         // Node tail = sixth;
//         insertEnd(head, 88);
//         disp(head);
//     }    
// }









// //........reversal  of LL..........

// package LinkedList;

// class Basics {
//     Node head;
//     Node tail;
    
//     class Node {
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//         }    
//     }

//     // static class LinkedLL {
//         void insertEnd(int val) {
//             Node node = new Node(val);
//             if(head == null) {
//                 head = node;
//                 // return;
//             }
//             else {
//                 tail.next = node;
//             }
//             tail = node;
//         }


//         void print() {
//             Node temp = head;
//             while(temp != null){
//                 System.out.print(temp.data+" ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
// //  reversal of linkedlist..................
//         void reverseLL() {
//             Node prev = null, curr = head, nextP = null;
//             tail = curr;                    // tail change........
//             while(curr != null) {
//                 nextP = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = nextP;
//             }
//             head = prev;                   // head change........
//         }
//         void reverseLLRec(Node curr, Node prev) {
//             Node nextP;
//             if(curr.next == null){
//                 head = curr;                    //..head
//                 curr.next = prev;
//                 return;
//             }
//             if(curr == head)
//                 tail = curr;                    //..tail
//             nextP = curr.next;
//             curr.next =  prev;
//             reverseLLRec(nextP, curr);
//         }
//     // }
//     public static void main(String[] args) {
//         Basics ll = new Basics();
//         ll.insertEnd(12);
//         ll.insertEnd(23);
//         ll.insertEnd(34);
//         ll.insertEnd(45);
//         ll.insertEnd(56);
//         ll.insertEnd(111);
//         ll.print();
//         System.out.print("Head: "+ll.head.data+" ");
//         System.out.println("tail: "+ll.tail.data);
// System.out.println();

//         ll.reverseLL();
//         ll.print();
//         System.out.print("Head: "+ll.head.data+" ");
//         System.out.println("tail: "+ll.tail.data);
// System.out.println();
//         ll.reverseLLRec(ll.head, null);
//         ll.print();
//         System.out.print("Head: "+ll.head.data+" ");
//         System.out.println("tail: "+ll.tail.data);
//     }
// }





////////// practics.................

// package LinkedList;

// class Basics {
//     Node head, tail;
//      class Node{
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//         }
//     }

//      void insertMid(int data) {
//         Node node  = new Node(data);
//         if(head == null){
//             head = node;
//         }
//         else {
//             tail.next = node;
//         }
//         tail = node;
//     }
    
//      void deleteNode(int posi) {
//         Node curr = head;
//         Node pre = null;

//         if(posi == 1) {
//             head = curr.next;
//             curr.next = null;
//             return;
//         }
//         while(posi-- != 1){
//             pre = curr;
//             curr = curr.next;
//         }
//         pre.next = curr.next;
//         curr.next = null;

//         if(pre.next == null)
//             tail = pre;

//     }

//      void traverse(Node temp) {
//         if(temp == null)
//             return;
//         System.out.print(temp.data+" ");
//         traverse(temp.next);
//     }

//     public static void main(String[] args) {
//         Basics b = new Basics();
        
//         b.insertMid(11);
//         b.insertMid(78);
//         b.insertMid(1);
//         b.insertMid(90);
//         b.insertMid(233);
//         // System.out.println("head "+head.data);
//         System.out.println();
//         b.traverse(b.head);

//         System.out.println("head "+b.tail.data);

//         b.deleteNode(1) ;
// System.out.println();
//         // insertMid(4, 2222, head, tail);
//         b.traverse(b.head);
//         System.out.println("head "+b.tail.data);




//     }
// }





// ///......mid value................

// package LinkedList;

// class Basics {
//     Node head;
//     Node tail;
    
//     class Node{
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//         }
//     }
//     void insert(int val) {
//         Node node = new Node(val);
//         if(head == null)    head = node;
//         else {
//             tail.next = node;
//         }
//         tail = node;

//     }
//     void print() {
//         Node temp = head;
//         while(temp != null) {
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     void findMidNode() {
//         Node slow = head, fast = head;
//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         System.out.println("Mid value is: "+slow.data);
//     }
//     public static void main(String[] args) {
//         Basics ll = new Basics();
//         ll.insert(12);
//         ll.insert(23);
//         ll.insert(22);
//         ll.insert(88);
//         ll.print();
//         ll.findMidNode();
//     }
// }







// ///......detect cycle value.(Floyd's cycle detection (2 pointer)(Hare-tortoise algo.))...............

// package LinkedList;

// class Basics {
//     Node head;
//     Node tail;
    
//     class Node{
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//         }
//     }
//     void insert(int val) {
//         Node node = new Node(val);
//         if(head == null)    head = node;
//         else {
//             tail.next = node;
//         }
//         tail = node;

//     }
//     void print() {
//         Node temp = head;
//         while(temp != null) {
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     void detectCycle() {
//         Node slow = head, fast = head;
//         boolean che = false;
//         while(slow!=null && fast!=null && fast.next!=null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast) {
//                 che = true;
//                 break;
//             }
//         }
//         if(che == true) {
//             System.out.println("cycle present...");
//         }
//         else {
//             System.out.println("cycle not present...");
//         }
//     }
//     public static void main(String[] args) {
//         Basics ll = new Basics();
//         ll.insert(12);
//         ll.insert(23);
//         ll.insert(22);
//         ll.insert(88);
//         ll.print();
        
//         ll.tail.next = ll.head;         //make cycle...........
//         ll.detectCycle();
//         // ll.print();
//     }
// }







// delete nth tail node if tail node present...............(also can solve by slow-fast poinster (leetcode 19))

package LinkedList;

public class Basics {
        static Node head = null, tail = null;
        static class Node{
                int data;
                Node next;
                Node(int data) {
                        this.data = data;
                }
        }

        static void insert(int data) {
                Node node = new Node(data);
                if(head == null){
                        head = node;
                }
                else{
                        tail.next = node;
                }
                tail = node;
        }

        static void disp() {
                Node temp = head;
                while(temp != null){
                        System.out.print(temp.data+" ");
                        temp = temp.next;
                }

        }
        static int listSize() {
                Node temp = head;
                int size =  0;
                while(temp != null){
                        size++;
                        temp = temp.next;
                }
                return size;
        }
        // static void deleteTail(int pos) {                       // <- this is the code
        //         int size = listSize();
        //         int newpos = size-pos+1;                        // now delete from stating position

        //         Node pre = null;
        //         Node curr = head;
        //         while(newpos-- != 1) {
        //                 pre = curr;
        //                 curr = curr.next;
        //         }
        //         if (pos == size){                                       // (edge case) when last node dlt form end
        //                 head = head.next;
        //                 return;
        //         }
        //         pre.next = curr.next;
        //         curr.next = null;
        // }
//   or....
        static void deleteTail(int k){
                Node slow = head;
                Node fast = head;

                while(k-- != 0) {
                        fast = fast.next;
                }
                if(fast == null){
                        head = head.next;
                        return ;
                }
                while(fast.next != null) {
                        slow = slow.next;
                        fast = fast.next;
                }
                slow.next = slow.next.next;
        }

        public static void main(String[] args) {
                insert(12);
                insert(56);
                insert(6);
                insert(34);
                insert(3);
                disp();
                
                deleteTail(5);
                System.out.println();

                disp();
        }
        
}





// // rotate list with k times...........

// package LinkedList;

// class Basics {
//         static Node head = null, tail = null;
//         static class Node{
//                 int data;
//                 Node next;
//                 Node(int data) {
//                         this.data = data;
//                 }
//         }

//         static void insert(int data){
//                 Node node = new Node(data);
//                 if(head == null)
//                         head = node;
//                 else
//                         tail.next = node;
//                 tail = node;
//         }

//         static Node rotate( int k ){

//                 Node temp = head;
//                 int size = 0;
//                 while(temp != null){
//                         size++;
//                         temp = temp.next;
//                 }

//                 k = k % size;
//                 if(k == 0)      return head;
//                 int point = size - k;
                

//                 Node curr = head;
//                 Node pre = null;
//                 while(point-- != 0){
//                         pre = curr;
//                         curr = curr.next;
//                 }
//                 pre.next = null;

//                 Node newtail = curr;

//                 while(newtail.next != null) {
//                         newtail = newtail.next;
//                 }
//                 newtail.next = head;
//                 return curr;
//         }
//         public static void main(String[] args) {
//                 insert(23);
//                 insert(45);
//                 insert(11);
//                 insert(2);
//                 insert(20);

//                 Node temp = head;
//                 while (temp!=null) {
//                         System.out.print(temp.data+" ");
//                         temp = temp.next;
//                 }
//                 System.out.println();
                
//                 Node n = rotate(2);
//                 Node temp2 = n;
//                 while (temp2!=null) {
//                         System.out.print(temp2.data+" ");
//                         temp2 = temp2.next;
//                 }
//         }
// }