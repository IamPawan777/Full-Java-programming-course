public class countSort {
    
    static int maxi(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static void countFun(int[] arr) {
        int max = maxi(arr);
        int[] freqArr = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freqArr[arr[i]]++; 
        }

        int k = 0;
        for (int i = 0; i < freqArr.length; i++) {
            for (int j = 0; j < freqArr[i]; j++) {
                arr[k++] =  i; 
            }
        }
    }

    static void disp(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4,8,11,2,45,2,8};
        disp(arr);
        countFun(arr);
        disp(arr);
    }
    
}
