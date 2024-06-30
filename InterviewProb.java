// //......Tiling problem...........board size=2*n...||...tile size: 2*1.....
// import java.util.*;
// public class InterviewProb {
//     static int ways(int n) {
//         if(n<=3)
//         return n;
//         // int a = ways(n-1);                  // 1 tile vertically
//         // int b = ways(n-2);                  // 2 tile horizontally
//         // return a+b;
// // or
//         return ways(n-1) + ways(n-2);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n: ");
//         int n = sc.nextInt();
//         System.out.println("Ans: "+ways(n));
//     }
// }



// (comnination) subarray sum input: "321", output: 380

import java.util.*;

class InterviewProb{
    static int sumOfDigit(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String s = str.substring(i, j+1);
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();

        int num = sumOfDigit(str);
        System.out.println("Sum is: "+num);

    }
}
