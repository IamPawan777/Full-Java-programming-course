// import java.util.*;

// class StackList {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = sc.nextInt();
        
//         List<Integer> s = new Stack<>();
//         System.out.println("Enter element: ");
//         for (int i = 0; i < n; i++) {
//             s.add(sc.nextInt());
//         }

//         System.out.println("elements are: "+s);
        
//     }
// }







//.......push().......pop()...... search().......

import java.util.*;

class StackList {
    public static void main(String[] args) {
        Stack<Float> fl = new Stack<>();
        fl.push(23f);
        fl.push(44f);
        fl.push(6.7f);        
        fl.push(.7f);
        fl.push(10f);

        System.out.println(fl);
        System.out.println(fl.peek());      //looks at the object at the top of the stack without removing  
        System.out.println(fl.pop());       //lools at the object at the top of the stack with removing
        System.out.println(fl);
        System.out.println(fl.search(23f));             //return object on the stack "1-based position'


    }
}