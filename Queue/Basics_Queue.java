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
        
    }

    public static void main(String[] args) {
        
    }
 }