// //...insertion sort......(..one side sorted one side unsorted array..)..

// import java.util.*;

// public class InsertionSort {
//     static void insertSort(int[] ar) {
//         for (int i = 1; i < ar.length; i++) {
//             int temp = ar[i];       //..pic the 1st no on unsorted array..
//             int j = i-1;            //..0th position
//             while(j>=0 && ar[j] > temp) {           //..1st condition is not go for -1th index
//                 ar[j+1] = ar[j];
//                 j--;
//             }
//             ar[j+1] = temp;                 //..finally if j=-1 then at 'j=0' 'temp' value inserted or if while condition is not true j+1
//         }

//     }


//      public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Total element: ");
//         int n = scan.nextInt();
        
//         System.out.println("Enter element: ");
//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();
//         }

//         for (int i = 0; i < arr.length; i++) {              //..unsorted array..
//             System.out.print(arr[i]+" ");
//         }

//         insertSort(arr);                            //...sorting algo...
//         System.out.println();

//         for (int i = 0; i < arr.length; i++) {             //..sorted array..
//             System.out.print(arr[i]+" ");
//         }
//     }
// }









import java.util.*;

public class InsertionSort {
     public static void main(String[] args) {
       int[] arr = {3,5,1,6,0};

       for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && temp > arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
       }

       for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
       }
    }
}