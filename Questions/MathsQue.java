//.....number in the input is prime or not.........
//.......Fibonacci series..........
//........palindrome Number.......
//........palindrome String.......
//.........factorial...........
//........armstrong Number.......
//........reverse Number.....
//.........swap number.......
//.........prime number.......
//..........chanage ascii......
//........matrix multiplication.......
///.........number of charactor in String.......
/*........patters Question......*/





// // print the value of input if it is even and divisible by 3.

// class Conditional {
//     void evenDiv3() {
//         for(int i=1; i<100; i++) {
//             if(i%3==0 && i%2==0)
//                 System.out.print(i+", ");
//         }
//     }
//     public static void main(String[] args) {
//         Conditional obj = new Conditional();
//         obj.evenDiv3();
//     }
// }






// // For each multiple of 3, print "Fizz".
// //  For each multiple of 5, print "Buzz".
// //  For numbers which are multiples of both 3 and 5, print "FizzBuzz".

// class Conditional {
//     static void print() {
//         for(int i=1; i<=50; i++) {
//             if(i%3==0 && i%5==0)
//                 System.out.println(i+": FizzBuzz");
//             if(i%3==0) 
//                 System.out.println(i+": Fizz");
//             else if(i%5==0)
//                 System.out.println(i+": Buss");
//         }
//     }
//     public static void main(String[] args) {
//         print();
//     }
// }






// // program that prints each number from 1 to 100 on a new line, except 
// // if the number is a multiple of 5 or 7.

// class Conditional {
//     public static void main(String[] args) throws java.lang.Exception {
//         int i=1;
//         while(i<=100) {
//             if(i%5==0 || i%7==0) 
//                 System.out.println(i);
//             i++;
//         }
//     }
// }






// // all values between 1 and 100, except if it’s a multiple of 3.

// class Conditional {
//     public static void main(String[] args) {
//         for(int i=1; i<=100; i++) {
//             if(i%3 == 0)
//             System.out.print(i+" ");
//         }
//     }
// }






// //........Simple interest.........

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner sc = new java.util.Scanner(System.in);

//         System.out.print("Enter principal: ");
//         float p = sc.nextFloat();

//         System.out.print("Enter Interest Rate: ");
//         float i = sc.nextFloat();

//         System.out.print("Enter period: ");
//         int t = sc.nextInt();

//         double SI = (p*i*t)/100;
//         System.out.println("Simple Interest: "+SI);
//     }
// }






// //.........character at string**********.......

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter String: ");
//         String str = scan.nextLine();

//         System.out.println("at Index: ");
//         char ch = str.charAt(scan.nextInt()-1);

//         System.out.println("character: "+ch);
//     }
// }






// //.......Swap two number without third variable.....

// import java.util.*;
// class MathsQue {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         a = a+b;
//         b = a-b;
//         a = a-b;
//         System.out.println(a+"\n"+b);
//     }
// }




// //.....count total numbers of digit in any number.......

// import java.util.*;
// class MathsQue {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int count = 0;
//         while(n>0) {
//             n/=10;              //234 -> 23 -> 2 -> 0
//             count++;
//         }
//         System.out.println(count);
//     }
// }






// //.......calculate the sum of the digits of a number.......

// import java.util.*;
// class MathsQue {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter no: ");
//         int no = scan.nextInt();
//         int sum = 0;
//         while(no>0) {
//             sum += no%10;
//             no /= 10;
//         }
//         System.out.println(sum);
//     }
// }





// //.....reverse the number........

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int store = 0;
//         while (n>0) {
//             store = store*10 + n%10;
//             n/=10;
//         }
//         System.out.println(store);
//     }
// }




// //..........sum of series.(1+2-3+4-5+6-7+8-9).....

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int calculate = 0;
//         for (int i = 1; i <= n; i++) {
//             if(i%2 == 0)
//                 calculate -= i;
//             else if(i%2 != 0)
//                 calculate += i;
//         }
//         System.out.println(calculate);
//     }
// }






// //..........factrial no.......

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int sum = 1;
//         for(int i=1; i<=n; i++) {
//             sum*=i;
//         }
//         System.out.println(sum);
//     }
// }





// //..........a raised to power b......

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int a = scan.nextInt(), b=scan.nextInt(), store=1;
//         for(int i=1; i<=b; i++) {
//             store *= a;
//         }
//         System.out.println(store);
//     }
// }





// //....print Fibonacci series of n terms ....

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int a=1, b=1;
//         for (int i = 0; i < n; i++) {
//             System.out.print(a+" ");
//             int sum = a+b;
//             a = b;
//             b = sum;
//         }        
//     }
// }






// //....print factorial no....

// class MathsQue {
//     int factorialNo(int n, int sum) {
//         if(n==0) 
//             return n;
//         else {
//             for (int j = n; j >= 1; j--) {
//                 sum*=j;                
//             }
//             return sum;            
//         }
//     }
//     public static void main(String[] args) {
//         MathsQue obj = new MathsQue();
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int sum = 1;
//         int store = obj.factorialNo(n, sum);
//         System.out.println(store);
//     }
// }







// // //..........armstrong number or not.........

// import java.util.Scanner;
// class MathsQue {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int store = n;
//         int sum = 0;
//         while(n>0) {
//             int digit = n%10;
//             sum += digit*digit*digit;
//             n/=10;
//         }
//             if(sum == store) 
//                 System.out.println(store+" is armstrong number...");
//             else
//                 System.out.println(store+" not armstrong number...");
//     }
// }






// // //..........armstrong number among........

// import java.util.Scanner;
// class MathsQue {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter no: ");
//         int n = scan.nextInt();

//         for(int i=0; i<=n; i++) {
//             int store = i;
//             int sum = 0;
//             while(store>0) {
//                 int digit = store%10;
//                 sum += digit*digit*digit;
//                 store /= 10;
//             }
//             if(i==sum) 
//                 System.out.println(i);
//         }
//     }
// }







// //........prime no or not.....

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter no: ");
//         int n = scan.nextInt();
//         int count = 0;
//         // for(int i=1; i<=n; i++) {
//         //     if(n%i == 0)
//         //     count++;
//         // }
//         // if(count==2)            //because prime no divide only '1' and 'itself'
//         //     System.out.println("Prime number");
//         // else
//         //     System.out.println("Not a Prime number");
// //or
//         // for(int i=2; i<=n/2; i++) {             //or   for(int i=2; i<=n-1; i++)
//         //     if(n%i==0) {
//         //         count++;
//         //     }
//         // }
//         // if(count>0)
//         //     System.out.println("Not prime no");
//         // else 
//         //     System.out.println("Prime no");
// //or
//         int i;
//         for (i = 2; i < n; i++) {
//             if(n%i == 0)            //if no is prime never divide...if n=7 now 'i' also '7'
//                 break;
//         }
//         if(i==n)            // so 'i' is 7
//             System.out.println("Number is prime...");
//         else
//             System.out.println("number is not prime..");
//     }
// }







// //........prime no's..........

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("prime no's upto: ");
//         int n = scan.nextInt();
        
//         for (int i = 2; i <= n; i++) {    
//             int count = 0;
//             for (int j = 2; j < i; j++) {
//                 if(i%j == 0)
//                     count++;
//             }
//             if(count == 0)
//                 System.out.print(i+" ");
//         }

//         scan.close();
//     }
// }







// //.......squre root........

// public class MathsQue {
//     public static void main(String[] args) {
//         MathsQue obj = new MathsQue();
//         int a = 16;   
//         double store = Math.pow(a,.5);   //16 ^ .5
//         // or
//         double store1 = Math.sqrt(a);
//         System.out.println(store+"  "+store1);
//     }
// }






//.......area and perimeter of a triangle without perrameter in constructor........

// public class MathsQue {
//     int a, b, c;
//     MathsQue() {
//         a=2; b=5; c=6;
//     }
//     double getArea() {
//         double s=(a+b+c)/2.0;           //always write 2.0 not 2 only
//         double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
//         return area;
//     }
//     double getPerimeter() {
//         double perimeter = a+b+c;
//         return perimeter;
//     }
//     public static void main(String[] args) {
//         MathsQue obj = new MathsQue();
//         System.out.println("Area: "+obj.getArea());
//         System.out.println("Parimeter: "+obj.getPerimeter());
//     }
// }








// //........average of 3 no....

// import java.util.*;
// class MathsQue {
//     void average() {
//         int sum = 0;
//         Scanner scan = new Scanner(System.in);
//         for (int i = 0; i < 3; i++) {
//             int n = scan.nextInt();
//             sum += n;
//         }
//         int average = sum/3;
//         System.out.println(average);
//     }
//     public static void main(String[] args) {
//         MathsQue obj = new MathsQue();
//         obj.average();
//     }
// }








//.......count all vowels in a string....

// import java.util.*;
// class MathsQue {
//     static int vowels(String s) {
//         int count = 0;
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//                 count++;
//             }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String str = scan.next();


//         System.out.println(vowels(str));
//     }
// }






// //.....display the middle character of a string....

// import java.util.*;
// class MathsQue {
//     static void  mid_Element(String s) {
//         // int mid, mid2;
//         // int count=-1;
//         // for (int i = 0; i < s.length(); i++) {
//         //     count++;
//         // }
//         // if(count%2==0){      //odd
//         //     mid = count/2;
//         //     char ch = s.charAt(mid);
//         //     System.out.println(ch);
//         // }
//         // else{
//         //     mid = count/2;
//         //     mid2 = (count/2)+1;
//         //     char ch = s.charAt(mid);
//         //     char ch2 = s.charAt(mid2);
//         //     System.out.println(ch+""+ch2);
//         // }

//         // or

//         if(s.length()%2==0) 
//             System.out.println(s.substring(s.length()/2-1, s.length()/2+1));
//         else
//             System.out.println(s.substring(s.length()/2, s.length()/2+1));
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String str = scan.next();
//         mid_Element(str);
//     }
// }






// //........check leap year or not.......

// class MathsQue {
//     static boolean check_year(int n) {
//         if(n%4==0 || n%100==0){
//             return true;
//         }
//         else
//             return false;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int year = scan.nextInt();
//         System.out.println(check_year(year));
//     }
// }






// //.......smallest number among three numbers........

// class MathsQue {
//     static int smallest_no(int a, int b, int c) {
//         // if(a<b && a<c) 
//         //     return a;
//         // else if(b<a && b<c)
//         //     return b;
//         // else
//         //     return c;

//         // or

//         return Math.min(a, Math.min(b,c));
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n1 = scan.nextInt();
//         int n2 = scan.nextInt();
//         int n3 = scan.nextInt();

//         System.out.println(smallest_no(n1,n2,n3)); 
//     }
// }






// //....search an element in array.......

// class Arrayss {
//     static int getData(int a[]){
//         int key = 7;
//         for (int i = 0; i < a.length; i++) {
//             if(key == a[i])
//                 return i;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int[] arr = {5,2,7,9,1,4};
//         System.out.println("Index: "+getData(arr));
//     }
// }





// //.......occurrences of any element x........

// import java.util.Scanner;

// class MathsQue {
//     static int frequenty(int[] a, int key) {
//         int count = 0;
//         for (int i = 0; i < a.length; i++) {
//             if(key == a[i])
//                 count++;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr = new int[] {2,3,8,5,4,3,3};

//         int key = 4;

//         System.out.println("occurrence : "+frequenty(arr, key));

//     }
// }







// //..........last occurrence of an element.........

// class MathsQue {
//     static int occurrence(int[] a, int e) {
//         int last_ind = -1;
//         for (int i = 0; i < a.length; i++) {
//             if(a[i] == e)
//                 last_ind = i;
//         }
//         return last_ind;
//     }
//     public static void main(String[] args) {
//         int[] arr = {3,5,1,6,1,4,1,8,};
//         int elem = 1;
//         System.out.println("last accurrence: "+occurrence(arr, elem));
//     }
// }







// //..........count the number of element greater then element 'a'.........

// class MathsQue {
//     static int greater_ele(int arr[], int ele) {
//         int count = 0;
//         for (int i=0; i<=arr.length-1; i++) {
//             if(ele < arr[i])
//                 count++;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int[] arr = new int[]{11,22,33,44,55,66,77};
//         int num = 55;
//         System.out.println(greater_ele(arr, num));
//     }
// }







// //..........check array shorted or not.........

// import java.util.*;

// class Demo {
//     boolean check(int[] a) {
//         boolean bool_val = true;
//         for (int i = 1; i < a.length; i++) {
//             if(a[i-1] > a[i]) {
//                 bool_val = false;
//                 break;
//             }
//         }
//         return bool_val;
//     }
// }
// class MathsQue {
//     public static void main(String[] args) {
//         Demo obj = new Demo();

//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = scan.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter element: ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();
//         }

//         System.out.println("is shorted: "+obj.check(arr));
//     }
// }







// //.........(* return array * ).....biggest and smallest number.........

// import java.util.*;

// class MathsQue {
//     static int[] big_small(int a[]) {
//         Arrays.sort(a);
//         int[] ans = {a[0], a[a.length-1]};          //store 1st and last element
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = new int[]{5,2,8,1,5,6,2};
//         int[] store = big_small(arr);

//         // System.out.println("smallest: "+store[0]);
//         // System.out.println("largest: "+store[1]);
//     // or
//         for (int i = 0; i < store.length; i++) {
//             System.out.print(store[i]+" ");
//         }
//     }
// }







// // .........(* return half sorted array * )..........

// import java.util.*;

// class MathsQue {
//     static int[] big_small(int a[]) {
//         Arrays.sort(a);
//         int[] b = Arrays.copyOf(a, a.length/2);             //copyOf() mehtod copy the array from 'a' to 'b' without effecting a'th location
//         return b;
//     }

//     public static void main(String[] args) {
//         int[] arr = new int[]{5,2,8,1,3,6};
        
//         int arr2[] = big_small(arr);
//         for (int i = 0; i < arr2.length; i++) {
//             System.out.print(arr2[i]+" ");
//         }
//     }
// }





//........positive number placed in starting and negative number placed after that..........

class MathsQue {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("How Much: ");
        int n = scan.nextInt();

        System.out.println("Enter: ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }

        int arr2[] = new int[n];
        int ind = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i]>=0) {
                arr2[ind] = arr[i];
                ind++;
            }
       }
        for (int i = 0; i < n; i++) {
            if(arr[i]<0) {
                arr2[ind] = arr[i];
                ind++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

        
    }
}







// //........Union of 2 different array..........

// import java.util.*;

// public class MathsQue {
//     public static void main(String[] args) {

//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("1st array size: ");
//         int n = scan.nextInt();
//         System.out.println("2nd array size: ");
//         int m = scan.nextInt();

//         int[] a = new int[n];
//         int[] b = new int[m];

//         System.out.println("Enter in 1st array: ");
//         for (int i = 0; i < a.length; i++) {
//             a[i] = scan.nextInt();
//         }
//         System.out.println("Enter in 2nd array: ");
//         for (int i = 0; i < b.length; i++) {
//             b[i] = scan.nextInt();
//         }

//         LinkedHashSet<Integer> hs = new LinkedHashSet<>();          //hashSet and LinkedHashSet store unique object

//         for (int i : a) {           //add element 1st array to hs
//             hs.add(i);
//         }
//         for (int j : b) {            //add element 1st array to hs
//             hs.add(j);
//         }
        
//         System.out.println("Union of the two arrays is:");
//         Iterator itr = hs.iterator();
//         while(itr.hasNext()) {
//             System.out.print(itr.next()+" ");
//         }
//         System.out.println("\nTotal element: "+hs.size());
//     }
// }






// // to test the equality of two arrays..arr1 = 22 33 44 11 8 || arr2 = 22 33 44 11 8 

// class MathsQue {
//     static boolean similar(int[] a, int[] b) {
//         boolean value = true;
//         for (int i = 0; i < a.length; i++) {
//             for (int j = i; j <= i; j++) {
//                 if(a[i] != b[j])
//                 value = false;
//             }
//         }
//         return value;
//     }
    
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = scan.nextInt();

//         int[] arr1 = new int[n];
//         System.out.println("Enter 1st element: ");
//         for (int i = 0; i < arr1.length; i++) {
//             arr1[i] = scan.nextInt();
//         }
        
//         int[] arr2 = new int[n];
//         System.out.println("Enter 2nd element: ");
//         for (int i = 0; i < arr2.length; i++) {
//             arr2[i] = scan.nextInt();
//         }

//         boolean ck = similar(arr1, arr2);
//         System.out.println(ck);

//     }
// }







// // Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
// //  In case of multiple subarrays, return the subarray which comes first on moving from left to right.
// //  You need to print the start and end index of answer subarray

// class MathsQue {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = scan.nextInt();
//         System.out.println("Sum: ");
//         int s = scan.nextInt();

//         System.out.println("Enter element: ");
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scan.nextInt();
//         }

        
//         int sum = 0, j=0; 
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//             if(sum > s) {
//                 while (sum > s) {           //Deleting starting index
//                     sum -= arr[j];
//                     j++;
//                 }
//             }
//             if(sum == s) {
//                 System.out.print("index: "+j+" ");
//                 System.out.print(i);
//                 break;
//             }
//         }
//     }
// }



