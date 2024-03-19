// import java.util.Arrays;

// public class SelectionSort {
//     static void selectionSort(int[] arr) {
//         for(int i=0; i<arr.length-1; i++) {
//             int minIndex = i;
//             for (int j=i+1; j<arr.length; j++) {
//                 if(arr[minIndex] > arr[j]) {
//                     minIndex = j;
//                 }
//             }
//             int temp = arr[i];
//             arr[i] = arr[minIndex];
//             arr[minIndex] = temp;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {3,7,1,9,2,5};
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         selectionSort(arr);
//         System.out.println();

//         // for (int i=0; i<arr.length; i++) {
//             System.out.print(Arrays.toString(arr));
//         // }
//     }
// }







//  for better efficincy................
// public class SelectionSort {
//     public static void main(String[] args) {
//         int[] arr = {32,44,111,16,0};
//         int pass = -1;
//         for (int i = 0; i < arr.length; i++) {
//             int maxInd = i;
//             boolean check = false;
//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[maxInd] < arr[j]) {
//                     maxInd = j;
//                     check = true;
//                     pass++;
//                 }
//             }
//             if(check == false) {
//                 break;
//             }
//             int temp = arr[maxInd];
//             arr[maxInd] = arr[i];
//             arr[i] = temp;
//             System.out.println(i+1 + ".. iteration");
//             for(int k=0; k<arr.length; k++) {               //...in every iteration array is...
//                 System.out.print(arr[k]+" ");            
//             }
//             System.out.println();
//         }
//         System.out.print("Total number of iteration: "+pass);

        


//         //  for (int i = 0; i < arr.length; i++) {
//         //     System.out.print(arr[i]+" ");
//         // }
//     }
// }






// sort string in lexicografical order.............

class SelectionSort{
    static void sort_name(String[] name) {
        int n = name.length;
        for (int i = 0; i < n; i++) { 
            int min = i;
            for(int j=i+1; j<n; j++) {
                if(name[j].compareTo(name[min]) < 0){
                    min = j;
                }
            }
            if(min != i){                           // efficincy...
                String temp = name[min];
                name[min] = name[i];
                name[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(name[i]+" ");
        }
            
        }

    public static void main(String[] args) {
        String[] name = {"omkar", "kamal", "apple", "zebra", "inquisitive", "curious"};
        // int[] name = {2,62,1,33,0,3};
        sort_name(name);
    }
}