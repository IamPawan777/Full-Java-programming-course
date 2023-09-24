// //......linear searching.......

// import java.util.Scanner;

// public class Linear {
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

//         int index = linearSearch(arr, key);
//         String result = (index != -1) ? "Element present at index: "+index : "Element not present.";
//         System.out.println(result);
//     }

//     static int linearSearch(int[] arr, int k) {
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == k) {
//                 return i;                               //....here return means automatically break.....
//             }
//         }
//         return -1;
//     }
// }





//.......index of last occurence of element......

class Linear {
    static int lastOccurence(int[] arr, int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                index = i;
            }
        }
        return index;
    } 
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,2,4,5,3};            //6th
        int target = 4;

        int index = lastOccurence(arr, target);
        System.out.println(target + " last occurence is: "+index);
    }
}