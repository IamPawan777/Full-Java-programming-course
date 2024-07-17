// //  basic implemantation of doubly LL............

// package LinkedList;
// public class DoublyLL {
//     static class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int data) {
//             this.data = data;
//         }
//     }

//     static void dispForword(Node head) {
//         Node temp = head;
//         while(temp != null) {
//             System.out.print(temp.data+" ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }
//     static void dispBackword(Node tail) {
//         Node temp = tail;
//         while(temp != null) {
//             System.out.print(temp.data+" ");
//             temp = temp.prev;
//         }
//     }
//     public static void main(String[] args) {
//         Node a = new Node(11);
//         Node b = new Node(22);
//         Node c = new Node(33);
//         Node d = new Node(44);
//         Node e = new Node(55);
//         Node f = new Node(66);
//         a.prev = null;
//         a.next = b;
//         b.prev = a;
//         b.next = c;
//         c.prev = b;
//         c.next = d;
//         d.prev = c;
//         d.next = e;
//         e.prev = d;
//         e.next = f;
//         f.prev = e;
//         f.next = null;
//         dispForword(a);
//         dispBackword(f);
//     }
// }






// //  insert at Beggining / End / mid in doubly LL............

// package LinkedList;

// public class DoublyLL {
//     static class Node{
//         int data;
//         Node next = null;
//         Node prev = null;
//         Node(int data) {
//             this.data = data;
//         }
//     }
//     static class ImplementLL{
//         Node head = null;
//         Node tail = null;

//         // insert at head.............
//         void insertAtHead(int data) {
//             Node temp = new Node(data);
//             if(head == null){
//                 tail = temp;
//                 head = temp;
//             }
//             else{
//                 head.prev = temp;
//                 temp.next = head;
//                 head = temp;
//             }
//         }

//         // insert at tail.............
//         void insertAtTail(int data){
//             Node temp = new Node(data);
//             if(head == null) {
//                 head = temp;
//                 tail = temp;
//             }
//             else {
//                 tail.next = temp;
//                 temp.prev = tail;
//                 tail = temp;
//             }
//         }

//         // insert at mid.........
//         void insertAtMid(int position, int data){
//             if(position == 0){
//                 insertAtHead(data);
//                 return;
//             }
//             else if(position == size()) {
//                 insertAtTail(data);
//                 return;
//             }
//             Node temp = head;
//             while(position-- != 1) {
//                 temp = temp.next;
//             }
//             Node node = new Node(data);
//             node.next = temp.next;
//             node.prev = temp;
//             temp.next.prev = node;
//             temp.next = node;
            
//         }
//         // get size.......
//         int size() {
//             int count = 0;
//             Node temp = head;
//             while (temp != null) {
//                 count++;
//                 temp = temp.next;
//             }
//             return count;
//         }
//         // print liat......
//         void disp(){
//             Node temp = head;
//             while(temp != null) {
//                 System.out.print(temp.data+" ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         ImplementLL dl = new ImplementLL();
//         dl.insertAtHead(11);
//         dl.insertAtHead(22);
//         dl.insertAtHead(33);
//         dl.disp();

//         dl.insertAtTail(11);
//         dl.insertAtTail(22);
//         dl.insertAtTail(33);
//         dl.disp();

//         dl.insertAtMid(3, 1000);
//         dl.disp();
//     }
// }







// // 3.. array convert to linked-list.......

// package LinkedList;
// class DoublyLL {
//     static class Node{
//         int data;
//         Node next;
//         Node prev;
//         Node(int data) {
//             this.data = data;
//         }        
//     }
//     static class ImplementLL {
//         Node head = null;
//         Node tail = null;
//         // void makeLL(int[] arr) {
//         //     for (int i = 0; i < arr.length; i++) {
//         //         Node node = new Node(arr[i]);
//         //         if(head == null){
//         //             head = node;
//         //             tail = node;
//         //         }
//         //         else{
//         //             tail.next = node;
//         //             node.prev = tail;
//         //             tail = node;
//         //         }
//         //     }
//         // }

//         Node makeLLRecursion(int[] arr, int size, int ind, Node back) {
//             if(ind == size) {
//                 return null;
//             }
//             Node temp = new Node(arr[ind]);
//             temp.next = makeLLRecursion(arr, size, ind+1, temp);
//             temp.prev = back;
//             return temp;
//         }
//         // print list......
//         void disp(Node head){
//             Node temp = head;
//             while(temp != null) {
//                 System.out.print(temp.data+" ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         ImplementLL ll = new ImplementLL();
//         int[] arr = {11, 22, 33, 44};
//         int size = arr.length;
//         // ll.makeLL(arr);
//         // ll.disp();

//         Node head = ll.makeLLRecursion(arr, size, 0, null);
//         ll.disp(head);

//     }
// }






// 4. delete node......

// package LinkedList;

class DoublyLL {
    static Node head,tail;
    static class Node{
        int data;
        Node next, prev;
        Node(int data){
            this.data = data;
        }
    }

    static void insertNode(int data) {
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }
    static void deleteNode(int ind) {
        Node curr = head;
        if(ind == 0) {                       // first node..........
            head = curr.next;
            head.prev = null;
            return;
        }

        while(ind-- != 0){
            curr = curr.next;
        }        
        if(curr.next == null) {             // last node..........
            curr.prev.next = null;
        }
        else {                              // mid node.........
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }
    }

        static int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

    // print list......
    static void disp(Node head){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        insertNode(12);
        insertNode(44);
        insertNode(56);
        insertNode(89);
        insertNode(99);
        disp(head);
        deleteNode(4);
        disp(head);

    }
}