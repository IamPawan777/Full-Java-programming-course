class Binary {
    static int binarySearch(int[] arr, int k, int lo, int high) {
        if (lo>high)
            return -1;
        
            int mid = lo+(high-lo)/2;
        if(arr[mid]==k)
            return mid;
        else if(arr[mid] < k)
            return binarySearch(arr, k, mid+1, high);
        else 
            return binarySearch(arr, k, lo, mid-1);
    }
    public static void main(String[] args) {
        int[] arr = {2,5,9,12,33,77,120};
        int k = 77;
        int high = arr.length-1;
        int ind = binarySearch(arr, k, 0, high);
        System.out.println("Index: "+ind);
    }
}