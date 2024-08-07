import java.util.Scanner;
// //...total number of pairs in the array whose sum is equal to the given value target....
// // Ex: arr=4,6,3,5,8,2  target=7  pairs=2 ((4,3),(5,2))

// class MathsQue2 {
//     static int findPair(int[] a, int t) {
//         int count = 0;
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i+1; j < a.length; j++) {
//                 if(a[i]+a[j] == t) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Size of array: ");
//        int n = scan.nextInt();
//        int arr[] = new int[n];
//        System.out.println("Enter elements: ");
//        for(int i=0; i<arr.length; i++) {
//             arr[i] = scan.nextInt();
//        }

//        System.out.println("Enter target: ");
//        int target = scan.nextInt();

//        int pair = findPair(arr, target);
//        System.out.println("total pairs are: "+pair);
//     }
// }





// //...count number of triples whose sum is equal to the given value x....
// // Ex: arr=1,4,5,6,3  x=12  triples=2 ((1,5,6),(4,5,3))

// class MathsQue2 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter size of array: ");
//         int n = scan.nextInt();

//         int[] ar = new int[n];
//         System.out.println("Enter element: ");
//         for (int i = 0; i < ar.length; i++) {
//             ar[i] = scan.nextInt();
//         }

//         System.out.println("Enter target: ");
//         int target = scan.nextInt();

//         int triples=0;
//         for (int i = 0; i < ar.length; i++) {       //1st number
//             for (int j = i+1; j < ar.length; j++) {         //2nd number
//                 for (int k = j+1; k < ar.length; k++) {         //3rd number
//                     if(ar[i]+ar[j]+ar[k] == target)
//                     triples++;
//                 }
//             }
//         }
//         System.out.println("Triples are: "+triples);
//     }
// }







// // .....(array manipulation)return unique value in given array (all are positive or 0).....
// /*
//  * problems 
//  * 1.if element come 3 times(odd times)
//  * 2.
//  */

// class MathsQue2 {
//     static int[] unique_Val(int[] a) {
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i+1; j < a.length; j++) {
//                 if(a[i]==a[j]){
//                     a[i] = -1;          //pair strike off
//                     a[j] = -1;          //pair strike off
//                 }
//             }
//         }

//         int ans[] = new int[a.length];
//         int ind = 0;
//         for (int i = 0; i < ans.length; i++) {            //again traverse
//             if(a[i] == -1) continue;                //becase I want unique element are print from 0th index otherwise print on same location
//             if(a[i]>-1){
//                 ans[ind]= a[i];
//             }
//             ind++;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter size: ");
//         int n = scan.nextInt();

//         int[] ar = new int[n];
//         System.out.println("Enter element: ");
//         for (int i = 0; i < ar.length; i++) {
//             ar[i]=scan.nextInt();
//         }         

//         System.out.println("unique values are: ");
//         int[] store = unique_Val(ar);           //call array
//         for (int i = 0; i < store.length; i++) { 
//             System.out.print(store[i]+" ");            
//         }
//     }
// }





// //.......maximam element in array......

// class MathsQue2 {
//     static int maxValue(int[] a) {
//         int max = Integer.MIN_VALUE;                // -ve infinite
//         for (int i = 0; i < a.length; i++) {
//             if(a[i]>max) {
//                 max = a[i];
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("size: ");
//         int n = scan.nextInt();

//         System.out.println("enter element: ");
//         int[] ar = new int[n];
//         for (int i = 0; i < ar.length; i++) {
//             ar[i] = scan.nextInt();
//         }

//         int m = maxValue(ar);
//         System.out.println("max value: "+m);
//     }
// }







//.......second maximam element in array......

// class MathsQue2 {
    //     static int maxValue(int[] a) {
        //         int max = Integer.MIN_VALUE;                // -ve infinite
        //         for (int i = 0; i < a.length; i++) {
//             if(a[i]>max) {
//                 max = a[i];
//             }
//         }
//         return max;
//     }

//     static int secondMaxValue(int []ar) {
    //         int mx = maxValue(ar);               //max value comes here now
    //         for (int i = 0; i < ar.length; i++) {
//             if(ar[i] == mx) {
//                 ar[i] =Integer.MIN_VALUE;
//             }
//         }
//         int secondMax = maxValue(ar);            //again cal
//         return secondMax;
//     }
//     public static void main(String[] args) {
    //         Scanner scan = new Scanner(System.in);
//         System.out.println("size: ");
//         int n = scan.nextInt();

//         System.out.println("enter element: ");
//         int[] ar = new int[n];
//         for (int i = 0; i < ar.length; i++) {
    //             ar[i] = scan.nextInt();
    //         }
    
    //         int m = secondMaxValue(ar);
    //         System.out.println("2nd max value: "+m);
    //         scan.close();
    //     }
// }






// //.......minimum element in array......

// class MathsQue2 {
//     static int returnMin(int[] a) {
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < a.length; i++) {
//             if(a[i]<min)
//             min = a[i];
//         }
//         return min;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("size: ");
//         int n = scan.nextInt();

//         System.out.println("enter element: ");
//         int[] ar = new int[n];
//         for (int i = 0; i < ar.length; i++) {
//             ar[i] = scan.nextInt();
//         }

//         int min = returnMin(ar);
//         System.out.println("minimul element: "+min);
//     }
// }







//....second minimal element in an array...

// class MathsQue2 {
//     static int max(int[] a) {
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < a.length; i++) {
//             if(a[i]<min) {
//                 min = a[i];
//             }
//         }
//         return min;
//     }

//     static int secondMin(int[] a) {
//         int min = max(a);
//         for (int i = 0; i < a.length; i++) {
//             if(a[i] == min) {
//                 a[i] = Integer.MAX_VALUE;
//             }
//         }
//         int secondMin = max(a);
//         return secondMin;

//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("enter size: ");
//         int n = scan.nextInt();

//         int[] arr = new int[n];
//         System.out.println("insert: ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();
//         }

//         System.out.println("2nd min: "+secondMin(arr));
//     }
// }







// //.......1st repeting value.........

// class MathsQue2 {
//     static int repetingVal(int[] a) {
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i+1; j < a.length; j++) {
//                 if(a[i]==a[j]){
//                     return a[i];        // if 1st repeating value match then return...further iteration will not work 
//                 }
//             }
//         }
//         return -1;          //if there will be no repeated value;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("size: ");
//         int n = scan.nextInt();

//         System.out.println("enter element: ");
//         int[] ar = new int[n];
//         for (int i = 0; i < ar.length; i++) {
//             ar[i] = scan.nextInt();
//         }

//         System.out.println("1st repeting value: "+repetingVal(ar));
        
//     }
// }






// // /.......last repeting value.........

// class MathsQue2 {
//     static int repetingVal(int[] a) {
//         int rep = -1;
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i+1; j < a.length; j++) {
//                 if(a[i]==a[j]){
//                     rep = a[i];
//                 }
//             }
//         }
//         return rep;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("size: ");
//         int n = scan.nextInt();

//         System.out.println("enter element: ");
//         int[] ar = new int[n];
//         for (int i = 0; i < ar.length; i++) {
//             ar[i] = scan.nextInt();
//         }

//         System.out.println("last repeting value: "+repetingVal(ar));
        
//     }
// }






// //......predict whether it is a power of two or not.....

// class MathsQue2 {
//     static int changeToBinary(int n) {                  //change to binary
//         int pow=1;
//         int ans = 0;
//         while(n>0) {
//             int rem = n%2;
//             ans = ans+rem*pow;
//             n = n/2;
//             pow = pow*10;
//         }
//         return ans;
//     }
//     static boolean check2Power(int n) {                 //...more then 1 '1' false... || ...if one '1' true i.e. 2 power ...
//         int ans = changeToBinary(n);

//         String str = String.valueOf(ans);
//         int count=0;
//         for(int i=0; i<str.length(); i++) {
//             if(str.charAt(i) == '1') {
//                 count++;
//             }
//         }
//         if(count == 1) {
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int n = 64;
//         System.out.println(check2Power(n));
//     }
// }






// //...odd or even number cheack.....by bit manupulation.

// class MathsQue2 {
//     static void checkOddEven(int n) {
//         // if(n%2 == 0) {
//         //     System.out.println("Even no");
//         // }
//         // else
//         //     System.out.println("Odd no");
//         if((n&1) == 1) {                       //(check unit digit)0011 & 0001 = 0001      
//             System.out.println("Odd no");
//         }
//         else
//             System.out.println("even no");
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         checkOddEven(n);
//     }
// }




// (number of 1's is binary fome) count the number of set bits in that number without using an extra space.

// public class MathsQue2
// {   public static int countSetBits(int n){
//         int count = 0;
//         while (n > 0) {
//             count += n & 1;
//             n = n>>1;
//         }
//         return count;
//     }
// 	public static void main(String[] args) {
// 		 int number = 15;
//         int answer = countSetBits(number);
//         System.out.println("The number of set bits are: " + answer);
// 	}
// }




//.....target element first and last occurence in an array....
// //..........O(n).......
// import java.util.Scanner;

// public class MathsQue2  {
// 	public static void main(String[] args) {
// 		int[] arr = {5, 7, 7, 8, 8, 10};
//         int target = 87;

//         int[] ar = new int[]{-1,-1};
//         int ind = 0;

//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] == target)
//                 ar[ind++] = i;
//         }

//         for (int i = 0; i < ar.length; i++) {
//             System.out.print(ar[i]+" ");
//         }
// 	}
// }

// //..........O(log(n)).......
// import java.util.Scanner;

// public class MathsQue2  {
    
//     public static int[] occurence(int[] ar, int target) {
//         int[] arr = new int[]{-1,-1};
//         int low = 0, high = ar.length-1;
//         int ans = 0;
//         while(low<=high) {
//             int mid = low + (high-low)/2;
//             if(ar[mid] == target){
//                 ans = mid;
//                 high = mid-1;
//             }
//             else if(ar[mid] > target)
//                 high = mid-1;
//             else
//                 low = mid+1;
//         }
//         arr[0] = ans;


//         low = 0;
//         high = ar.length-1;
//         while(low<=high) {
//             int mid = low + (high-low)/2;
//             if(ar[mid] == target){
//                 ans = mid;
//                 low = mid+1;
//             }
//             else if(ar[mid] > target)
//                 high = mid-1;
//             else
//                 low = mid+1;
//         }
//         arr[1] = ans;
//         return arr;
//     }
// 	public static void main(String[] args) {
// 		int[] arr = {5, 7, 7, 8, 8, 10};
//         int target = 8;

//         int[] ar = occurence(arr, target);

//         for(int i=0; i<ar.length; i++) {
//             System.out.print(ar[i]+" ");
//         }

// 	}
// }








// ///.........palindromic array or not......O(log n)....

// class MathsQue2 {
//     static boolean checkArr(int[] arr) {
//         int low = 0;
//         int high = arr.length-1;

//         while(low<=high) {
//             if(arr[low] == arr[high]){
//                 low++;
//                 high--;
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2,3,4,6,4,3,2};

//         boolean ch =  checkArr(arr);
//         System.out.println(ch);
//     }
// }



// //........palimdrom number or not.....(reversal of num)...

// class MathsQue2 {
//     static boolean check(int num) {
//         int store = num;
//         int sum = 0;
//         while(num!=0) {
//             int rem = num%10;
//             sum = sum*10 + rem;
//             num /= 10;
//         }
//         if(store == sum){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter num: ");
//         int num = sc.nextInt();
//         System.out.println(check(num));
//     }
// }




// //...........missing number............

// class MathsQue2 {
//     static int checkNo(int[] arr){
//         int sum = 0;
//         int highest = 0;
//         for (int i=0; i<arr.length; i++) {
//             sum += arr[i];
//             if(highest < arr[i]){
//                 highest = arr[i];
//             }
//         }
//         int sumNN = (highest*(highest+1))/2;                // sum of natural number.
//         int miss = sumNN-sum;
//         return miss ;
//     }
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4, 6};
//         System.out.println(checkNo(arr));
//     }
// }




// maxima and minima element in an arr............
// class Demo {
class MathsQue2 {
    static class Pair{
        int min;
        int max;
    }
    public static Pair getMinMax(int[] arr, int i, int j) {
        Pair min_max = new Pair();
        Pair mmL = new Pair();
        Pair mmR = new Pair();
        // base case
        if(i==j) {
            min_max.min = arr[i];
            min_max.max = arr[j];
            return min_max;
        }
        else if (i==j-1) {
            if(arr[i]<arr[j]){
                min_max.min = arr[i];
                min_max.max = arr[j];
            }
            else {
                min_max.min = arr[j];
                min_max.max = arr[i];
            }
            return min_max;
        }
        //big problem..divide
        else {
            int mid = i+(j-i)/2;
            mmL = getMinMax(arr, i, mid);                   // left side
            mmR = getMinMax(arr, mid+1, j);                 // right side
            if(mmL.min < mmR.min)                           // combine from l and r... min
                min_max.min = mmL.min;
            else
                min_max.min = mmR.min;
            if(mmL.max < mmR.max)                       //max
                min_max.max = mmR.max;
            else
                min_max.max = mmL.max;
            return min_max; 
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,7,12,99,2,1,34,12};
        Pair min_max = getMinMax(arr, 0, arr.length-1);
        System.out.println("Mininum: "+min_max.min);
        System.out.println("Maximum: "+min_max.max);
    }
}