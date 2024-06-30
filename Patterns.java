// // ......1......
// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             System.out.print("* ");
//         }
//     }    
// }



//........2.....
// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();       //new line
//         }
//     }    
// }




// //.........3.....
// public class Patterns {
//     public static void main(String[] args) {
        
//         int n = 5;
//         for(int i=0; i<n;  i++) {           //0 to 4 (0 1 2 3 4)
//             for(int j=0; j<n; j++) {
//                 if(i==0 || i==n-1 || j==0 || j==n-1)
//                     System.out.print("*");          //don't keep space
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }




// // ..........4........
// public class Patterns {
//     public static void main(String[] args) {
//        int n=5;
//        for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 if(i==0 || i==n-1 || j==0 || j==n-1 || i==(n-1)/2 || j==(n-1)/2)
//                     System.out.print("*");
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.println();
//        }
//     }
// }





//............5.......
// public class Patterns {
//     public static void main(String[] args) {
//        int n=5;
//        for(int i=0; i<n; i++) {
//         for(int j=0; j<n; j++) {
//             if(i==0 || i==(n-1)/2 || j==0 || j==n-1 ) 
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//         }
//         System.out.println();
//        }
//     }
// }




//............6.............
// public class Patterns {
//     public static void main(String[] args) {
//        int n=5;
//        for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==(n-1)/2 || j==0 || j==n-1)
//                     System.out.print("*");
//                 else    
//                     System.out.print(" ");
//             }
//             System.out.println();
//        }
//     }
// }





//.......7.........
// public class Patterns {
//     public static void main(String[] args) {
//        int n=7;
//        for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==0 || i==n-1 || j==(n-1)/2)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }  
//             System.out.println();      
//        }
//       }
// }




//.........8.......
// public class Patterns {
//     public static void main(String[] args) {
//        int n=5;
//        for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==0 || i==(n-1)/2 || i==n-1 || j==0)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//        }
//     }
// }





// // ..........9.......
// public class Patterns {
//     public static void main(String[] args) {
//        int n=5;
//        for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==0 || i==(n-1)/2 || j==0)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//        }
//     }
// }





//........10......
// class Patterns {
//     public static void main(String[] args) {
//         int n=7;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==0 || j==(n-1)/2)
//                     System.out.print("*");
//                 else    
//                     System.out.print(" ");
//             }
//             System.out.println();            
//         }
//     }
// }



// //...11....some advance...

// public class Patterns {
//     public static void main(String[] args) {
//     int n=5;
//     for (int i = 0; i < n; i++) {
//         for (int j = 0; j < n; j++) {
//             if(i==0 && j>0 && j<n-1  ||  j==0 && i>0 && i<n-1  ||  i==n-1 && j>0 && j<n-1  ||  j==n-1 && i>0 && i<n-1)
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//         }  
//         System.out.println();
//     }
//     }
// }




// // .......12............
// public class Patterns {
//         public static void main(String[] args) {
//             int n=7;
//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
//                         System.out.print("*");
//                     else
//                         System.out.print(" ");
//                 }
//                 System.out.println();
//             }
//         }
//     }




// // .......13.........
// public class Patterns {
//     public static void main(String[] args) {
//         int n=7;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(j==0 || i==0 && j<n-1  || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1 )
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }



// // ..........14.......
// class Patterns {
//     public static void main(String[] args) {
//         int n=7;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==n-1 && j>0 && j<n-1  ||  j==0 && i<n-1  ||  j==n-1 && i<n-1) 
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }            
//             System.out.println();
//         }
//     }
// }




// // .......15...........
// class Patterns {
//     public static void main(String[] args) {
//         int n=7;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==n-1 || j==0 || i>=j)
//                     System.out.print("*");
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }



// // .........16........
// class Patterns {
//     public static void main(String[] args) {
//         int n=7;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==0 || j==0 || i+j<=n-1)
//                     System.out.print("*");
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }






// //........17. G ........
// class Patterns {
//     public static void main(String[] args) {
//         int n=9;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(j==0 && i>0 && i<n-1 || i==0 && j>0 && j<n-1 || i==n-1 && j>0 && j<n-1 || j==n-1 && i>0 && i<(n-2)/2 || j==n-1 && i>(n-1)/2 && i<n-1 || i==(n-1)/2 && j>(n-1)/2)
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }




// //.........PAWAN BISHT.........
// class Patterns {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Row and Column: ");
//         // int n = scan.nextInt();
//         int n =  7;
//         for (int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 if(j==0 || j==n-1 && i>0 && i<(n-1)/2 || i==0 && j<n-1 || i==(n-1)/2 && j<n-1) 
//                     System.out.print("#");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print("  ");
//             for (int j=0; j<n; j++) {
//                 if(j==0 && i>0 || j==n-1 && i>0 || i==0 && j>0 && j<n-1 || i==(n-1)/2) 
//                     System.out.print("#");
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.print("  ");
//             for (int j=0; j<n; j++) {
//                 if(j==0 && i<n-1 || j==n-1 && i<n-1 || j==(n-1)/2 && i>=(n-1)/2 && i<n-1 || i==n-1 && j>0 && j<(n-1)/2 || i==n-1 && j>(n-1)/2 && j<n-1 )
//                     System.out.print("#");
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.print("  ");
//             for (int j=0; j<n; j++) {
//                 if(j==0 && i>0 || j==n-1 && i>0 || i==0 && j>0 && j<n-1 || i==(n-1)/2 && j>0 && j<n-1)
//                     System.out.print("#");
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.print("  ");
//             for(int j=0; j<n; j++) {
//                 if(j==0 || j==n-1 || i==j)
//                     System.out.print("#");
//                 else
//                     System.out.print(" ");
//             }
//         System.out.println();
//         }
        
//         //new line
//         System.out.println();
//         System.out.println();
//         for (int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 if(j==0 || i==0 && j<n-1 || i==(n-1)/2 && j<n-1 || i==n-1 && j<n-1 || j==n-1 && i>0 && j<(n-1)/2 || j==n-1 && i>0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2 && i<n-1)  
//                     System.out.print("#");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print("  ");
//             for (int j=0; j<n; j++) {
//                 if(i==0 || i==n-1 || j==(n-1)/2) 
//                     System.out.print("#");
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.print("  ");
//             for (int j=0; j<n; j++) {
//                 if(i==0 && j>0 || i==n-1 && j<n-1 || i==(n-1)/2 && j>0 && j<n-1 || j==0 && i>0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2 && i<n-1)
//                     System.out.print("#");
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.print("  ");
//             for (int j=0; j<n; j++) {
//                 if(j==0 || j==n-1 || i==(n-1)/2)
//                     System.out.print("#");
//                 else 
//                     System.out.print(" ");
//             }
//             System.out.print("  ");
//             for(int j=0; j<n; j++) {
//                 if(i==0 || j==(n-1)/2)
//                     System.out.print("#");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }





// class Patterns {
//     public static void main(String[] args) {
//         int n=11;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (j==0 || i==0 && j<n-1 || j==n-1 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<(n-1)) 
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print("  ");

//             for (int j = 0; j < n; j++) {
//                 if (j==0 || j==n-1 || i==n-1 && j<(n-1)/2 || i==n-1 && j>(n-1)/2 || j==(n-1)/2 && i>(n-1)/2 && i<n-1) 
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i==0 && j>0 || i==(n-1)/2 && j>0 && j<n-1 || i==n-1 && j<n-1 || j==0 && i>0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2 && i<n-1) 
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print("  ");

//             for (int j = 0; j < n; j++) {
//                 if (j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) 
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }

//             for (int j = 0; j < n; j++) {
//                 if (j==(n-1)/2) 
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print("  ");

//             for (int j = 0; j < n; j++) {
//                 if (j==0 || i==n-1) 
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print(" ");

//             for (int j = 0; j < n; j++) {
//                 if (j==0 || i==n-1) 
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.print(" ");

//             for (int j = 0; j < n; j++) {
//                 if (i==0 && j>0 || i==(n-1)/2 && j>0 && j<n-1 || i==n-1 && j<n-1 || j==0 && i>0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2 && i<n-1) 
//                     System.out.print("*");
//                 else
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }





// // .........16........
// class Patterns {
//     public static void main(String[] args) {
//         int n=5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==j || i+j == n-1)
//                     System.out.print("*");
//                 else    
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }






// class Patterns {
//     public static void main(String[] args) {
//         int n=5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(i==(n-1)/2 || j==(n-1)/2)
//                     System.out.print("*");
//                 else    
//                     System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }