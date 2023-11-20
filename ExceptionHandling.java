// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 12;
//         int b = 0;
//         int c = 0;
//         try {
//             c=a/b;
//             System.out.println("If b is 0 so not run this line......");
//         }
//         catch(Exception e) {
//             System.out.println("error is: "+e);
//         }
//         System.out.println(c);
//     }
// }






// // ........more number of catch block......

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 12;
//         int b = 6;
//         int c = 0, d=0;
//         int[] arr = {1,2,3,4};
//         String str = null;
        
//         try {
//             c=a/b;                          //....1-Exception....if b=0....
//             int x = arr[2];                   //....2-Exception.....if arr index out of bound.....
//             d = a/str.length();                //.....3-Exception.....if string length is 0....
//             System.out.println("value are: "+x);
//         }
//         catch(ArithmeticException e) {
//             System.out.println("error is: "+e);
//         }
//         catch(ArrayIndexOutOfBoundsException ee) {
//             System.out.println(ee);
//         }
//         catch(Exception eee) {                          //...java.lang.NullPointerException:....
//             System.out.println(eee);
//         }
//         System.out.println(c);
//     }
// }







// ........Finally block......

// import java.util.Scanner;

// public class ExceptionHandling {
//     public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int val = -1;
//        try {
//            val = sc.nextInt();        
//        } 
//        catch (Exception e) {
//         System.out.println("Input mismatch"+e);
//        }
//        finally{                         //...mandatory that the black executed finally.....
//         sc.close();
//        }

//        System.out.println(val);
//     }
// }


//........or......advance java feature........


// import java.util.Scanner;

// public class ExceptionHandling {
//     public static void main(String[] args) {
//        int val = -1;
//        try(Scanner sc= new Scanner(System.in)) {             //...try with resource...
//            val = sc.nextInt();      //automatically close...  
//        } 

//        System.out.println(val);
//     }
// }







// //...throws excetion......ducking the exception.....but atleast one time try-catch use....

// import java.util.InputMismatchException;

// class Demo {
//     void a() throws Exception  {
//         b();
//     }
//     void b() throws ArithmeticException, InputMismatchException, Exception {
//         int a = 12;
//         int b = 0;
//         int res = 0;
//             res = a/b;
//             System.out.println("ooops....! ");          //not run this line
//     }
// }
// public class ExceptionHandling {
//     public static void main(String[] args) {
//        Demo obj = new Demo();
//        try {
//            obj.a();
//        } 
//        catch (Exception e) {
//             System.out.println("run time Error get.........");
//        }
//     }
// }








// //.......throw keyword......but create Exception object bcz catch black get Exception object......

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 12;
//         int b = -3;
//         int res = 0;
//         try {
//             if(b<0) {
//                 Exception obj = new Exception("negative no");
//                 throw obj;                                          //....bcz catch get only object
//                //    throw new ArithmeticException("negative no");                //...or
//             }
//             else {
//                 res = a/b;
//                 System.out.println(res);
//             }
//         }
//         catch(Exception e) {
//             System.out.println("Enter positive number only..."+e.getMessage());
//         }
//     }
// }


// // ............or.........

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 12;
//         int b = 0;
//         int res = 0;
//         try {            
//                 res = a/b;
//                 System.out.println(res);
//         }
//         catch(Exception e) {
//             System.out.println("Enter positive number only..."+e.getMessage());
//             throw e;
//         }
//         finally {
//             System.out.println("kkk");
//         }
//         System.out.println("hello");
//     }
// }







// //....abnormal termination- (not normal)....here exception is not match so "hello" is not print..........

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 12;
//         int b = 0;
//         int res = 0;
//         try {            
//                 res = a/b;
//                 System.out.println(res);
//         }
//         catch(IndexOutOfBoundsException e) {
//             System.out.println("Enter positive number only..."+e.getMessage());
//         }
//         finally {
//             System.out.println("Hey.....");
//         }
//         System.out.println("hello");
//     }
// }






// //..........custom exception........

// class MyException extends Exception {
//     MyException() {
//         System.out.println("......Pawan........");
//     }
// }

// class ExceptionHandling {
//     public static void main(String[] args) {
//         int b=-9;
//         try {
//             if(b<0) {
//                 MyException o = new MyException();
//                 throw o;
//             }
//             int res = 8/b;
//             System.out.println(res);
//         }
//         catch(NullPointerException e){
//             System.out.println(e);
//         }
//         catch(MyException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }