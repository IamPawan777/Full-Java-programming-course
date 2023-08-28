import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of element: ");
        int n =  scan.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter searching element: ");
        int key = scan.nextInt();

        int index = linearSearch(arr, key);
        String result = (index != -1) ? "Element present at index: "+index : "Element not present.";
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                return i;                               //....here return means automatically break.....
            }
        }
        return -1;
    }
}
