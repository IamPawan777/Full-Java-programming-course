//.............1.......

// class Patterns2 {
//     public static void main(String[] args) {
//         int n = 9;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==j && j<(n-1)/2 || i+j==n-1 && j>(n-1)/2 || j==(n-1)/2 && i>(n-2)/2)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }






// /*.....2.Advance pattern..........*/

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=17;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==j)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print("    ");
//             for (int j = 0; j < n; j++) {
//                 if(i==j || i+j==n-1)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print("    ");
//             for (int j = 0; j < n; j++) {
//                 if(i==0 || i==n-1 || j==0 || j==n-1 || i==j || i+j==n-1)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();            
//         }
//     }
// }






//.........3.........

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==j || i+j==n-1 || j==0 || i==0 || i==n-1 ||j==n-1 || i+j==(n-1)/2 || i-j==(n-1)/2 || j-i==(n-1)/2 || j+i==(n-1)+(n-1)/2) {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





//..............4..........

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i+j==(n-1)/2 || j-i==(n-1)/2 || i-j==(n-1)/2 || i+j==(n-1)+(n-1)/2) {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("  ");

//             for (int j = 0; j < n; j++) {
//                 if(i==0 && j<(n-1)/2 || j==0 && i<(n-1)/2 || i+j<=(n-1)/2  ||
//                     i==0 && j>(n-1)/2 || j==n-1 && i<(n-1)/2 || j-i>=(n-1)/2  ||
//                     j==0 && i>(n-1)/2 || i==n-1 && j<(n-1)/2  || i-j>=(n-1)/2  ||
//                     i==n-1 && j>(n-1)/2 || j==n-1 && i>(n-1)/2 || i+j>=(n-1)+(n-1)/2) {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }






//..............5...........

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if( i+j>=(n-1)/2 && j-i<=(n-1)/2 && i<=(n-1)/2 ||
//                     i-j<=(n-1)/2 && i+j<=(n-1)+(n-1)/2 && i>=(n-1)/2) 
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





//............6.............

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==0 || i==j && i<=(n-1)/2 || i+j==n-1 && i<=(n-1)/2) 
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





// // .......7...........

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i+j >= (n-1)/2 && j-i<=(n-1)/2 && i<(n-1)/2) 
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





// //...............8.............

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i>j && j<=(n-1)/2 &&
//                     i+j<n-1 && j<=(n-2)/2) 
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }









// //...............9.............

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i>j && i+j<n-1 ||  i<j && i+j>n-1) 
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





//........10.........

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==0 || i==n-1 || j==0 || j==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2)      
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }







// //...........11.......

// import java.util.Scanner;
// class Patterns {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("How many row & column: ");
//         int n = scan.nextInt();
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i; j++) {
//                     System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }






// //...........12.......

// import java.util.Scanner;
// class Patterns {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("How many row & column: ");
//         int n = scan.nextInt();
//         for (int i=0; i<n; i++) {
//             for (int j=n; j>i; j--) {
//                 System.out.print("*");
//             }            
//             System.out.println();
//         }
//     }
// }

// //...........or.......

// import java.util.Scanner;
// class Patterns {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("How many row & column: ");
//         int n = scan.nextInt();
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n-i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// //...........or.......

// import java.util.Scanner;
// class Patterns {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("How many row & column: ");
//         int n = scan.nextInt();
//         for (int i=0; i<n; i++) {
//             for (int j=0; j<n; j++) {
//                 if(i==0 || j==0 || i+j<=n-1)
//                 System.out.print("*");
//                 else
//                 System.out.print(" ");
//             }            
//             System.out.println();
//         }
//     }
// }






// // .......13.......

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(j>=0 && i<=(n-1)/2 && i+j<=(n-1)/2 ||j==(n-1)/2 && i<=(n-1)/2 || i+j>=n-1 && i<=(n-1)/2 && j<=n-1 && i<=(n-1)/2)      
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }






// //......14.........

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=21;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i<=(n-1)/2 && i+j>=(n-1)/2 && j-i<=(n-1)/2)      
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// //......or.........

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=9;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i+j>=n-1)      
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             for (int j = 0; j < n; j++) {
//                 if(i>j)      
//                 {
//                     System.out.print("#");
//                 } 
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// // //......or.........

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= 2*i-1; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }





// //......or.........

// class Patterns2 {
//     public static void main(String[] args) {
//         int n=4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= 2*i-1; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }






class Patterns2 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i>=j) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if(i+j >= n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}






