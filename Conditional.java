// //..........if-else...........

// public class Conditional {
//     public static void main(String[] args) {
//         int age=18;
//         if(age>18 || age==18)
//             System.out.println("legal adult");
//         else if(age<=17)
//             System.out.println("Kids allowd");
//         else
//             System.out.println("last situation");
//     }
// }




// //.........Square or not........

// import java.util.Scanner;
// public class Conditional {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter length: ");
//         int length = scn.nextInt();
//         System.out.print("Enter breadth: ");
//         int breadth = scn.nextInt();
//         if(length == breadth)
//             System.out.println("...Square...");
//         else
//             System.out.println("...not Square...");
//     }
// }





// //..........print absolute value of number.....

// import java.util.Scanner;
// public class Conditional {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int number = scn.nextInt();
//         if(0>number) {
//             System.out.println("absolute value: "+number*(-1));
//         }
//     }
// }






// // Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit or Loss.

// import java.util.Scanner;
// public class Conditional {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.println("Cost price: ");
//         int cost_price = scn.nextInt();
//         System.out.println("Selling price: ");
//         int selling_price = scn.nextInt();
        
//         if(cost_price < selling_price)
//             System.out.println("profit= "+(selling_price-cost_price));
//         else
//             System.out.println("loss: "+(cost_price-selling_price));

//     }
// }






// //.......switch case.......

// public class Conditional {
//     public static void main(String[] args) {
//         char vowels = 'i';
//         switch(vowels) {
//             case 'a': System.out.println("a vowels");
//             break;
//             case 'e': System.out.println("e vowels");
//             break;
//             case 'i': System.out.println("i vowels");
//             break;
//             case 'o': System.out.println("o vowels");
//             break;
//             case 'u': System.out.println("u vowels");
//             break;
//             default: System.out.println("Default");
//         }
//     }
// }




//calculator using switch statement to perform + - * / ..

import java.util.Scanner;

class Conditional {
    static int sum() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 2 no's: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = a+b;
        return sum;
    }
    static int sub() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 2 no's: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sub = a-b;
        return sub;
    }
    static int multi() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 2 no's: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int multi = a*b;
        return multi;
    }
    static int divide() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 2 no's: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int divide = a/b;
        return divide;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("operation(+ - * /): ");
        char op = scan.next().charAt(0);
        switch(op) {
            case '+':
            System.out.println("addition is: "+sum());
            break; 

            case '-':
            System.out.println("substraction is: "+sub());
            break; 

            case '*':
            System.out.println("multiply is: "+multi());
            break; 

            case '/':
            System.out.println("divition is: "+divide());
            break; 

            default:
            System.out.println("Wrong charater..");
        }
    }
}

