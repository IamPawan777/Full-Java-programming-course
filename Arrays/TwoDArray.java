// //...traversal by for each loop......

// public class TwoDArray {
//     public static void main(String[] args) {
//         int[][] arr = {{2,4,6}, {4,1,9,8}, {9,1,3,}, {7,4}};
//         for(int i[] : arr) {                    //line important
//             for(int j : i) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//or

// class TwoDArray {
//     public static void main(String[] args) {
//         int[][] arr = {{12,23,44}, {23,55,22,11,44}, {33,44}, {99}};
//         for(int i=0; i<arr.length; i++) {
//             for(int j=0; j<arr[i].length; j++) {                        //...Impotant line...for traversing in column....
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }





// //.....swaping element in 2D matrix.........

// class TwoDArray {
//     static void swapEle(int arr[][]) {
//         for (int i = 0; i < arr.length; i++) {
//             int leftCol = 0;
//             int rightCol = arr[i].length-1;

//             while(leftCol < rightCol) {
//                 int temp = arr[i][leftCol];
//                 arr[i][leftCol] = arr[i][rightCol];
//                 arr[i][rightCol] = temp;

//                 leftCol++; 
//                 rightCol--;
//             }            
//         }
//     }
//     public static void main(String[] args) {
//         int arr[][] = { {1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                         {13,14,15,16}};
        
//         swapEle(arr);

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }







// //.....Transpose an array........

// import java.util.*;
// import java.io.*;

// class TwoDArray {
//     static void transposeArray(int[][] a){
//         for(int i=0; i<a.length; i++) {
//             for(int j=i; j<a[i].length; j++) {
//                 int temp = a[i][j];
//                 a[i][j] = a[j][i];
//                 a[j][i] = temp;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[][] = {{1,2,3,4},
//                        {5,6,7,8},
//                        {9,10,11,12},
//                        {13,14,15,16}};
//         // for (int i = 0; i < arr.length; i++) {
//         //     for (int j = 0; j < arr[i].length; j++) {
//         //         System.out.print(arr[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }

//         transposeArray(arr);        
        
//         System.out.println("After transpose: ");
//         for (int i = 0; i < arr.length; i++) {          ///print transpose array
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         //...or...
//         // for(var k:arr){
//         //     System.out.print(Arrays.toString(k));
//         // }
//     }
// }






// //......rotation of an array......

// class TwoDArray {

//     static void rotation(int ar[][]) {
//         for (int i = 0; i < ar.length; i++) {
//             for (int j = i; j < ar[i].length; j++) {
//                 int temp = ar[i][j];
//                 ar[i][j] = ar[j][i];
//                 ar[j][i] = temp;
//             }
//         }

//         for (int i = 0; i < ar.length; i++) {
//             int left = 0;
//             int right = ar[i].length-1;

//             while(left < right) {
//                 int temp = ar[i][left];
//                 ar[i][left] = ar[i][right];
//                 ar[i][right] = temp;
                
//                 left++;
//                 right--;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

//         rotation(arr);

//         for(int i=0; i<arr.length; i++) {
//             for(int j=0; j<arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }

//     }
// }