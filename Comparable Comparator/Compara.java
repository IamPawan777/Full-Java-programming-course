//...comparator....(customized sorting)......

// import java.util.*;

// class Demo {
//     int marks;
//     int age;
//     String name;
//     Demo(int marks, int age, String name) {
//         this.marks = marks;
//         this.age = age;
//         this.name = name;
//     }
//     public String toString() {
//         return marks + ", " + age +", " + name;
//     }
// }


// // class Alpha implements Comparator<Demo> {
// //     public int compare(Demo a, Demo b){
// //         if(a.marks < b.marks){
// //             return 1;
// //         }
// //         else{
// //             return -1;
// //         }
// //     }
// // }


// public class Compara {
//     public static void main(String[] args) {
//         Demo st1 = new Demo(60, 22, "kamal");
//         Demo st2 = new Demo(33, 18, "pawan");
//         Demo st3 = new Demo(98, 25, "Jeck");


//         // Alpha a = new Alpha();
//         Comparator<Demo> a = (Demo aa, Demo bb) ->              //lamba exression
//         {
//                 if(aa.marks < bb.marks){                //reverse sorted order
//                     return 1;
//                 }
//                 else{
//                     return -1;
//                 }
//         };

//         List<Demo> li = new ArrayList<Demo>();
//         li.add(st1);
//         li.add(st2);
//         li.add(st3);
//         System.out.println(li);

//         Collections.sort(li, a);
//         System.out.println("sorted: "+li);

//     }
// }






//......comparable....(default sorting).....

import java.util.*;

class Demo implements Comparable<Demo> {
    int marks;
    int age;
    String name;
    Demo(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return marks + ", " + age +", " + name;
    }
    public int compareTo(Demo aa) {
        if(this.age > aa.age){
            return 1;
        }
        else {
            return-1;
        }
    }
}


public class Compara {
    public static void main(String[] args) {
        Demo st1 = new Demo(60, 22, "kamal");
        Demo st2 = new Demo(33, 18, "pawan");
        Demo st3 = new Demo(98, 25, "Jeck");
        

        List<Demo> li = new ArrayList<Demo>();
        li.add(st1);
        li.add(st2);
        li.add(st3);
        System.out.println(li);

        // Collections.sort(li, 
        // (Demo aa, Demo bb) ->              
        // {
        //         if(aa.marks < bb.marks){                
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        // });

// or

        Collections.sort(li);
        System.out.println("sorted: "+li);

    }
}
