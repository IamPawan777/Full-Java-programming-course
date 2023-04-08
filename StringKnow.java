import java.util.Arrays;
import java.util.Scanner;

import javax.net.ssl.SSLContext;
import javax.print.DocFlavor.STRING;

/*   String:-(Immutable // object never change)
 * obj.concat("..")  - concat string
 * s1 == s2 || s1.equals(s2) || s1.equalsIgnoreCase(s2)  - compare strings
 * s1.isEmpty()             //return boolean
 * 
 * 
 *   StringBuiler:-(Mutable / changble)
 * obj.append("..")  - concat string
 * 
 *   StringBuffer:-(Mutable / changble)
 * obj.append("..")  - concat string
*/



// //.......different mutable and immutable string "declaration"......

// public class StringKnow {
//     public static void main(String[] args) {
//         String name1 = "Harry1";            //...this way
//         System.out.println(name1);

//         StringBuilder name2 = new StringBuilder("Harry1");   //...this way
//         System.out.println(name2);

//         StringBuffer name3 = new StringBuffer("Harry1");            //....this way
//         System.out.println(name3);
//     }
// }





// // ......check mutability and immutability ......

// public class StringKnow {
//     public static void main(String[] args) {
//         String n1 = "Kaviata";            
//         System.out.println(n1);
//         n1.concat("Added");             //...changes in same location but can't
//         System.out.println("after concat: "+n1);

//         StringBuilder n2 = new StringBuilder("Kaviata");   
//         System.out.println(n2);
//         n2.append(" Added");            //...changes in same location and can change
//         System.out.println("after append: "+n2);

//         StringBuffer n3 = new StringBuffer("Kaviata");          
//         System.out.println(n3);
//         n3.append(" Added");            //...changes in same location and can change
//         System.out.println("after append: "+n3);
//     }
// }







// // ......Compare ( ==, .equals(), .equalsIgnoreCase() )......

// public class StringKnow {
//     public static void main(String[] args) {
//         String n1 = "Demo";
//         String n2 = "Demo";
//         String n3 = new String("Demo");
//         String n4 = new String("Demo");
//         String n5 = new String("DEMO");
        
//         System.out.println(n1==n2);     //T
//         System.out.println(n1==n3);     //f
//         System.out.println(n3==n4);     //f
//         System.out.println(n1.equals(n2));      //t
//         System.out.println(n1.equals(n3));      //t
//         System.out.println(n3.equals(n4));      //t
//         System.out.println(n3.equals(n5));      //f
//         System.out.println(n1.equalsIgnoreCase(n5));        //t ignore case senstivity
//         System.out.println(n3.equalsIgnoreCase(n5));        //t
        
//     }
// }






// //......Concatenation (+, .concat())

// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = new String("Demo");
//         s1.concat("Hi");     //demo
//         System.out.println(s1);


//         String s2 = new String("Demo");
//         s2 = s2.concat("Hi");           //DemoHi
//         System.out.println(s2);


//         String s3 = "Demo";
//         s3 = s3.concat("hi");           //Demohi
//         String s4 = s3.concat("hi");        //Demohihi
//         System.out.println(s3);         
//         System.out.println(s4);  
        
        
//         String s5 = "Demo"+"Hi"+"value"+"How";
//         String s6 = "PAWAN";
//         String s7 = s6+s5;
//         System.out.println(s5);             //DemoHivalueHow
//         System.out.println(s7);             //PAWANDemoHivalueHow



//         String s8 = "Paw";
//         s8 = 100+22+s8;
//         String s9 = "Bis";
//         s9 = s9+100+22;
//         System.out.println(s8);         //122Paw
//         System.out.println(s9);         //Bis10022
//     }
// }






// //...Some methods......

// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = "HI, Pawan.";
//         String s2 = "  College";

//         System.out.println(s1.toLowerCase());
//         System.out.println(s1.toUpperCase());

//         System.out.println(s1.length());

//         System.out.println(s1.charAt(1));

//         System.out.println(s1.substring(1, 6));
//         System.out.println(s1.substring(1));

//         System.out.println(s1.indexOf("a"));
//         System.out.println(s1.lastIndexOf("a"));

//         System.out.println(s1.replace("HI,", "she..."));
//         System.out.println(s1.replace('a', 'A'));
//         System.out.println(s1.replace(s1, s2));

//         System.out.println(s2.trim());      //begnning and ending space remove

//         String s3 = s1.toString();      //copy in "String constant area" to "heap area"
//         System.out.println(s3);
//     }
// }





// class StringKnow {
//     public static void main(String[] args) {
//         String str = " ";
//         str.trim();
//         System.out.println(str.equals("")+" "+str.isEmpty());
//     }
// }





// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = "java";
//         String s2 = new String("java");
//         System.out.println("==");
//     }
// }






// //..  replaceAll method.........
// //.....only string are can replace not character

// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = "Hello, have a good day";
//         String s2 = s1.replaceAll("[^ao]", " ");
//         // s2 = s2.replace(" ", "");       //remove space
//         System.out.println(s2);
//     }
// }





// //.........spilt("value")....

// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = "RamanujamRamPawan";
//         String[] arr = s1.split("m");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]+" ");
//         }
//     }
// }






// //...cheak charater contains or not.........

// class StringKnow {
//     public static void main(String[] args) {
//         String str1 = "Umbrella";
//         char ch = 'e';
        
//         // boolean b = false;
//         // for (int i = 0; i < str1.length(); i++) {
//         //     if(ch == str1.charAt(i)) {
//         //         b = true;
//         //         break;
//         //     }
//         // }
//         // if (b == true) {
//         //     System.out.println("present.");
//         // } else {
//         //     System.out.println("Not present");            
//         // }

//         //or

//         if(str1.contains("e")) 
//         System.out.println("present");
//         else
//         System.out.println("Not present");
//     }
// }






// //...reverse string................
// //....pawan bisht -> thsib nawap

// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = "Pawan Bisht";
//         String s2 = "" ;            //empty string

//         for(int i=s1.length()-1; i>=0; i--) {
//             s2 = s2+s1.charAt(i);
//         }
//         System.out.println(s2);
//     }
// }





// ////...reverse string................
// //....Pawan Bisht -> Bisht Pawan

// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = "Pawan Bisht ji";
//         String s2 = "";
//         String[] arr = s1.split(" ");           //split from where space are happening

//         for(int i=arr.length-1; i>=0; i--) {
//             s2 = s2+arr[i]+" ";
//         }
//         System.out.println(s2);
//     }
// }





// // ////...reverse string........( maintain order )........
// // //....Pawan Bisht -> nawaP thsiB 

// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = "Pawan Bisht";
//         String s2 = "";

//         String[] str = s1.split(" ");

//         for(String ele : str) {
//             for(int i=ele.length()-1; i>=0; i--) {
//                 s2=s2+ele.charAt(i);
//             }
//             s2+=" ";
//         }
//         System.out.println(s2);
//     }
// }






// //.........palimdrom string.......

// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = "madaM";
//         String s2 = "";

//         for(int i=s1.length()-1; i>=0; i--) {
//             s2 = s2+s1.charAt(i);
//         }

//         if(s1.equals(s2)) 
//         System.out.println("Palimdrom String..");

//         else
//         System.out.println("Not palimdrom String..");
//     }
// }





// //.....Anagram String or not (Peek -> Keep || are -> rae)

// import java.util.Arrays;
// class StringKnow {
//     public static void main(String[] args) {
//         String s1 = "Pa wpp";
//         String s2 = "wpa pp";

//         s1 = s1.toLowerCase();
//         s2 = s2.toLowerCase();
        
//         s1 = s1.replace(" ", "");
//         s2 = s2.replace(" ", "");
        
//         char[] arr1 = s1.toCharArray();
//         char[] arr2 = s2.toCharArray();
        
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
        
//         if(Arrays.equals(arr1, arr2)) {
//             System.out.println("Anagram...");
//         }
//         else
//         System.out.println("Not Anagram...");

        
//     }
// }







// //.......Lower case string to upper case string conversion (A=65, a-97)

// class StringKnow{
//     public static void main(String[] args) {
//         // String s = "pawan";
//         // char[] s1 = s.toCharArray();
//         // or
//         char[] s1 = {'p','a','w','a','n'};
//         String str = "";

//         for(int i=0; i<s1.length; i++) {
//             int n = s1[i]-32;
//             str += (char)n;
//         } 
//         System.out.println(str);
//     }
// }





// //...check panagram of not....

// class StringKnow {
//     public static void main(String[] args) {
//         String str = "The quick brown fox jumps over lazy dog";
//         boolean check = false;
//         str = str.replace(" ", "");
//         str = str.toLowerCase();

//         char[] ch = str.toCharArray();
//         char[] ch2 = new char[26];          //blank 26 size array every element are 0

//         for (int i = 0; i < ch.length; i++) {
//             ch2[ch[i]-97]++;
//         }

//         for (int i = 0; i < ch2.length; i++) {
//             if(ch2[i] == 0) {
//                 System.out.println("not panagram");
//                 check = true;
//             }
//         }
//         if (check==false) {
//             System.out.println("Panagram....");
//         }

//     }
// }








// // to remove duplicates form a string....

// class StringKnow {

//     static String removeDuplecate(String s) {
//         char[] ch = s.toCharArray();
//         String add = new String();
//         // for (int i = 0; i < ch.length; i++) {
//         //     boolean check = false;
//         //     for (int j = i+1; j < ch.length; j++) {
//         //         if(ch[i] == ch[j]){
//         //             check = true;
//         //             break;
//         //         }
//         //     }
//         //     if(check==false) {
//         //         add += ch[i];
//         //     }
//         // }
//         // return add;
        
//         // or

//         int j;
//         for (int i = 0; i < ch.length; i++) {
//             for (j = 0; j < ch.length; j++) {
//                 if(ch[i]==ch[j])
//                 break;
//             }
//             if(i==j){               //same location then add character
//                 add += ch[i];
//             }
//         }
//         return add;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter String: ");
//         String str = scan.nextLine();
//         System.out.println("Remove duplecate: "+removeDuplecate(str));

//     }
// }


// or


// class StringKnow {

//     static StringBuffer noDuplecate(String s) {
//         char[] ch = s.toCharArray();
//         StringBuffer st = new StringBuffer();
//         // for (int i = 0; i < ch.length; i++) {
//         //     boolean check = false;
//         //     for (int j = i+1; j < ch.length; j++) {
//         //         if(ch[i] == ch[j]) {
//         //             check = true;
//         //             break;
//         //         }
//         //     }
//         //     if(check == false)
//         //     st.append(ch[i]);
//         // }

//             int j;
//             for (int i = 0; i < ch.length; i++) {
//                 for (j = 0; j < ch.length; j++) {
//                     if(ch[i]==ch[j])
//                     break;
//                 }
//                 if(i==j) {
//                     st.append(ch[i]);
//                 }
//             }

//         return st;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter String: ");
//         String str = scan.nextLine();
//         System.out.println("now get: "+noDuplecate(str));
//     }
// }





// //......print duplicates string....

// class StringKnow {
//     static String printDuple(String s) {
//         char[] ch = s.toCharArray();
//         String sto = new String();
//         for (int i = 0; i < ch.length; i++) {
//             boolean ck = false;
//                 for (int j = i+1; j < ch.length; j++) {
//                     if(ch[i]==ch[j]){
//                         ck = true;
//                     }
//                 }
//                 if(ck==true){
//                     sto+=ch[i];
//                 }
//             }
//             return sto;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter String: ");
//         String str = scan.nextLine();
//         String str2 = printDuple(str);
//         System.out.println(str2);
//     }
// }







// //....count the vowels, consonants, digit, special character in a string

// class StringKnow {
//     static void countChracter(String str) {
//         str = str.toUpperCase();
//         char[] ch = str.toCharArray();
//         int vowels=0;
//         int consonant=0;
//         int digits=0;
//         int specialCha=0;
        
//         for (int i = 0; i < ch.length; i++) {
//             if(ch[i]>='A' && ch[i]<='Z'){
//                 if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
//                 vowels++;
//                 else
//                 consonant++;
//             }
//             else if(ch[i]>='0' && ch[i]<='9') {
//                 digits++; 
//             }
//             else{ 
//                 specialCha++;
//             }
//         }
//         System.out.println("vowels: "+vowels);
//         System.out.println("consonant: "+consonant);
//         System.out.println("digits: "+digits);
//         System.out.println("specialCha: "+specialCha);
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter String with number and Special character: ");
//         String n = scan.nextLine();
//         countChracter(n);
//     }
// }





// //...check unique element exist or not......

// class StringKnow {
//     static boolean uniqueElement(String s) {
//         char[] ch = s.toCharArray();
//         boolean check = false;
//         for (int i = 0; i < ch.length; i++) {
//             for (int j = i+1; j < ch.length; j++) {
//                 if(ch[i]==ch[j]) {
//                     check = true;
//                 }
//             }
//         }
//         return check;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter any Character: ");
//         String str = scan.nextLine();
//         System.out.println("is unique element exist: "+uniqueElement(str));
//     }
// }





// //....first maximum occuring character.......

// class StringKnow {
//     static void maxOccurr(String s) {
//         s = s.replace(" ", "");
//         int arr[] = new int[127];
//         for (int i = 0; i < s.length(); i++) {
//             arr[s.charAt(i)]++;             //Apple  (i=0) -> arr[chraAt(0)] -> arr[A] -> arr[65] -> 0(initially) -> 0++ -> 1
//         }

//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         char chMax = ' ';
//         char chMin = ' ';
//         for (int i = 0; i < s.length(); i++) {
//             if(max < arr[s.charAt(i)] ) {           //maximum occurence
//                 max = arr[s.charAt(i)];
//                 chMax = s.charAt(i);
//             }

//             if(min > arr[s.charAt(i)] ) {           //minimum occurence
//                 min = arr[s.charAt(i)];
//                 chMin = s.charAt(i);
//             }

//         }
//         System.out.println("Max occurence: "+chMax);
//         System.out.println("min occurence: "+chMin);
//         // return ch;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter: ");
//         String str = scan.nextLine();
//         maxOccurr(str);
//         // System.out.println("Max occuring character: "+maxOccurr(str));
//     }
// }






class StringKnow{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = "n";

    }
}