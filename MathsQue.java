//.....number in the input is prime or not.........
//.......Fibonacci series..........
//........palindrome Number.......
//........palindrome String.......
//.........factorial...........
//........armstrong Number.......
//........reverse Number.....
//.........swap number.......
//..........chanage ascii......
//........matrix multiplication.......
///.........number of charactor in String.......
/*........patters Question......*/





// // print the value of input if it is even and divisible by 3.

// class Conditional {
//     void evenDiv3() {
//         for(int i=1; i<100; i++) {
//             if(i%3==0 && i%2==0)
//                 System.out.print(i+", ");
//         }
//     }
//     public static void main(String[] args) {
//         Conditional obj = new Conditional();
//         obj.evenDiv3();
//     }
// }






// // For each multiple of 3, print "Fizz".
// //  For each multiple of 5, print "Buzz".
// //  For numbers which are multiples of both 3 and 5, print "FizzBuzz".

// class Conditional {
//     static void print() {
//         for(int i=1; i<=50; i++) {
//             if(i%3==0 && i%5==0)
//                 System.out.println(i+": FizzBuzz");
//             if(i%3==0) 
//                 System.out.println(i+": Fizz");
//             else if(i%5==0)
//                 System.out.println(i+": Buss");
//         }
//     }
//     public static void main(String[] args) {
//         print();
//     }
// }






// // program that prints each number from 1 to 100 on a new line, except 
// // if the number is a multiple of 5 or 7.

// class Conditional {
//     public static void main(String[] args) throws java.lang.Exception {
//         int i=1;
//         while(i<=100) {
//             if(i%5==0 || i%7==0) 
//                 System.out.println(i);
//             i++;
//         }
//     }
// }






// // all values between 1 and 100, except if it’s a multiple of 3.

// class Conditional {
//     public static void main(String[] args) {
//         for(int i=1; i<=100; i++) {
//             if(i%3 == 0)
//             System.out.print(i+" ");
//         }
//     }
// }






// //........Simple interest.........

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner sc = new java.util.Scanner(System.in);

//         System.out.print("Enter principal: ");
//         float p = sc.nextFloat();

//         System.out.print("Enter Interest Rate: ");
//         float i = sc.nextFloat();

//         System.out.print("Enter period: ");
//         int t = sc.nextInt();

//         double SI = (p*i*t)/100;
//         System.out.println("Simple Interest: "+SI);
//     }
// }






// //.........character at string**********.......

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter String: ");
//         String str = scan.nextLine();

//         System.out.println("at Index: ");
//         char ch = str.charAt(scan.nextInt()-1);

//         System.out.println("character: "+ch);
//     }
// }






// //.......Swap two number without third variable.....

// import java.util.*;
// class MathsQue {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         a = a+b;
//         b = a-b;
//         a = a-b;
//         System.out.println(a+"\n"+b);
//     }
// }




// //.....count total numbers of digit in any number.......

// import java.util.*;
// class MathsQue {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int count = 0;
//         while(n>0) {
//             n/=10;              //234 -> 23 -> 2 -> 0
//             count++;
//         }
//         System.out.println(count);
//     }
// }






// //.......calculate the sum of the digits of a number.......

// import java.util.*;
// class MathsQue {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter no: ");
//         int no = scan.nextInt();
//         int sum = 0;
//         while(no>0) {
//             sum += no%10;
//             no /= 10;
//         }
//         System.out.println(sum);
//     }
// }





// //.....reverse the number........

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int store = 0;
//         while (n>0) {
//             store = store*10 + n%10;
//             n/=10;
//         }
//         System.out.println(store);
//     }
// }




// //..........sum of series.(1+2-3+4-5+6-7+8-9).....

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int calculate = 0;
//         for (int i = 1; i <= n; i++) {
//             if(i%2 == 0)
//                 calculate -= i;
//             else if(i%2 != 0)
//                 calculate += i;
//         }
//         System.out.println(calculate);
//     }
// }






// //..........factrial no.......

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int sum = 1;
//         for(int i=1; i<=n; i++) {
//             sum*=i;
//         }
//         System.out.println(sum);
//     }
// }





// //..........a raised to power b......

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int a = scan.nextInt(), b=scan.nextInt(), store=1;
//         for(int i=1; i<=b; i++) {
//             store *= a;
//         }
//         System.out.println(store);
//     }
// }





// //....print Fibonacci series of n terms ....

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int a=1, b=1;
//         for (int i = 0; i < n; i++) {
//             System.out.print(a+" ");
//             int sum = a+b;
//             a = b;
//             b = sum;
//         }        
//     }
// }






// //....print factorial no....

// class MathsQue {
//     int factorialNo(int n, int sum) {
//         if(n==0) 
//             return n;
//         else {
//             for (int j = n; j >= 1; j--) {
//                 sum*=j;                
//             }
//             return sum;            
//         }
//     }
//     public static void main(String[] args) {
//         MathsQue obj = new MathsQue();
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int sum = 1;
//         int store = obj.factorialNo(n, sum);
//         System.out.println(store);
//     }
// }







// // //..........armstrong number or not.........

// import java.util.Scanner;
// class MathsQue {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int store = n;
//         int sum = 0;
//         while(n>0) {
//             int digit = n%10;
//             sum += digit*digit*digit;
//             n/=10;
//         }
//             if(sum == store) 
//                 System.out.println(store+" is armstrong number...");
//             else
//                 System.out.println(store+" not armstrong number...");
//     }
// }






// // //..........armstrong number among........

// import java.util.Scanner;
// class MathsQue {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter no: ");
//         int n = scan.nextInt();

//         for(int i=0; i<=n; i++) {
//             int store = i;
//             int sum = 0;
//             while(store>0) {
//                 int digit = store%10;
//                 sum += digit*digit*digit;
//                 store /= 10;
//             }
//             if(i==sum) 
//                 System.out.println(i+" ");
//         }
//     }
// }






// //.......squre root........

// public class MathsQue {
//     public static void main(String[] args) {
//         MathsQue obj = new MathsQue();
//         int a = 16;   
//         double store = Math.pow(a,.5);   //16 ^ .5
//         // or
//         double store1 = Math.sqrt(a);
//         System.out.println(store+"  "+store1);
//     }
// }






//.......area and perimeter of a triangle without perrameter in constructor........

// public class MathsQue {
//     int a, b, c;
//     MathsQue() {
//         a=2; b=5; c=6;
//     }
//     double getArea() {
//         double s=(a+b+c)/2.0;           //always write 2.0 not 2 only
//         double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
//         return area;
//     }
//     double getPerimeter() {
//         double perimeter = a+b+c;
//         return perimeter;
//     }
//     public static void main(String[] args) {
//         MathsQue obj = new MathsQue();
//         System.out.println("Area: "+obj.getArea());
//         System.out.println("Parimeter: "+obj.getPerimeter());
//     }
// }








// //........average of 3 no....

// import java.util.*;
// class MathsQue {
//     void average() {
//         int sum = 0;
//         Scanner scan = new Scanner(System.in);
//         for (int i = 0; i < 3; i++) {
//             int n = scan.nextInt();
//             sum += n;
//         }
//         int average = sum/3;
//         System.out.println(average);
//     }
//     public static void main(String[] args) {
//         MathsQue obj = new MathsQue();
//         obj.average();
//     }
// }








//.......count all vowels in a string....

import java.util.*;
class MathsQue {
    int vowels() {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        int count=0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        MathsQue obj = new MathsQue();
        System.out.println(obj.vowels());
    }
}







// //........prime no or not.....(*****  again solve *****)

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int i=2;
//         while(i<n) {
//             if(n%i == 0){
//                 System.out.println("Number is not prime divide.."+i);
//                 break;
//             }
//             else if(n%i != 0) {
//                 System.out.println("Prime No..");
//                 break;
//             }
//             i++;
//         }
//         continue;
//     }
// }





