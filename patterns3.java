// //.....1............

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter any no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = i; j <= n; j++) {
//                 System.out.print(j);
//             }  
//             for (int j = 1; j <= i-1; j++) {
//                 System.out.print(j);
//             }   
//             System.out.println();       
//         }
//     }
// }






// //.......2........

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter any no: ");
//         int n = scan.nextInt();
//         int m = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }






// //.......3......

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter any no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if(i==1 || j==1 || i==n || j==n) 
//                     System.out.print(j);
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }






// //.........4............

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter any no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if((i+j) % 2 == 0) 
//                     System.out.print("1");
//                 else 
//                     System.out.print("2");
//             }
//             System.out.println();
//         }
//     }
// }







// //.........5............

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter any no: ");
//         int n = scan.nextInt();
//         for (int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }





// // .........6............

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter any no: ");
//         int n = scan.nextInt();
//         for (int i=1; i<=n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=i; k++) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }







// // .........7............

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter any no: ");
//         int n = scan.nextInt();
//         for (int i=1; i<=n; i++) {
//             for (int j=i; j>0; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }







// // .........8............

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter any no: ");
//         int n = scan.nextInt();
//         for (int i=1; i<=n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }







// // .........9............

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter any no: ");
//         int n = scan.nextInt();
//         for (int i=1; i<=n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }






// // .........10............

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         int n=9;
//         int count = 10;
//         for (int i=1; i<=n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 count++;
//                 System.out.print(count + " ");
//             }
//             System.out.println();
//         }
//     }
// }





// // // .........11............

// import java.util.Scanner;

// public class patterns3 {
//     public static void main(String[] args) {
//         int n = 5;
//         int count=0;
//         for (int i=1; i<=n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 count++;
//                 System.out.print(count+" ");
//             }
//             System.out.println();
//         }
//     }
// }





// // // .........12............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }






// // .........13............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(n-i);
//                 // n--;
//             }
//             System.out.println();
//         }
//     }
// }





// // .........14............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }






// // .........15............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }







// // .........16............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         int count = 0;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2*i-1; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }






// // .........17............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) {         //space
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= i; k++) {          //left
//                 System.out.print(k);
//             }
//             for (int l = i-1; l >= 1; l--) {
//                 System.out.print(l);
//             }
//             System.out.println();
//         }
//     }
// }







// // .........18...........

// class patterns3 {
//     public static void main(String[] args) {
//         int n = 3;
//         int count =0;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 2*i-1; j++) {
//                 count++;
//                 System.out.print(count);
//             }
//             System.out.println();
//         }
//     }
// }






// // .........19............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 System.out.print(n-j+1);
//             }
//             // or
//             // for (int j = n; j >= 1; j--) {
//             //     System.out.print(j);
//             // }
//             System.out.println();
//         }
//     }
// }






// // .........20............

// class patterns3 {
//     public static void main(String[] args) {
//         int n = 3;
//         int count =0;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 count++;
//                 System.out.print(count);
//             }
//             System.out.println();
//         }
//     }
// }





// // .........21............

// class patterns3 {
//     public static void main(String[] args) {
//         int n = 3;
//         int count =0;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 count++;
//                 System.out.print(count);
//             }
//             System.out.println();
//         }
//     }
// }






// .............22............

class patterns3 {
    public static void main(String[] args) {
        int n = 3;
        int count =0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
}