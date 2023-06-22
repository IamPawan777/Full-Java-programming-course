
// /* ...arrays declaration & traverse...*/

// class Arrayss {
//     public static void main(String[] args) {
//         // int[] a = {12,23,34,223,44};        //1st
        
//         // String[] a = new String[3];          //2nd
//         // a[0] = "rahul";
//         // a[1] = "karan";
//         // a[2] = "neha";
        
//         float a[] = new float[] {3.67f, 5, 1.111f, 8};
//         // System.out.println(a[2]);            //can print one by one
        
//         for (int i = 0; i < a.length; i++) {     //traverse complete array
//             System.out.print(a[i] + " ");
//         }
//     }
// }





// /* .....Insert element and print.... */

// class Arrayss {
//     public static void main(String[] args) {
//         java.util.Scanner scan = new java.util.Scanner(System.in);
//         System.out.println("Enter size: ");
//         int n = scan.nextInt();
//         double[] val = new double[n];
        
//         System.out.println("Enter double values: ");
//         for(int i=0; i<val.length; i++) {               //traverse in array not size
//             val[i] = scan.nextDouble();                 //write nextDouble to insert double value
//         }

//         System.out.println("Number are: ");
//         for(int i=0; i<val.length; i++) {
//             System.out.print(val[i] + "   ");
//         }

//     }
// }




// //..........anonymous array.....

// class Arrayss {
//     void fun(int ar[]) {
//         for(int a: ar) {
//             System.out.print(a+" ");
//     }
//     }
//     public static void main(String[] args) {
//     Arrayss obj = new Arrayss();
//     obj.fun(new int[]{22, 45, 16, 98, 34});         //anonymous aaray
//     }
// }





// //negative number as an array size

// class Arrayss {
//         public static void main(String[] args) {
//             int[] arr = new int[-3];            //NegativeArraySizeException
//         }
//     }






// //......maximum number in array........

// class Arrayss {
//     static void getData(int arr[])
//     {
//         int result = 0;
//         for(int i=0; i<arr.length; i++) 
//         {
//             if(arr[i] > result)
//                 result = arr[i];
//         } 
//         System.out.println("Max: "+result);
//     }
    
//     public static void main(String[] args) {
//         int a[] = {3,1,6,8,5};
//         getData(a);
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








// // //.......print only positive number......

// class Arrayss {
//     static void getPositive(int[] a) {
//         for (int i = 0; i < a.length; i++) 
//             if(a[i] >= 0)
//                 System.out.print(a[i]+" ");
//     }
//     public static void main(String[] args) {
//         int[] arr = {3, 8, -1, 3, -4, -9, 4, -2};
//         getPositive(arr);
//     }
// }





//...... odd string print.......

// class Arrayss {
//     void oddString(String a[]) {
//         for (int i = 0; i < a.length; i++) {
//             if(i%2 != 0)
//                 System.out.println(a[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         Arrayss obj = new Arrayss();
//         String[] arr = {"ab","bc","cd","de","ef","fg","gh"};
//         obj.oddString(arr);
//     }
// }





// //.......even element print......

// class Demo {
//     void printEven() {
//         int arr[] = {1,2,3,4,5,6,7,8};
//         for(int i:arr) {
//             if(i%2 != 0)
//                 System.out.print(arr[i]+" ");
//         }
//     }
// }
// class Arrayss {
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         obj.printEven();
//     }
// }






// //.......minimum element in the array......

// import java.util.Arrays;

// class Demo {
//     void minElement(int[] a) {
//         int min = 0;
//         for (int i=0; i<a.length; i++) {
//             if(a[i] < min)
//                 min = a[i];
//         }
//         System.out.println(min);
//     }
// }
// class Arrayss {
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         obj.minElement(new int[] {2, -3, 5, 8, -8, 0, -4});
//     }
// }






// //.......first peak elemnet in the array......

// class Arrayss {
//     public static void main(String[] args) {
//         int[] arr = {3,1,4,6,2,5,1,6,7,1};          //phla bda element:- 1st < 2nd > 3rd
//         for (int i = 1; i < arr.length-1; i++) {
//             if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
//                 System.out.print(arr[i]);
//                 break;
//             }
//         }
//     }
// }





// //.........copy of array ( Shallow copy ).........

// class Arrayss {
//     static void fun(int[] a) {
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {11, 22, 33, 44, 55};
//         System.out.println("original array: ");
//         fun(arr);
//         System.out.println();
        
//         int[] arr2 = arr;                //copy to arr2
//         System.out.println("copied array: ");
//         fun(arr2);
//         System.out.println();
//     }
// }






// //....change in array1 still change array2.....(because array1 and array2 pointed to same heap area).
//.......int arr1[] = {12, 23, 34, 45};
//.......int arr2[] = arr1;             //shallow copy


// class Arrayss{
//     static void fun(int[] a) {
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {11, 22, 33, 44, 55};
//         System.out.println("original array: ");
//         fun(arr);
//         System.out.println();
        
//         int[] arr2 = arr;                    //copy the array (shallow copy)...

//         arr2[0] = 0;
//         arr2[4] = 77777;
//         System.out.println("copied array: ");
//         fun(arr2); 
//         System.out.println();
//         System.out.println("original array: ");         //also change bcz of point same location
//         fun(arr);       

//     }
// }






// //......change in array2 but not change in array1 (not pointed to the same location)
// //.......int arr1[] = {12, 23, 34, 45};
// //.......int arr2[] = arr1.clone();              //deep copy


// class Arrayss{
//     static void fun(int[] a) {
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {12, 23, 34, 45, 56};
//         // int arr2[] = arr;                //same values same location
//         int arr2[] = arr.clone();           //different location
//         arr2[0] = 1000;
//         arr2[3] = 9999;
//         fun(arr);
//         System.out.println();
//         fun(arr2);
        
//     }
// }






// //.......second way to copy the array without effecting the 1st array ..........
// //......Array.copyOf(which_array_copied,  range_that_array)

// import java.util.Arrays;
// class Arrayss{
//         static void fun(int[] a) {
//             for (int i = 0; i < a.length; i++) {
//                 System.out.print(a[i]+" ");
//             }
//         }
//         public static void main(String[] args) {
//             int arr[] = {22,33,44,55,66};

//             // int arr2[] = arr;
//             // int arr2[] = Arrays.copyOf(arr, arr.length);                //copy without effecting previous array
//             // int arr2[] = Arrays.copyOf(arr, 2);         //upto 2 element 
//             int arr2[] = Arrays.copyOfRange(arr, 1, 4);         //now 1 to 4 is -> 0, 1, 2
//             arr2[0] = 11;
            
//             fun(arr);
//             System.out.println();
//             fun(arr2);
//         }
//     }





// //.........positive element one side....negative element another side....

// class Arrayss {
//     public static void main(String[] args) {
//         int[] arr = {-2,3,2,-1,0,4,-3};
//         int n=7;
//         int[] arr2 = new int[n];
//         int ind = 0;
        
//         for (int i = 0; i < n; i++) {
//             if(arr[i] >= 0) {
//                 arr2[ind] = arr[i];
//                 ind++;
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             if(arr[i] < 0) {
//                 arr2[ind] = arr[i];
//                 ind++;
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr2[i] + " ");
//         }

//     }
// }








// //......check palimdromic array or not............

// class Arrayss {
//     public static void main(String[] args) {
//         int[] ar = {1, 2, 3, 2, 1};
//         boolean ch = true;

//         for (int i = 0; i < ar.length/2; i++) {
//             if(ar[i] != ar[ar.length-1-i]) {
//                 ch = false;
//                 System.out.print("not palimdrom");
//                 break;
//             }
//         }
//         if(ch == true)
//         System.out.print("palimdrom");
//     }
// }






// //..........check palimdrom number or not..........

// class Arrayss {
//     public static void main(String[] args) {
//         int n = 13731;
//         int store = n;
//         int sum = 0;
//         while(n>0) {
//             int rem = n%10;
//             sum = sum*10 + rem;
//             n = n/10;
//         }
//         if(sum == store) {
//             System.out.println("palimdrom no");
//         }
//         else {
//             System.out.println("not palimdrom..");
//         }
//     }
// }





// //..........reversal of an array..........

// class Arrayss {
//     public static void main(String[] args) {
//         int[] arr = {3,-7,1,9,0,-3};

//         for (int i = 0; i < arr.length/2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[arr.length-i-1];
//             arr[arr.length-i-1] = temp;
//         }

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }







// //..........missing number in an array........

// class Arrayss {
//     public static void main(String[] args) {
//         int[] ar = {1,4,2,5};
//         int n = ar.length;
        
//         int sumNatural = (n+1)*(n+2) / 2;               //one number exter which is missing

//         int sum=0;
//         for (int i = 0; i < ar.length; i++) {
//             sum += ar[i];
//         }

//         int  missing = sumNatural - sum;
//         System.out.println(missing);
//     }
// }







// //...........duplicate element print...........

// class Arrayss {
//     public static void main(String[] args) {
//         int[] ar = {4,1,7,3,1,5,3};

//         for (int i = 0; i < ar.length; i++) {
//             for(int j=i+1; j < ar.length; j++) {
//                 if(ar[i] == ar[j]) {
//                     System.out.print(ar[i]+" ");
//                 }
//             }
//         }
//     }
// }