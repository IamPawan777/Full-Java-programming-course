// //......1.bubble sort.............

// import java.util.*;
// public class BubbleSort {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Total element: ");
//         int n = scan.nextInt();
        
//         System.out.println("Enter element: ");
//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();
//         }

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length-1-i; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }

//         System.out.println("sorted array by BUBBLE sort: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }






// //....check in every iteration array......

// class BubbleSort {
//     public static void main(String[] args) {
//         int arr[] = {3,5,1,6,0};
//         int pass = -1;
        
//         for(int i=0; i<arr.length; i++) {
//             boolean check = false;
//             for (int j = 0; j < arr.length-1-i; j++) {
//                 if(arr[j] < arr[j+1]) {
//                     int temp = arr[j+1];
//                     arr[j+1] = arr[j];
//                     arr[j] = temp;
//                     check = true;
//                     pass++;
//                 }
//             }//....inner for...
//             if(check == false) {
//                 break;
//             }
//             System.out.println(i+1 + ".. iteration");
//             for(int k=0; k<arr.length; k++) {               //...in every iteration array is...
//                 System.out.print(arr[k]+" ");            
//             }
//             System.out.println();
//         }  //...outer loop...

//         System.out.print("Total number of iteration: "+pass);
//     }
// }






//....check in every iteration array......

class BubbleSort {
    public static void main(String[] args) {
        int a = 28;
        int b = a>>3;

        System.out.print("Total number of iteration: "+" "+ b);
    }
}