import javax.xml.transform.Source;

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             System.out.print("* ");
//         }
//     }    
// }



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




// //A
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




//D
public class Patterns {
    public static void main(String[] args) {
        int n=7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0 || i==0 && j<n-1  || i==n-1 && j<n-1 || j==n-1 && i>0 && i<n-1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}