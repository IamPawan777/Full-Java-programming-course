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








// //........lower bound ( 1st occurence )....... higher bound ( last occurence ).....but the complexity is O(n)........

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


//....or.......by binary search............. O(log n)........


// import java.util.Scanner;

// public class Binary {
//     static int binarySearch(int[] arr, int target) {
//        int low = 0, high = arr.length-1, mid = 0, result = -1;
       
//        while(low <= high) {
//         mid = (low+high) / 2;
//         if(arr[mid] == target) {
//             result = mid;
//             low = mid+1;                           //...last occurence or lower bound...
//             // high = mid-1;                       //...1st occurence or lower bound...
//         }
//         else if(arr[mid]<target){
//             low = mid+1;
//         }
//         else {
//             high = mid-1;
//         }
//        }
//        return result;
//     }

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter no of element: ");
//         int n =  scan.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter elements (sorted manner)");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();
//         }

//         System.out.println("Enter searching element: ");
//         int target = scan.nextInt();

//         int index = binarySearch(arr, target);
//         System.out.println("Element at:"+index);
//     }
// }






// //.......square root....by binary search......

// import java.util.*;

// class Binary {
//     static int squareRoot(int num) {
//         int low=0, high=num, result=-1;
//         while(low<=high) {
//             int mid = (low+high)/2;
//             if(mid*mid == num) {
//                 return mid;                 //if perfect root present
//             }
//             else if(mid*mid < num){
//                 low = mid+1;
//                 result = mid;              //if not a perfect root number store floor value
//             }
//             else if(mid*mid > num){
//                 high = mid-1;
//             }
//         }
//         return result;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter number which you want to square root: ");
//         int num = scan.nextInt();

//         int store = squareRoot(num);
//         System.out.println("Square root is: "+store);
//     }
// }


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





// //....array, efficiently count the total number of 1’s in it..

// class Binary {
//     static int oneOccurence(int[] ar, int low, int high) {
//         while(low <= high) {
//             int mid = low + (high-low) / 2;
//             if(ar[mid] == 1) {
//                 high = mid-1;
//             }
//             else if(ar[mid] == 0) {
//                 low = mid+1;
//             }
//         }
//         return (ar.length-low);
//     }
//     public static void main(String[] args) {
//         int[] arr = {0,0,0,0,1,1};
//         int n = oneOccurence(arr, 0, arr.length-1);
//         System.out.println("n: "+n);
//     }
// }






// //....array containing duplicates, count occurrences of a given number...........

// class Binary {
//     static int firstOccure(int[] ar, int target) {                    //...find first occurence
//         int low = 0, high = ar.length-1, firstOccurance = -1;
//         while(low <= high) {
//             int mid = low + (high-low) / 2;
//             if(ar[mid] == target) {
//                 firstOccurance = mid;
//                 high = mid-1;
//             }
//             else if(ar[mid] < target) {
//                 low = mid+1;
//             }
//             else {
//                 high = mid-1;
//             }            
//         }
//         return firstOccurance;
//     }

//     static int lastOccure(int[] ar, int target) {                     //...find last occurence
//         int low = 0, high = ar.length-1, lastOccurance = -1;
//         while(low <= high) {
//             int mid = low + (high-low) / 2;
//             if(ar[mid] == target) {
//                 lastOccurance = mid;
//                 low = mid+1;
//             }
//             else if(ar[mid] < target) {
//                 low = mid+1;
//             }
//             else {
//                 high = mid-1;
//             }            
//         }
//         return lastOccurance;
//     }



//     public static void main(String[] args) {
//         int[] arr = {2, 6, 6, 8, 9, 9, 9};
//         int target = 9;                              //Target 5 occurs 3 times
//         int fn = firstOccure(arr, target);    
//         int ln = lastOccure(arr, target);

//         int total = ln-fn+1;

//         if(ln == -1 && fn == -1)  
//             System.out.println("target does't exist");
//         else 
//             System.out.println("Target "+target+" occurs "+total+" times");
//     }
// }





// //.....return true if num is a perfect square or false otherwise.....

// class Binary {
//     static boolean checkSquare(int n) {
//         int low = 0, high = n;
//         while(low <= high) {
//             int mid = low + (high-low) / 2;
//             if(mid*mid == n)
//                 return true;
//             else if(mid*mid < n) 
//                 low = mid+1;
//             else
//                 high = mid-1;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int num = 1;
//         boolean bool = checkSquare(num);
//         System.out.println(bool);
//     }
// }





// //..... Minimum Difference element is an array............

// import java.util.*;
// class Binary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("How much element: ");
//         int n = sc.nextInt();
//         System.out.println("Enter element: ");
//         int[] ele = new int[n];

//         for (int i = 0; i < ele.length; i++) {
//             ele[i] = sc.nextInt();
//         }
        
//         System.out.println("Enter key element: ");
//         int key = sc.nextInt();
//         int val = mini_Difference(ele, key);        
//         System.out.println("Minimum difference with:"+val);
//     }

//     static int mini_Difference(int[] arr, int k) {
//         int low = 0;
//         int high = arr.length-1;
//         while (low <= high) {
//             int mid = low + (high-low)/2;

//             if(arr[mid] == k)   return arr[mid];
//             else if(arr[mid] < k)     low =mid+1;
//             else    high = mid-1;
//         }                                              //..got neighboring element......

//         int diff1 = Math.abs(arr[low] - k);
//         int diff2 = Math.abs(arr[high] - k);

//         if(diff1 < diff2) {
//             return arr[low];
//         }
//         return arr[high];
//     }
// }




// // binary search by recursion............

// class Binary {
//     static int binarySearch(int[] arr, int k, int lo, int high) {
//             // if (lo>high)
//             //     return -1;
//             // int mid = lo+(high-lo)/2;
//             // if(arr[mid]==k)
//             //     return mid;
//             // else if(arr[mid] < k)
//             //     return binarySearch(arr, k, mid+1, high);
//             // else 
//             //     return binarySearch(arr, k, lo, mid-1);
        
//         // this not recursion.......    
//             while(lo<=high) {
//                 int mid = lo + (high-lo)/2;
//                 if(arr[mid] == k)
//                     return 1;
//                 if(arr[mid] < k)
//                     return binarySearch(arr, k, mid+1, high);
//                 else
//                     return binarySearch(arr, k, lo, mid-1);
//             }
//         return 0;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,5,9,12,33,77,120};
//         int k = 91;
//         int high = arr.length-1;
//         int ind = binarySearch(arr, k, 0, high);
//         System.out.println("Index: "+ind);
//     }
// }