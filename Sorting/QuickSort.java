// public class QuickSort {
//     static int patition(int[] arr, int l, int r) {
//         int pos = l;                        // stating pointer
//         int pivot = arr[r];                 //  we choose the last element as a pivot
//         for(int i=l; i<=r; i++) {           // here we only smaller then pivat element put into left side automatically larger comes to right side
//             if(arr[i] <= pivot) {
//                 int temp = arr[i];
//                 arr[i] = arr[pos];
//                 arr[pos] = temp;
//                 pos++;
//             }
//         }
//         return pos-1;
//     }
//     static void quick_sort(int[] arr, int l, int r) {
//         if(l>=r)    return;
//         int pivot = patition(arr, l, r);
//         quick_sort(arr, l, pivot-1);
//         quick_sort(arr, pivot+1, r);
//     }
//     static void disp(int[] arr) {
//         for (int i = 0; i < arr.length; i++)
//             System.out.print(arr[i]+" ");
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,4,3,2,1};
//         disp(arr);
//         quick_sort(arr, 0, arr.length-1);
//         disp(arr);

//     }
// }




// // kth smallest element..............

// class QuickSort {
//     static int partition(int[] arr, int st, int end) {
//         int pivot = arr[end];
//         int posi = st;
//         for (int i = st; i <= end; i++) {
//             if(pivot >= arr[i]) {
//                 int temp = arr[i];
//                 arr[i] = arr[posi];
//                 arr[posi] = temp;
//                 posi++;
//             }
//         }
//         return posi-1;
//     }

//     static int kthElement(int[] arr, int k, int l, int r){
//         int pivot = partition(arr,l, r);
        
//         if(pivot == k-1){
//             return arr[pivot];
//         }
//         else if(pivot < k-1){
//             return kthElement(arr, k, pivot+1, r);
//         }
//         else{
//             return kthElement(arr, k, l, pivot-1);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {7, 10, 4, 3, 20, 15};
//         int k = 4;
//         System.out.println(kthElement(arr, k, 0, arr.length-1));
//     }
// }




// //  negative numbers, followed by positive numbers.....order not preserved

// class QuickSort{
//     static void partition(int[] arr, int l, int r) {
//         int pivot = 0;
//         int posi = l;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i]<pivot) {
//                 int temp = arr[i];
//                 arr[i] = arr[posi];
//                 arr[posi] = temp;
//                 posi++;
//             }
//         }
//     }

//     static void disp(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
//         disp(arr);
//         partition(arr,0,arr.length-1);
//         disp(arr);
//     }
// }





//  negative numbers, followed by positive numbers.....order not preserved
