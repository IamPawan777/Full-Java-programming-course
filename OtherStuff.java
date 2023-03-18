// //..........difference length and length().....

// class OtherStuff {
//     public static void main(String[] args) {
//         int arr[] = {3, 5, 1, 6};
//         String name = "hariom";
//         System.out.println(arr.length);
//         System.out.println(name.length());
//     }
// }





// //..........anonymous array.....

// class OtherStuff {
//     static void fun(int ar[]) {
//         for(int a: ar) {
//             System.out.print(a+" ");
//     }
//     }
//     public static void main(String[] args) {
//     fun(new int[]{22, 45, 16, 98, 34});         //anonymous aaray
//     }
// }






// //........primitive data not change........

// class OtherStuff{
//     static void changeVal(int a) {
//         a = 99;
//     }
//     public static void main(String[] args) {
//         int a = 100;
//         changeVal(a);
//         System.out.println(a);      //no change a value
//     }
// }



// ........array change the value.........

class OtherStuff{
    static void changeVal(int[] a) {
        a[0] = 99;
        a[1] = 999;
    }
    public static void main(String[] args) {
        int[] a = {100, 200, 300};
        changeVal(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");      //change a value
        }
    }
}
