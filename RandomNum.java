import java.util.Random;
public class RandomNum {
    public static void main(String[] args) {
        Random r = new Random();
        
        int a = r.nextInt();             // - infinite to + infinite
        int bb = r.nextInt();             // 0 to 99
        int b = r.nextInt(100, 120);             // 100 to 119;
        System.out.println(a +" "+bb+" "+b);

        boolean c = r.nextBoolean();                    //true and false
        System.out.println(c);

        double d = r.nextDouble();              // 0.0 to before 1.0        
        double dd = r.nextDouble(2,6);              // 2.0 to before 6.0
        System.out.println(d+" "+dd);


        char e = (char)(r.nextInt(26)+'A');
        System.out.println(e);

    }
}
