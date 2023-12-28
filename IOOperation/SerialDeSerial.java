//....Serialization...............

package IOOperation;
import java.io.*;

class Demo implements Serializable{
    private int a;
    private String name;
    
    public Demo(int a, String name) {
        this.a = a;
        this.name = name;
    }
}

public class SerialDeSerial {
    public static void main(String[] args) throws Exception {
        Demo obj = new Demo(12, "Harry");

        // File dir = new File("IOera");
        // dir.mkdir();
        // File fi = new File(dir, "MyFile.txt");
        // fi.createNewFile();

        FileOutputStream fos = new FileOutputStream("..MyFile.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(obj);
        oos.flush();
        oos.close();
        System.out.println("Done our work");

    }
}






// //..........De-Seriablization.........

// package IOOperation;
// import java.io.*;

// class Demo implements Serializable{
//     private int a;
//     private String name;
    
//     public Demo(int a, String name) {
//         this.a = a;
//         this.name = name;
//     }
//     public void dis() {
//         System.out.println("a: "+a+"\nname: "+name);
//     }
// }

// public class SerialDeSerial {
//     public static void main(String[] args) throws Exception {
//         // Demo obj = new Demo(12, "Harry");
//         // obj.dis();

//         FileInputStream fis = new FileInputStream("MyFile.txt");
//         BufferedInputStream bis = new BufferedInputStream(fis);
//         ObjectInputStream ois = new ObjectInputStream(bis);
//         Demo dm = (Demo)ois.readObject();                               // comes as a object.
//         dm.dis();
        
//         ois.close();
//     }
// }




