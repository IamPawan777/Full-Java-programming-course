// package UserDefine;

// public class StudentClass {
//     static int x;
//     //..creating new datatype (define class)........
//     public static class Student {                  //..static class.....
//         String name;
//         private int id;
//     } 

//     public static void main(String[] args) {
//         Student s1 = new Student();             //...create 1st obj ...
//         s1.id = 12;                             //..initialized..
//         s1.name = "Rasha";
//         x = 12;
//         System.out.println(x);
//         System.out.println(s1.name);

//         Student s2 = new Student();             //...2nd obj create...
//         s2.id = 33;
//         s2.name = "Pawan Bisht";
//     }
// }




// //........different class........
// package UserDefine;
// public class StudentClass {

//     public static class Student {                 
//         String name;
//         private int id;
//     } 

//     public static class College {                          
//         String name;
//     } 

//     public static void main(String[] args) {
//         Student s1 = new Student();                 //..Student class object..       
//         s1.id = 12;                           
//         s1.name = "Rasha";
//         System.out.println(s1.id +", "+s1.name);

//         College c = new College();                  //..college class object.......
//         c.name = "SLIET";
//         System.out.println(c.name);        
//     }
// }





// access by function............
package UserDefine;
public class StudentClass {

    public static class Student {                 
        String name;
        private int id;
    } 
    public static class College {                          
        String name;
    }
    static void disp(College x, Student y) {
        x.name = "Poly";                            //change (bcz pass by reference)
        y.name = "pawan";
        y.id = 101;
        System.out.println(x.name+" "+y.name+" "+y.id);
    }

    public static void main(String[] args) {

        Student s = new Student();
        College c = new College();                  //..college class object.......
        c.name = "SLIET";
        disp(c, s);
    }
}





// //...class can be in difference file....(our class in different file)....
// package UserDefine;
// public class StudentClass {

//     static void disp(Colleege x) {            
//         System.out.println(x.name);
//     }

//     public static void main(String[] args) {

//         Colleege c = new Colleege("SLIET", 12);                  //..college class object.......
//         // c.name = "SLIET";
//         // c.id = 12;              //private can not accessible
//         disp(c);
//         c.fun();
//     }
// }