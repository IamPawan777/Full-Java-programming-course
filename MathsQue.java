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
//                 System.out.println(n);
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






//.........character at string.......

class MathsQue {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scan.nextLine();

        System.out.println("at Index: ");
        char ch = str.charAt(scan.nextInt()-1);

        System.out.println("character: "+ch);
    }
}
