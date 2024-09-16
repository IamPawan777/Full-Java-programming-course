package Queue;


// // import java.util.ArrayDeque;
// import java.util.LinkedList;
// import java.util.Queue;

// public class Basics_Queue {
//     public static void main(String[] args) {
//         // Queue<Integer> qu = new ArrayDeque<>();
//         Queue<Integer> q = new LinkedList<>();
//         q.add(23);                               // add
//         q.add(99);
//         q.add(45);
//         q.offer(45);
//         q.offer(99);
//         System.out.println(q);

//         int x = q.remove();                        // delete
//         int y = q.poll();
//         System.out.println(x+"  "+y);
//         System.out.println(q);

//         System.out.println(q.peek()+"  "+q.element());              // get
//         System.out.println(q);

//     }
// }





// // print queue............

// import java.util.LinkedList;
// import java.util.Queue;

// class Basics_Queue {
//     public static void main(String[] args) {
//         Queue<Integer> q1 = new LinkedList<>();
//         q1.add(1);
//         q1.add(2);
//         q1.add(3);
//         q1.add(4);
//         q1.add(5);

//         Queue<Integer> q2 = new LinkedList<>();
//         while(!q1.isEmpty()) {
//             System.out.println(q1.peek());
//             q2.add(q1.poll());
//         }
//         while(!q2.isEmpty()) {
//             q1.add(q2.poll());
//         }
//     }
// }






// // Queue Implematation using Array.......

// class Basics_Queue {
//     public static class QueueImp{
//         int f = -1, r = -1;
//         int size = 0;
//         int[] arr = new int[100];

//         public void add(int val) {                              // add
//             if(r == arr.length-1){
//                 System.out.println("Queue is full..!");
//                 return;
//             }
//             if(f == -1 || r == -1)  {
//                 f = r = 0;          // index increase
//                 arr[r] = val;
//             }
//             else
//                 arr[++r] = val;
//             size++;
//         }

//         public int remove() {                                   // remove
//             if(size==0)
//                 return -1;
//             int num = arr[f];
//             f++;
//             size--;
//             return num;
//         }

//         public int peek() {                                    // front element
//             if(size==0)
//                 return -1;
//             return arr[f];
//         }

//         public void display() {                               // display
//             if(size == 0)
//                 System.out.println("Empty Queue..");
//             else{
//                 for (int i = f; i <= r; i++)
//                     System.out.print(arr[i]+" ");
//             }
//             System.out.println();
//         }  

//         public int size() {                                    // size
//             return size;
//         }

//         public boolean isEmpty() {                              // empty
//             if(size() == 0)     return true;
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         QueueImp q = new QueueImp();
//         q.add(11);
//         q.add(22);
//         q.add(33);
//         q.add(44);
//         q.add(55);

//         q.display();
//         System.out.println("size: "+q.size());
//         System.out.println("get: "+q.peek());

//         System.out.println("remove: "+q.remove());
//         q.display();
//         System.out.println("remove: "+q.remove());
//         q.display();
//         System.out.println("size: "+q.size());
        
//         System.out.println(q.isEmpty());

//     }
// }






// Queue Implematation using LinkedList

 class Basics_Queue {
    public static class Node{
        int data;
        Node next;
        Node (int data) {
            this.data = data;
        }
    }

    public static class QueueImp {
        Node front = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {                          // add
            Node node = new Node(val);
            if(size==0)
                front = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        public int peek() {                                 // get
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return front.data;
        }
        

        public int remove() {                               // delete
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = front.data;
            front = front.next;
            size--;
            return x;
        }

        public void display(){                              // display
            if(size == 0){
                System.out.println("Queue is Empty..");
            }
            Node temp = front;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty(){                           // is empty?
            if(size == 0)   return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        QueueImp q = new QueueImp();
        q.add(12);
        q.add(14);
        q.add(16);
        q.add(66);
        q.add(99);
        q.display();

        System.out.println("Is Empty: "+q.isEmpty());

        System.out.println("Front: "+q.peek());

        System.out.println("Delete: "+q.remove());
        q.display();
        System.out.println("Size: "+q.size);
    }
 }








// // circular Queue Implemantation.........(r+1)%size

// class Basics_Queue {
//     public static class  CircularQueue {
//         int f = -1, r = -1;        
//         int size = 0;
//         int[] arr = new int[5];
//         int n = arr.length;

//         public void add(int val) {                 //////////// add
//             if(size == 0){                      /* zero element */ 
//                 f = r = 0;
//                 arr[0] = val;
//             }
//             else if(size == n) {                /* size is full */ 
//                 System.out.println("Queue is full...");
//                 return;
//             }
//             else if(r < n-1){                  /* normal case */ 
//                 arr[++r] = val;
//             }
//             else if(r == n-1){                 /* when rear at last position or stating m value dalna h */ 
//                 r = 0;
//                 arr[0] = val;
//             }
//             size++;
//         }

//         public int remove() {                   ////// DELETE
//             if(size == 0){
//                 System.out.println("Queue is empty...!");
//                 return -1;
//             }
//             else if(f == n-1) {                 /* front at last */  
//                 int x = arr[f];
//                 f = 0;
//                 size--;
//                 return x;
//             }
//             else {                              /* normal case */            
//                 int x = arr[f];
//                 f++;
//                 size--;
//                 return x;
//             }
//         }

//         public int peek() {                     ////////// front
//             if(size == 0){
//                 System.out.println("Queue is empty...!");
//                 return -1;
//             }
//             else{
//                 return arr[f];
//             }
//         }

//         public void display() {                        ////// display
//             if(size == 0){
//                 System.out.println("Queue is empty...!");
//             }
//             else {
//                 if(f<r){
//                     for (int i = f; i <= r; i++) {
//                         System.out.print(arr[i]+" ");
//                     }
//                     System.out.println();
//                 }
//                 else if(f>r){
//                     for (int i = f; i <= n-1; i++) {
//                         System.out.print(arr[i]+" ");
//                     }
//                     for (int i = 0; i <= r; i++) {
//                         System.out.print(arr[i]+" ");
//                     }
//                     System.out.println();
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         CircularQueue cq = new CircularQueue();
//         cq.add(11);
//         cq.add(22);
//         cq.add(33);
//         cq.add(44);
//         cq.add(55);        
//         cq.display();
//         System.out.println("front: "+cq.peek());
        
//         cq.add(66);             // full
//         cq.remove();                //  11
//         cq.remove();                //  22

//         cq.add(77);             // 33 44 55 77
//         cq.add(88);             // 33 44 55 77 88
//         cq.display();

//         System.out.println("front: "+cq.peek());


//     }
// }









// // circular Queue Implemantation using LinkedList (circuler LL)

// class Basics_Queue{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data) {
//             this.data = data;
//         }
//     }
//     static class QueueLL {
//         Node head = null, tail= null;
//         int size = 0;

//         void add(int data) {                              ////// add
//             Node node = new Node(data);
//             if(size == 0){
//                 head = tail = node;
//             }
//             else{
//                 tail.next = node;
//                 tail = node;
//             }
//             node.next = head;
//             size++;
//         }

//         int remove() {                                      ///// delete
//             if(head == null){
//                 System.out.println("Queue is Empty...");
//                 return -1;
//             }
//             else{
//                 int x = head.data;
//                 head = head.next;
//                 tail.next = head;
//                 size--;
//                 return x;
//             }
//         }

//         void display() {                                  //// display
//             if(head == null) {
//                 System.out.println("Queue is Empty.....");
//                 return;
//             }
//             Node temp = head.next;
//             System.out.print(head.data+" ");
//             while(temp != head){
//                 System.out.print(temp.data+" ");
//                 temp = temp.next;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         QueueLL ql = new QueueLL();
//         ql.add(11);
//         ql.add(22);
//         ql.add(33);
//         ql.add(44);
//         ql.display();
//         System.out.println("Size: "+ql.size);

//         System.out.println("remove: "+ql.remove());
//         System.out.println("remove: "+ql.remove());
//         ql.display();
//         System.out.println("Size: "+ql.size);

//     }
// }