// //......for loop.......

// public class Loops {
//     public static void main(String[] args) {
//         for(int i=0; i<5; i++) 
//             System.out.println("*");
//     }
// }





// //....while loop........

// public class Loops {
//     public static void main(String[] args) {
//         int i=0;
//         while(i<10) {
//             System.out.println("*");
//             i++;
//         }
//     }
// }





// //..........do-while......

// class Loops {
//     public static void main(String[] args) {
//         int i=0;
//         do {
//             System.out.print("*  ");
//             i++;
//         }
//         while(i<10);
//     }
// }






//.......lable........

class Loops {
    public static void main(String[] args) {
        myloop: for (int i = 1; i < 100; i++) {             //here lable
            if(i%5 == 0) {
                System.out.print("  ");
                continue myloop;                        //go to lable
            }
        System.out.print(i+" ");
        }
    }
}
