public class QuickSort {
    static int patition(int[] arr, int l, int r) {
        int pos = l;                        // stating pointer
        int pivot = arr[r];                 //  we choose the last element as a pivot
        for(int i=l; i<=r; i++) {           // here we only smaller then pivat element put into left side automatically larger comes to right side
            if(arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
        return pos-1;
    }
    static void quick_sort(int[] arr, int l, int r) {
        if(l>=r)    return;
        int pivot = patition(arr, l, r);
        quick_sort(arr, l, pivot-1);
        quick_sort(arr, pivot+1, r);
    }
    static void disp(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        disp(arr);
        quick_sort(arr, 0, arr.length-1);
        disp(arr);

    }
}
