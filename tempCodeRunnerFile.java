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

public class MathsQue {
    int a, b, c;
    MathsQue() {
        a=2; b=5; c=6;