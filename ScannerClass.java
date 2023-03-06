// import java.util.Scanner;

// class ScannerClass {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String name = scan.next();
//         String surename = scan.next();
//         int rollNumber = scan.nextInt();
//         String interest = scan.next();
//         System.out.println("Name: "+name+" "+surename+"\nRoll Number: "+rollNumber+"\nField of interest: "+interest);
//     }
// }






// import java.util.Scanner;
    
// class ScannerClass {
//     static void sumPrint(int fNum, int sNum) {
//         int sum = fNum + sNum;
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int op = scan.nextInt();

//         for (int i = 0; i < op; i++) {
//             int F_NUM = scan.nextInt();
//             int S_NUM = scan.nextInt();
//             sumPrint(F_NUM, S_NUM);
//         }
//     }
// }







import java.util.Scanner;
    
class ScannerClass {
    static void sumPrint(String fNum, String sNum) {
        String sum = fNum + sNum;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();

        for (int i = 0; i < op; i++) {
            String F_NUM = scan.next();
            String S_NUM = scan.next();
            sumPrint(F_NUM, S_NUM);
        }
    }
}