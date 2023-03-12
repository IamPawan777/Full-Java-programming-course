// //.....Binary to decimal conversion....

// import java.util.Scanner;
// public class DecimalBinaryConv {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int binaryNum = scan.nextInt();
//         int ans = 0;
//         int power = 1;              //2^0 = 1
//         while(binaryNum > 0) {
//             int digit = binaryNum%10;
//             ans += (digit * power);
//             binaryNum /= 10;
//             power *= 2;
//         }
//         System.out.println(ans);
//     }
// }





//.....Decimal to Binary conversion....

import java.util.Scanner;
public class DecimalBinaryConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int binaryNum = scan.nextInt();
        int ans = 0;
        int power = 1;
        while(binaryNum > 0) {
            int digit = binaryNum%2;
            ans += (digit * power);
            binaryNum /= 2;
            power *= 10;

        }
        System.out.println(ans);
    }
}
