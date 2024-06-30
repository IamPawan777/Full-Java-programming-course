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






// // // .........15............

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






// // // .............22............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         // for (int i = 1; i <= n; i++) {
//         //     for (int j = 1; j <= i; j++) {
//         //         System.out.print("*");
//         //     }
//         //     System.out.println();
//         // }
//         // or
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if(i>=j)
//                     System.out.print("*"); 
//             }
//             System.out.println();
//         }
//     }
// }








// // .............23............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         int count = 0;
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(i+j-1);
//             }
//             System.out.println();
//         }
//     }
// }






// // .............24............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         // for (int i = 1; i <= n; i++) {
//         //     for (int k = i; k >= 1; k--) {
//         //         System.out.print(k);
//         //     }
//         //     System.out.println();
//         // }
//         // or
//         for (int i = 1; i <= n; i++) {
//             for (int k = 1; k <= i; k++) {
//                 System.out.print(i-k+1);
//             }
//             System.out.println();
//         }
//     }
// }





// // .............25............

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
//             for(int k = 1; k <= i; k++) {
//                 System.out.print(k);
//             }
//             for (int l = 1; l <= i-1; l++) {
//                 System.out.print(l);
//             }
//             System.out.println();
//         }
//     }
// }






// import java.util.Scanner;
// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i; j++)
//                 System.out.print(" ");
//             for (int k = 1; k <= 2*i-1; k++) 
//                 System.out.print(i);
//         System.out.println();
                
//         }
//     }
// }







// import java.util.Scanner;
// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();         
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= 2*i-1; k++) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }






// import java.util.Scanner;
// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();    
//         for(int i=1; i<=n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=(n-i)*2-1; k++){
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }






// import java.util.Scanner;
// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();         
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k=(n-i)*2-1; k>=1; k--) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }





// import java.util.Scanner;
// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();    
//         for(int i=1; i<=n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = (n-i)*2-1; k >= n-i; k--) {
//                 System.out.print(k);
//             }
//             for (int k = (n+1)-i; k <= (n-i)*2-1; k++) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }






//...........********........

// import java.util.*;

// public class patterns3 {
//     public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     int n = scan.nextInt();
//     for (int i = 1; i <= n; i++) {
//         for (int j = 1; j <= n-i; j++) {
//             System.out.print(" ");
//         }
//         char ch = 'A';
//         for (int k = 1; k <= 2*i-1; k++) {
//             System.out.print(ch);
//             ch += 1;
//         }
//         System.out.println();
//     }


//     for (int i = 1; i <= n; i++) { 
//         for (int l = 1; l <= i; l++) {
//             System.out.print(" ");
//         }
//         char ch = 'A';
//         for (int m = (n-i)*2-1; m >= n-i; m--) {
//             System.out.print(ch);
//             ch+=1;
//         }
//         for (int p = (n+1)-i; p <= (n-i)*2-1; p++) {
//             System.out.print(ch);
//             ch+=i;
//         }
//         System.out.println();
//     }
//     }
// }





// import java.util.Scanner;

// class pattern3 {
//     public static void main(String []args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2*i)-1; k++) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }





// import java.util.Scanner;

// class pattern3 {
//     public static void main(String []args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         for (int i = 3; i < n; i++) {
//             for (int j = 2; j < i-1; j++) {
//                 if(i%j != 0)
//                     System.out.println(i);
//                 else
//                     break;
//             }
//         }
//     }
// }






// // .............26............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 char c = (char)('A'+j-1);       //change into char
//                 System.out.print(c);
//             }
//             System.out.println();
//         }
//     }
// }






// // // .............27............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         char start = 'A';
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 System.out.print(start);
//                 start += 1;
//             }
//             System.out.println();
//         }
//     }
// }






// // // .............28............

// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("enter no: ");
//         int n = scan.nextInt();
//         for (int i = 1; i <= n; i++) {
//             char ch = 'A';
//             for (int j = 0; j < n; j++) {
//                 System.out.print(ch);
//                 ch += 1;
//             }
//             System.out.println();
//         }
//     }
// }






// import java.util.Scanner;

// class patterns3 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=i; k++) {
//                 System.out.print(k);
//             }
//             // for()
//             System.out.println();
//         }
//     }
// }

