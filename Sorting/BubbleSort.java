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






// //....check in every iteration array......

// class BubbleSort {
//     public static void main(String[] args) {
//         int a = 28;
//         int b = a>>3;

//         System.out.print("Total number of iteration: "+" "+ b);
//     }
// }





// //....move zeros at the end...........

// class BubbleSort {
//     static void moveZero(int[] arr) {
//         int n = arr.length;
//         for(int i=0; i<n-1; i++) {
//             boolean flag = false;                       // for better efficincy........
//             for(int j=0; j<n-i-1; j++) {
//                 if(arr[j] == 0 && arr[j+1] != 0) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     flag = true;
//                 }
//             }
//             if(flag == false) break;
//         }

//         // for(int i=0; i<arr.length; i++) {               // print
//         //     System.out.print(arr[i]+" ");
//         // }
//     }
//     public static void main(String[] args) {
//         int[] arr = {0,2,1,0,6,1,0,1};
//         moveZero(arr);
//         for(int i=0; i<arr.length; i++) {            // print
//             System.out.print(arr[i]+" ");
//         }
//     }
// }






// sort string................
class BubbleSort {
    static void sortString(String[] arr, int n) {
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {            // print
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        // int arr[] = {3,8,1,6,3,6};
        String arr[] = {"string", "two", "is", "this"};
        int n = arr.length;
        sortString(arr, n);
    }
}