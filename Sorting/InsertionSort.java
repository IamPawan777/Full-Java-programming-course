//...insertion sort.....

import java.util.*;

public class InsertionSort {

    static void insertSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int temp = ar[i];       //..pic the 1st no on unsorted array..
            int j = i-1;            //..0th position
            while(j>=0 && ar[j] > temp) {           //..1st condition is not go for -1th index
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = temp;                 //..finally if j=-1 then on 'j=0' 'temp' value inserted
        }
    }


     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Total element: ");
        int n = scan.nextInt();
        
        System.out.println("Enter element: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {              //..unsorted array..
            System.out.print(arr[i]+" ");
        }

        insertSort(arr);                            //...sorting algo...
        System.out.println();

        for (int i = 0; i < arr.length; i++) {             //..sorted array..
            System.out.print(arr[i]+" ");
        }
    }
}