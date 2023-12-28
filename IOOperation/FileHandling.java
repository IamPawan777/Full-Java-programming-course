// //..........create new file and Direcory.........

// package IOOperation;
// import java.io.*;

// public class FileHandling {
//     public static void main(String[] args) throws IOException{
//         File f = new File("AFile.txt");                  // File constructor create
//         System.out.println(f.exists());
//         boolean b = f.createNewFile();                   // create new file
//         System.out.println(b);

//         File d = new File("IOop");
//         d.mkdir();                                              // create new directory
//         System.out.println(d.exists());

//     }
// }






// // ......create new directory and same folder create new file..........

// package IOOperation;
// import java.io.*;

// class FileHandling {
//     public static void main(String[] args) throws IOException {
//         File direc = new File("IOop");
//         direc.mkdir();                                              
//         File f1 = new File(direc, "MyFile.java");           // in target folder create new file
//         f1.createNewFile();
//     }
// }





// //.......list() method: check no of file/directory in a directory........
// package IOOperation;
// import java.io.*;

// class FileHandling {
//     public static void main(String[] args) throws IOException { 
//         File f = new File("P://Language//java");
//         String[] str = f.list();                            // list() method to check file & folder
        
//         int count = 0;
//         for (String i : str) {
//             count++;
//             System.out.println(i);
//         }
//         System.out.println("Total no of file are: "+count);

//     }
// }





// //........"FileWriter" object is use for write into the file.........
// package IOOperation;
// import java.io.*;

// class FileHandling {
//     public static void main(String[] args) throws IOException {
//         File dir = new File("IOera");
//         dir.mkdir();
        
//         File fi = new File(dir, "MyFile.txt");
//         fi.createNewFile();

//         FileWriter fw = new FileWriter(fi, true);                 // FileWrite object creation
//         fw.write("PAWAN\n");
//         fw.write(97+"\n");
//         fw.write("Bisht\n");
//         fw.write(65);
//         // fw.flush();
//         fw.write(66);
//         fw.write(67+"\n");

//         char[] ch = {'j','a','v','a','2'};
//         fw.write(ch);
//         fw.close();                             // mandatory bcz without close can not write operatora, it's stay at buffer location.
        
//         System.out.println("writing Is Done...!");
//     }
// }





// //......."FileReader" class is use for reating data from file......
// package IOOperation;
// import java.io.*;
// class FileHandling{
//     public static void main(String[] args) throws IOException{
//         File dir = new File("IOera");
//         File fi = new File(dir, "MyFile.txt");

//         FileReader fr = new FileReader(fi);
//         // int i = fr.read();                           // not recomendend
//         // while (i != -1) {
//         //     System.out.print((char)i);
//         //     i = fr.read();
//         // } 

// //.......or..........

//         char[] ch = new char[(int)fi.length()];                 // it is good practice
//         fr.read(ch);
//         for (char data : ch) {
//             System.out.print(data);
//         }

//         fr.close();
//     }
// }




// //....BufferedWriter class.........have newLine() method...

// package IOOperation;
// import java.io.*;

// class FileHandling {
//     public static void main(String[] args) throws IOException {
//         File dir = new File("IOera");
//         dir.mkdir();
//         File fi = new File(dir, "Myfile.txt");
//         fi.createNewFile();
        
//         FileWriter fw = new FileWriter(fi);                     // neccesory to write this line...
//         BufferedWriter bfw = new BufferedWriter(fw);
//         bfw.write(121);
//         bfw.newLine();
//         bfw.write("pawan bisht");
//         bfw.newLine();
//         bfw.write(65);
//         bfw.close();
//         System.out.println("inserted......");
//     }
// }






// //....BufferedReader class.........have readLine() method...

// package IOOperation;
// import java.io.*;

// class FileHandling {
//     public static void main(String[] args) throws IOException {
//         File dir = new File("IOera");
//         dir.mkdir();
//         File fi = new File(dir, "Myfile.txt");
//         fi.createNewFile();
        
//         FileReader fr = new FileReader(fi);                     // neccesory to write this line...
//         BufferedReader bfr = new BufferedReader(fr);
        
//         String line = bfr.readLine();
//         while(line != null) {
//             System.out.println(line);
//             line = bfr.readLine();
//         }
//         bfr.close();
//     }
// }






//........PrintWriter class.........have println() method...

package IOOperation;
import java.io.*;

class FileHandling {
    public static void main(String[] args) throws IOException {
        File dir = new File("IOera");
        // dir.mkdir();
        File fi = new File(dir, "Myfile.txt");
        // fi.createNewFile();
        
        FileWriter fr = new FileWriter(fi);                     // neccesory to write this line...
        PrintWriter pr = new PrintWriter(fr);
        
        pr.println("Pawan");
        pr.println(97);
        pr.print(true);
        pr.println(34.3334);

        pr.close();
    }
}

