public class MergeSort {
    static void disp(int[] arr, int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void merge(int[] arr, int st, int mid, int en) {
        int[] temp = new int[en-st+1];
        int l = st, r = mid+1, ind = 0;
        while (l<=mid && r<=en) {
            if(arr[l] <= arr[r])
                temp[ind++] = arr[l++];
            else
                temp[ind++] = arr[r++];
        }
        while(l<=mid) {
            temp[ind++] = arr[l++];
        }
        while(r<=en) {
            temp[ind++] = arr[r++];
        }

        int i=0;
        while (st<=en) {
            arr[st++] = temp[i++];
        }
    }
    static void merge_sort(int[] arr, int st, int en) {
        if(st==en)    return;
        int mid = st + (en-st)/2;
        merge_sort(arr, st, mid);
        merge_sort(arr, mid+1, en);
        merge(arr, st, mid, en);
    }
    public static void main(String[] args) {
        int[] arr = {5,2,9,6,1,9,5,34,2};
        int n = arr.length-1;
        disp(arr, n);
        merge_sort(arr, 0, n);
        disp(arr, n);
    }
}
