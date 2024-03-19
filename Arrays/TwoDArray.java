//...traversal by for each loop......

// public class TwoDArray {
//     public static void main(String[] args) {
//         int[][] arr = {{2,4,6}, {4,1,9,8}, {9,1,3,}, {7}};
//         for(int i[] : arr) {                    //line important
//             for(int j : i) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// or

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
//         for (int i = 0; i < arr.length; i++) {                       //responsible for row
//             int leftCol = 0;
//             int rightCol = arr[i].length-1;

//             while(leftCol < rightCol) {                  //responsible for column
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







// //......rotation 90degree of an array......

// class TwoDArray {

//     static void rotation(int ar[][]) {
//         for (int i = 0; i < ar.length; i++) {
//             for (int j = i; j < ar[i].length; j++) {
//                 int temp = ar[i][j];
//                 ar[i][j] = ar[j][i];
//                 ar[j][i] = temp;
//             }
//         }

//         for (int i = 0; i < ar.length; i++) {                    //resposible for row
//             int left = 0;
//             int right = ar[i].length-1;

//             while(left < right) {                                //for column
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




 


// //...........rotation 180 degree........

// class TwoDArray {
//     static void swapping(int[][] ar) {
//         for (int k = 0; k < 2; k++) {          // two times rotation 
            
//             for (int i = 0; i < ar.length; i++) {
//                 for (int j = i; j < ar[i].length; j++) {
//                 int temp = ar[i][j];
//                 ar[i][j] = ar[j][i];
//                 ar[j][i] = temp;
//             }
//             }
//             for (int i = 0; i < ar.length; i++) {
//                 int leftco = 0;
//                 int rightco = ar[i].length-1;
//                 while(leftco<rightco) {
//                     int temp = ar[i][leftco];
//                     ar[i][leftco] = ar[i][rightco];
//                     ar[i][rightco] = temp;
//                     leftco++;  rightco--;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[][] ar = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

//         for (int i = 0; i < ar.length; i++) {
//             for (int j = 0; j < ar[i].length; j++) {
//                 System.out.print(ar[i][j]+" ");
//             }
//             System.out.println();
//         }

//         swapping(ar);
        
//          for (int i = 0; i < ar.length; i++) {
//             for (int j = 0; j < ar[i].length; j++) {
//                 System.out.print(ar[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }





// //...........simple method prifix sum indexs..........

// import java.util.*;
 
// class TwoDArray {
//     static int findPrifixSum(int[][] arr, int r1, int c1, int r2, int c2) {
//         int sum = 0;
//         for (int i = r1; i <= r2; i++) {
//             for (int j = c1; j <= c2; j++) {
//                 sum += arr[i][j];
//             }            
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         int[][] arr = {{1,1,1,1},
//                        {1,1,1,1},
//                        {1,1,1,1},
//                        {1,1,1,1}};

//         System.out.println("first coodinate: ");
//         int r1 = scan.nextInt();    
//         int c1 = scan.nextInt();

//         System.out.println("second coodinate: ");
//         int r2 = scan.nextInt();
//         int c2 = scan.nextInt();

//         int result = findPrifixSum(arr, r1, c1, r2, c2);

//         System.out.println("Sum is: "+result);
//     }
// }








// //...........prifix sum. optimized approch (the complexity is reduced).........

// import java.util.*;
 
// class TwoDArray {
//     static void prifix_Sum_Matrix(int[][] a) {              //pre processing matrix
       
//         for(int i=0; i<a.length; i++) {        //for row    //row wise prifix sum
//             for (int j = 1; j < a[0].length; j++) {             //for column
//                 a[i][j] += a[i][j-1];
//             }
//         }
//         for (int j = 0; j < a.length; j++) {           //for column ......//column wise prifix sum
//             for(int i = 1; i < a[0].length; i++) {        //for row
//                 a[i][j] += a[i-1][j];
//             }
//         }
//     }
    
//     static int findPrifixSum(int[][] ar, int r1, int c1, int r2, int c2){
//         int total_regionSum=0, up_regionSum=0, left_regionSum=0, repet_regionSum=0, result=0;
//         total_regionSum = ar[r2][c2];
//         if(r1>=1)                                       //if condition is use for solving 0th index
//             up_regionSum = ar[r1-1][c2];
//         if(c1>=1)
//             left_regionSum = ar[r2][c1-1];
//         if(r1>=1 && c1>=1)
//             repet_regionSum = ar[r1-1][c1-1];
//         result = total_regionSum - up_regionSum - left_regionSum + repet_regionSum;
//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         int[][] arr = {{1,1,1,1},
//                        {1,1,1,1},
//                        {1,1,1,1},
//                        {1,1,1,1}};

//         System.out.println("first coodinate: ");
//         int r1 = scan.nextInt();    
//         int c1 = scan.nextInt();

//         System.out.println("second coodinate: ");
//         int r2 = scan.nextInt();
//         int c2 = scan.nextInt();
        
//         prifix_Sum_Matrix(arr);
//         int result = findPrifixSum(arr, r1, c1, r2, c2);
//         System.out.println("Sum is: "+result);

//     }
// }






// /*
// print the following:
//     number of positive numbers
//     number of negative numbers
//     number of odd numbers
//     number of even numbers
//     number of 0.
// */

// import java.util.Scanner;
// class TwoDArray {
//     static void printStuff(int[][] arr) {
//         int positive=0, negative=0, even=0, odd=0, zero=0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 if(arr[i][j] > 0){
//                     positive++;
//                 }
//                 if(arr[i][j] < 0){
//                     negative++;
//                 }
//                 if(arr[i][j] % 2 == 0) {
//                     even++;
//                 }
//                 if(arr[i][j] % 2 != 0){
//                     odd++;
//                 }
//                 if(arr[i][j] == 0) {
//                     zero++;              
//                 }
//             }        
//         }
//             System.out.print("positive: "+ positive+"\n");                
//             System.out.print("Negative: "+ negative+"\n");             
//             System.out.print("Even: "+ even+"\n");
//             System.out.print("Odd: "+ odd+"\n");
//             System.out.print("Zero: "+ zero+"\n");
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter Number of rows & column: ");
//         int n = scan.nextInt();        
//         int m = scan.nextInt();
//         int[][] arr = new int[n][m];
//         System.out.println("Enter element");
        
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 arr[i][j] = scan.nextInt();
//             }
//         }
//         printStuff(arr);
//     }
// }








// // print the elements above the first diagonal.....

// import java.util.Scanner;
// class TwoDArray {
//     static void printStuff(int[][] arr) {   
//        for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr[0].length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//        }
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter Number of rows & column: ");
//         int n = scan.nextInt();        
//         int m = scan.nextInt();
//         int[][] arr = new int[n][m];
//         System.out.println("Enter element");
        
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 arr[i][j] = scan.nextInt();
//             }
//         }
//         printStuff(arr);
//     }
// }








// // print the elements of both the diagonals.........

// import java.util.Scanner;
// class TwoDArray {
//     static void printStuff(int[][] arr) {   
//        for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if(i==j || i+j == arr.length-1) {
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//        }
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter Number of rows & column: ");
//         int n = scan.nextInt();        
//         int m = scan.nextInt();
//         int[][] arr = new int[n][m];
//         System.out.println("Enter element");
        
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr[i][j] = scan.nextInt();
//             }
//         }
//         printStuff(arr);
//     }
// }






// // print the largest element.........

// import java.util.Scanner;
// class TwoDArray {
//     static void printStuff(int[][] arr) {   
//         int maxValue = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if(arr[i][j] > maxValue) {
//                     maxValue = arr[i][j];
//                 }
//             }
//         }
//         System.out.println("max value is: "+maxValue);
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter Number of rows & column: ");
//         int n = scan.nextInt();        
//         int m = scan.nextInt();
//         int[][] arr = new int[n][m];
//         System.out.println("Enter element");
        
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {        //....always "arr[i].length" write not "arr.length"
//                 arr[i][j] = scan.nextInt();
//             }
//         }
//         printStuff(arr);
//     }
// }





// //...displays the elements of middle row and the elements of middle column (matrix in odd dimantion)

// import java.util.Scanner;
// class TwoDArray {
//     static void printStuff(int[][] arr) {   
//         int value = 0,i,j;
//         for ( i = 0; i < arr.length; i++) {
//             for ( j = 0; j < arr[i].length; j++) {
//                 if(j == (arr.length-1)/2 ) {
//                     System.out.print(arr[i][j]+" ");
//                 }
//                 if(i == (arr.length-1)/2 && i != j) {
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter Number of rows & column: ");
//         int n = scan.nextInt();        
//         int m = scan.nextInt();
//         int[][] arr = new int[n][m];
//         System.out.println("Enter element");
        
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {        //....always "arr[i].length" write not "arr.length"
//                 arr[i][j] = scan.nextInt();
//             }
//         }
//         printStuff(arr);
//     }
// }




//................tranpose...............

// class TwoDArray {
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j <= i; j++) {
//                 int temp = arr[i][j];
//                 arr[i][j] = arr[j][i];
//                 arr[j][i] = temp;
//             }  
//         }
        
//         System.out.println();
//          for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }





// //..........wave from print.................

// class TwoDArray {
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

//         for(int i=0; i<arr.length; i++) {
//             if(i%2 == 0){
//                 for(int j=0; j<arr[0].length; j++){
//                     System.out.print(arr[j][i] + " ");
//                 }
//             }            
//             if(i%2 != 0){
//                 for(int j=arr[0].length-1; j>=0; j--){
//                     System.out.print(arr[j][i] + " ");
//                 }
//             }
//         }

//     }
// }






// //.......print spiral order..............

// class TwoDArray {
//     static void spiralArr(int[][] arr) {
//         int top = 0, bottom = arr.length-1;
//         int left = 0, right = arr[0].length-1;
       

//         while (top <= bottom && left <= right) {
//             for(int j=left; j<=right; j++) {
//                 System.out.print(arr[top][j]+" ");
//             }
//             top++;
//             for(int i=top; i<=bottom; i++) {
//                 System.out.print(arr[i][right]+" ");
//             }
//             right--;
//             for(int j=right; j>=left && top <= bottom; j--) {
//                 System.out.print(arr[bottom][j]+" ");
//             }
//             bottom--;
//             for(int i=bottom; i>=top && left <= right; i--) {
//                 System.out.print(arr[i][left]+" ");
//             }
//             left++;
//         }
//     }
//     public static void main(String[] args) {
//         int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//         spiralArr(a);
//     }
// }






//.....spiral matrix..............

class TwoDArray {
    static int[][] spiralArr(int n) {
        int[][] arr = new int[n][n];

        int top = 0, bottom = arr.length-1;
        int left = 0, right = arr[0].length-1;
        int num = 1;

        while (top <= bottom && left <= right) {
            for(int j=left; j<=right; j++) {
                arr[top][j] = num++;
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                arr[i][right] = num++;
            }
            right--;
            for(int j=right; j>=left && top <= bottom; j--) {
                arr[bottom][j] = num++;
            }
            bottom--;
            for(int i=bottom; i>=top && left <= right; i--) {
                arr[i][left] = num++;
            }
            left++;
        }
        return arr;
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] a = spiralArr(n);
        print(a);
    }
}