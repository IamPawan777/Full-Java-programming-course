// public class MergeSort {
//     static void disp(int[] arr, int n) {
//         for (int i = 0; i <= n; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     static void merge(int[] arr, int st, int mid, int en) {
//         int[] temp = new int[en-st+1];
//         int l = st, r = mid+1, ind = 0;
//         while (l<=mid && r<=en) {
//             if(arr[l] <= arr[r])
//                 temp[ind++] = arr[l++];
//             else
//                 temp[ind++] = arr[r++];
//         }
//         while(l<=mid) {
//             temp[ind++] = arr[l++];
//         }
//         while(r<=en) {
//             temp[ind++] = arr[r++];
//         }

//         int i=0;
//         while (st<=en) {
//             arr[st++] = temp[i++];
//         }
//     }
//     static void merge_sort(int[] arr, int st, int en) {
//         if(st==en)    return;
//         int mid = st + (en-st)/2;
//         merge_sort(arr, st, mid);
//         merge_sort(arr, mid+1, en);
//         merge(arr, st, mid, en);
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,2,9,6,1,9,5,34,2};
//         int n = arr.length-1;
//         disp(arr, n);
//         merge_sort(arr, 0, n);
//         disp(arr, n);
//     }
// }








// // almort sort array apart from any 2 element........
// class MergeSort {
//     static void disp(int[]arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     static void sortArr(int[] arr) {
//         int x = -1; 
//         int y = -1;
//         for (int i = 1; i < arr.length; i++) {
//             if(arr[i-1] > arr[i]){
//                 if(x == -1){
//                     x = i-1;
//                 }
//                 y =  i;
//             }
//         }
//             int temp = arr[x];
//             arr[x] = arr[y];
//             arr[y] = temp;
//     }
//     public static void main(String[] args) {
//         int[] arr = {10,20,60,40,50,30,70,80};
//         disp(arr);
//         sortArr(arr);
//         disp(arr);
//     }
// }





//  negative numbers, followed by positive numbers.....order also preserved

// class MergeSort {
//     static void partition(int[] a, int l, int r, int[] temp) {
//         if(l==r)    return;
//         int mid = l + (r-l)/2;
//         partition(a, l, mid, temp);
//         partition(a, mid+1, r, temp);
//         merge(a, l, mid, r, temp);
//     }
//     static void merge(int[] a, int l, int m, int r, int[] t) {
//         int k=l;
//         for (int i = l; i <= m; i++) {
//             if(a[i]<0)  t[k++] = a[i];
//         }
//         for (int i = m+1; i <= r; i++) {
//             if(a[i]<0)  t[k++] = a[i];
//         }
//         for (int i = l; i <= m; i++) {
//             if(a[i]>0)  t[k++] = a[i];
//         }
//         for (int i = m+1; i <= r; i++) {
//             if(a[i]>0)  t[k++] = a[i];
//         }
//     }
//     static void disp(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};
//         int n = arr.length;
//         int[] temp = new int[n];
//         partition(arr, 0, n-1, temp);
//         disp(temp);
//     }
// }






// import java.util.*;

// class MergeSort{
//     static boolean isPossible(Integer a[], int b[], int n, int k){
//     	// Sort the array a[] in decreasing order.
//     	Arrays.sort(a, Collections.reverseOrder());
    
//     	// Sort the array b[] in increasing order.
//     	Arrays.sort(b);
    
//     	// Checking condition on each index.
//     	for (int i = 0; i < n; i++)
//     	if (a[i] + b[i] < k)
//     		return false;
    
//     	return true;
//     }
//     public static void main(String[] args) {
//     	Integer a[] = {2, 1, 3, 5, 1};
//     	int b[] = {7, 8, 9 , 2 , 6};
//     	int k = 10;
//     	int n = a.length;
    
//     	if (isPossible(a, b, n, k))
//     	System.out.print("Yes");
//     	else
//     	System.out.print("No");
//     }
// }
