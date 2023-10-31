/*
 * Exception handing (try-catch)
 * throw, throws
 * Custom exception
 * ingection
*/
import java.util.Scanner;

class MyException extends Exception {           //.........custom exception.......
    MyException() {
        System.out.println("Account not Exist......try again...........");
    }
}

class User {
    String name = "Pawan Bisht";            //....In database...
    long password = 122334;

    String uName;
    int uPassword;
    
    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter User Name: ");
        uName = scan.nextLine();
        System.out.println("Enter Password Number: ");
        uPassword = scan.nextInt();
    }

    void validation() throws ArithmeticException, IndexOutOfBoundsException, NullPointerException, Exception {
        if(uName.equalsIgnoreCase(name) &&  (password==uPassword)){
            System.out.println("WELCOME "+name+" to your Account.......");
        }
        else {
            // System.out.println("Account Not Exist..");
            MyException ob = new MyException();         //.....custom exception.....
            throw ob;
            // throw new MyException();                             //........or.....
        }
    }
}


class FaceBook {
    void checking() {
        User object = new User();               //...ingection.....
        object.input();
        try {                                           //throw exception here........ 
            object.validation();
        } 
        catch (Exception e) {
            try {
                object.input();
                object.validation();
            } 
            catch (Exception ee) {
                try {
                    object.input();
                    object.validation();
                } 
                catch (Exception eee) {
                    System.out.println("....You have only 3 trial....");
                }
            }
        }
    }
}

public class FacebookLogin {
    public static void main(String[] args) {
        FaceBook obj = new FaceBook();
        obj.checking();
    }
}
