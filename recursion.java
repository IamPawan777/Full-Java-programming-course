// .... Even number print.............

// import java.util.*;
// public class recursion {
//     static void fun(int a) {
//         if(a==0) {
//             System.out.print(a);
//             return;
//         }   
//         if(a%2==0)
//             System.out.print(a+" ");
//         fun(a-1);                           // or fun(a-2) without if(a%2 == 0)
//     }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int a = scn.nextInt();
//         fun(a);
//     }
// }

//.................or.................

// import java.util.*;
// public class recursion {
//     static void fun(int a, int N) {
//         if(a==N) {
//             System.out.print(a);
//             return;
//         }   
//         if(a%2==0)
//             System.out.print(a+" ");
//         fun(a+1, N);                           // or fun(a-2) without if(a%2 == 0)
//     }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int N = scn.nextInt();
//         fun(0, N);
//     }
// }


//...............OR...................

// import java.util.*;
// public class recursion {
//     static void fun(int n) {
//         if(n==0){
//             System.out.print(n+" ");
//             return;
//         }
//         fun(n-1);
//         if(n%2==0) {
//             System.out.print(n+" ");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         fun(n);
//     }
// }





//....factorial.............

// public class recursion {
//     static int fct(int n){
//         if(n==1)
//             return 1;
//         return n*fct(n-1);

//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fct(n));
//     }
// }




// //  power of 2^5...........
// public class recursion{
//     static int  fun(int n, int N){
//         if(N==0)    return 1;       // 1
//         // if(N==1)    return n;       // 2
//         return n*fun(2,N-1);
//     }
//     public static void main(String[] args) {
//         int ra = 5;
//         System.out.println(fun(2, ra));
//     }
// }




// //..... sum of squre of N number....(4^2 + 2^2 + 2^2 + 1^2 +...)

// public class recursion{
//     static int  fun(int N){
//         if(N==1)    return 1;       // 1
        
//         return N*N + fun(N-1);
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println(fun(n));
//     }
// }




// // fibonacci series.............

// public class recursion{
//     static int  fun(int n){
//         int ans = 0;
//         if(n==0 || n==1)
//             return n;
//         else {
//             ans = fun(n-1)+fun(n-2);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fun(n));
//     }
// }





// // sum of digits.............

// public class recursion{
//     static int  fun(int n){
//         int ans = 0;
//         if(n>=0 && n<=10)
//             return n;
//         else {
//             ans = fun(n/10);
//         }
//         return ans+n%10;
//     }
//     public static void main(String[] args) {
//         int n = 1234;
//         System.out.println(fun(n));
//     }
// }




// // // count of digits.............

// public class recursion{
//     static int  fun(int n){
//         if(n==0)
//             return n;
//         else 
//             return 1 + fun(n/10);
//     }
//     public static void main(String[] args) {
//         int n = 2007899;
//         System.out.println(fun(n));
//     }
// }




// // // sum of number but alternate sign.............

// public class recursion{
//     static int  fun(int n){
//         if(n==0){            
//             return 0;
//         }
//         if(n%2 == 0){                       // even
//             return -n + fun(n-1);
//         }
//         return n + fun(n-1);                // odd

//     }
//     public static void main(String[] args) {
//         int n = 6;
//         System.out.println(fun(n));
//     }
// }




// ...Array.........................................................................




// //..print array element............

// class recursion{
//     static void print_arr(int[] arr, int n) {
//         if (n==0) {
//             System.out.println(arr[n]);
//             return;
//         }
//         print_arr(arr, n-1);
//         System.err.println(arr[n]);
//     }
//     public static void main(String[] args) {
//         int[] arr = {3,5,6,8,9,2,222,3};
//         print_arr(arr, arr.length-1);
//     }
// }





// // print largest number.............

// public class recursion{
//     static int  fun(int[] arr, int i){
//         int n = arr.length;
//         if(i==n-1)
//             return arr[i];
//         int val = fun(arr, i+1);
//         return Math.max(arr[i], val);
//     }
//     public static void main(String[] args) {
//         int n[] = {3,7,11,99,23,1,3};
//         System.out.println(fun(n, 0));
//     }
// }





// // print sum of numbers in an array.............

// public class recursion{
//     static int fun(int[] arr, int i){
//         if(i==0)
//             return arr[i];
//         return arr[i] + fun(arr, i-1);
//     }
//     public static void main(String[] args) {
//         int n[] = {1,2,3,4,5};
//         System.out.println(fun(n, n.length-1));
//     }
// }




// //*********  print table of numbers.............

// public class recursion{
//     static void fun(int n, int k){
//         if(k==1){
//             System.out.println(n);
//             return;
//         }
//         fun(n, k-1);
//         System.out.println(n*k);
//     }
//     public static void main(String[] args) {
    
//         fun(12, 5);
//     }
// }






// // ......cheack prime no or not
// public class recursion{
//     static void primeCh(int n, int i){
//         if(i==1) {
//             System.out.println("Yes.. prime No "+i);
//             return;
//         }
//         if(n%i == 0){
//             System.out.println("No.. not a prime No "+i);
//             return;
//         }    
//         primeCh(n, i-1);
//     }
//     public static void main(String[] args) {
//         int n = 103;
//         primeCh(n, n-1);
//     }
// }






// // // Linear Search.............

// public class recursion{
//     static int fun(int[]arr, int key, int i){
//     // first occurence...........
//         if(i==arr.length)
//             return -1;
//         if(arr[i] == key)
//             return i;
//         return fun(arr, key, i+1);
//     // last occurence.................
//         // if(i == -1)             
//         //     return i;
//         // if(arr[i] == key)
//         //     return i;
//         // return fun(arr, key, i-1);
//         // System.out.println(i);
//     }
//     public static void main(String[] args) {    
//         int[] arr = {2,6,1,76,3,6,2};
//         int key = 6;
//         int ind = fun(arr,key, 0);
//         System.out.println(key+" present at index: "+ind);
//     }
// }





// // // Linear Search print all index.............

// public class recursion{
//     static void fun(int[]arr, int key, int i){

//         if(i==arr.length)
//             return ;
//         if(arr[i] == key)
//             System.out.print(i+" ");
//         fun(arr, key, i+1);
//     }
//     public static void main(String[] args) {    
//         int[] arr = {2,6,1,76,3,6,2};
//         int key = 6;
//         fun(arr,key, 0);
//     }
// }







// //  Linear Search print all index by ArrayList.............

// import java.util.ArrayList;

// public class recursion{
//     static ArrayList<Integer> fun(int[]arr, int key, int i){
//         ArrayList<Integer> ans = new ArrayList<>();
//         if(arr.length<=i)
//             return new ArrayList<>();           // nothing found or went ahead
//         if(arr[i] == key)           // only 1st occurence
//             ans.add(i);
//         ArrayList<Integer> remain = fun(arr, key, i+1); 
//         ans.addAll(remain);
//         return ans;
//     }
//     public static void main(String[] args) {    
//         int[] arr = {2,6,1,6,3,6,2};
//         int key = 6;
//         System.out.println("Index: "+fun(arr,key, 0));
//     }
// }




// // array sorted or not linear search 
// class recursion {
//     static boolean sortFun(int[] arr, int i) {
//         if(i == arr.length)
//             return true;    
//         if(arr[i] < arr[i-1])
//             return false;
//         return sortFun(arr, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,3,5,7,9,10,11,12,13};
//         boolean ch = sortFun(arr, 1);
//         System.out.println(ch);
//     }
// }



// //....binary Search.............

public class recursion{
    static boolean fun(int[]arr, int key, int low, int high){
            if(low>high)
                return false;
        // while(low<=high) {
            
            int mid = low + (high-low)/2;
            if(arr[mid] == key)
                return true;
            if(arr[mid] < key)
                return fun(arr, key, mid+1, high);
            else
                return fun(arr, key, low, mid-1);
        // }
    // return false;
    }
    public static void main(String[] args) {    
        int[] arr = {2,6,1,76,3,6,2};
        int key = 6;
        boolean ind = fun(arr,key, 0, arr.length-1);
        System.out.println(key+" present at index: "+ind);
    }
}




//........string..............

// // // count vowels in string.............
// class recursion {
//     static boolean is_vowel(String s, int n) {
//         if(s.charAt(n)=='a' || s.charAt(n)=='e' || s.charAt(n)=='i' || s.charAt(n)=='o' || s.charAt(n)=='u')
//             return true;
//         return false;
//     }
//     //...recursion.......
//     static int check_vowel(String s, int n) {
//         if(n==-1)    return 0;
//         if(is_vowel(s,n) == true) {
//             return 1+check_vowel(s, n-1);
//         }
//         else {
//             return check_vowel(s, n-1);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "iPawanBisht";
//         int val = check_vowel(str, str.length()-1);
//         System.out.println(val);
//     }
// }





// // reverse string........O(n^2)...O(n)..
// class recursion {
//     //...recursion....linear...
//     static String reverseStr(String str, int i) {
//         if(i==-1) return "";
//         String st = reverseStr(str, i-1);
//         return str.charAt(i) + st;
//     }
//     //...recursion....2 pointer...
//     // static String reverseStr(String s, int i, int j) {
//     //     if(i>=j)    return s;
        
//     //     char[] arr = s.toCharArray();
//     //     char t = arr[i];
//     //     arr[i] = arr[j];
//     //     arr[j] = t;
//     //     return reverseStr(new String(arr), i+1, j-1);
//     // }
//     public static void main(String[] args) {
//         String str = "PawanBisht";
//         System.out.println(reverseStr(str, str.length()-1));              // linear 
//         // System.out.println(reverseStr(str, 0, str.length()-1));            // 2 pointer
//     }
// }






// // lower to upper string.............

// class recursion {
//     //...recursion.......
//     static String lower_upper(String s, int i) {
//         if(i==-1)    return "";
        
//         char[] arr = s.toCharArray();
//         if(arr[i] >= 'a' && arr[i] <='z')
//             arr[i] = (char)(arr[i]-32);
//         // arr[i] = (char)('A'+arr[i]-'a');
//         return lower_upper(new String(arr), i-1);
//     }
//     public static void main(String[] args) {
//         String str = "pawan bisht";
//         System.out.println(lower_upper(str, str.length()-1));
//     }
// }






// // remove 'a' occurences...O(n^2).........

// class recursion {
//     //...recursion.......
//     static String remove_a(String s, int i) {
//         if(i==-1)   return "";
//         if(s.charAt(i)!='a')
//             return remove_a(s, i-1) + s.charAt(i);
//         else                                                     // skip 'a'
//             return remove_a(s, i-1);
//     }
//     public static void main(String[] args) {
//         String str = "pawanbishat";
//         System.out.println(remove_a(str, str.length()-1));
//     }
// }




// //.... check palimdrom.........

// class recursion {
//     static boolean palim(String str, int i, int j) {
//         if(i>=j)    return true;
//         if(str.charAt(i) != str.charAt(j)){
//             return false;
//         }
//         return palim(str, i+1, j-1);
//     }
//     public static void main(String[] args) {
//         String str = "radar";
//         System.out.println(palim(str, 0, str.length()-1));
//     }
// }