//........bianry searching........

// import java.util.Scanner;

// public class Binary {
//     static int binarySearch(int[] arr, int key) {
//         int low=0, high=arr.length-1, mid=0;        
//         while(low <= high) {
//             mid = (low+high)/2;
//             if(arr[mid] == key) {
//                 return mid;
//             }
//             else if(arr[mid] < key) {
//                 low = mid+1;
//             }
//             else if(arr[mid] > key) {
//                 high = mid-1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter no of element: ");
//         int n =  scan.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter elements");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();
//         }

//         System.out.println("Enter searching element: ");
//         int key = scan.nextInt();

//         int index = binarySearch(arr, key);
//         System.out.println("Element at:"+index);
//     }
// }








// //........lower bound ( 1st occurence )......but the complexity is O(n)........

// import java.util.Scanner;

// public class Binary {
//     static int binarySearch(int[] arr, int key) {
//         int value = -1;
//         // for (int i = 0; i < arr.length; i++) {          //.......lower bound......
//         //     if(arr[i] == key) {
//         //         return i;
//         //     }
//         // }
//         for (int i = 0; i < arr.length; i++) {             //...upper bound....
//             if(arr[i] == key) {
//                 value = i;
//             }
//           }
//       return value;
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter no of element: ");
//         int n =  scan.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter elements");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();
//         }
//         System.out.println("Enter searching element: ");
//         int key = scan.nextInt();
//         int index = binarySearch(arr, key);
//         System.out.println("Element at:"+index);
//     }
// }


//....or.......by binary search.....complexity is O(log n)........


// import java.util.Scanner;

// public class Binary {
//     static int binarySearch(int[] arr, int target) {
//        int low = 0, high = arr.length-1, mid = 0, index = -1;
       
//        while(low <= high) {
//         mid = (low+high) / 2;
//         if(arr[mid] == target) {
//             index = mid;
//             high = mid-1;
//         }
//         else if(arr[mid]<target){
//             low = mid+1;
//         }
//         else {
//             high = mid-1;
//         }
//        }
//        return index;
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter no of element: ");
//         int n =  scan.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter elements");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();
//         }

//         System.out.println("Enter searching element: ");
//         int target = scan.nextInt();

//         int index = binarySearch(arr, target);
//         System.out.println("Element at:"+index);
//     }
// }






//.......square root....by binary search......

import java.util.*;

class Binary {
    static int squareRoot(int num) {
        int low=0, high=num, result=-1;
        while(low<=high) {
            int mid = (low+high)/2;
            if(mid*mid == num) {
                return mid;                 //if perfect root present
            }
            else if(mid*mid < num){
                low = mid+1;
                result = mid;              //if not a perfect root number store floor value
            }
            else if(mid*mid > num){
                high = mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number which you want to square root: ");
        int num = scan.nextInt();

        int store = squareRoot(num);
        System.out.println("Square root is: "+store);
    }
}


//.........or............


// import java.util.*;

// class Binary {
//     static int squareRoot(int num) {
//         double square = Math.sqrt(num);             
//         int floor = (int)Math.floor(square);        //..if perfect square root not persent then floor value return
        
//         return floor;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter number which you want to square root: ");
//         int num = scan.nextInt();

//         int store = squareRoot(num);
//         System.out.println("Square root is: "+store);
//     }
// }
