import java.util.Scanner;

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






// //.....Decimal to Binary conversion....

// import java.util.Scanner;
// public class DecimalBinaryConv {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int binaryNum = scan.nextInt();
//         int ans = 0;
//         int power = 1;
//         while(binaryNum > 0) {
//             int digit = binaryNum%2;
//             ans += (digit * power);
//             binaryNum /= 2;
//             power *= 10;

//         }
//         System.out.println(ans);
//     }
// }






class DecimalBinaryConv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 1;
        while(n>0) {
            int i = 1;
            int unitDig = n%10;
            sum = sum + (unitDig * (int)Math.pow(2, i));
            i++;
            n/=10;
        }
        System.out.println(sum);
    }
}