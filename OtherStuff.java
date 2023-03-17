// //..........difference length and length().....

// class OtherStuff {
//     public static void main(String[] args) {
//         int arr[] = {3, 5, 1, 6};
//         String name = "hariom";
//         System.out.println(arr.length);
//         System.out.println(name.length());
//     }
// }





//..........anonymous array.....

class OtherStuff {
    static void fun(int ar[]) {
        for(int a: ar) {
            System.out.print(a+" ");
    }
    }
    public static void main(String[] args) {
    fun(new int[]{22, 45, 16, 98, 34});         //anonymous aaray
    }
}