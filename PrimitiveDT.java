//....Whole number: byte, short, int, long.......
//....Real number: float, double...........
//.....Logical: boolean.........
//.......character: char.......

public class PrimitiveDT {
    public static void main(String[] args) {
        byte val = -123;
        System.out.println("val: "+ val);
        short val2 = 21131;
        System.out.println("val2: "+val2);
        int val3 = 232342222;
        System.out.println("val3: "+ val3);
        long val4 = -1212132323221199999l;              //put l in the end of integer... 
        System.out.println("val4: "+val4);

        float val5 = 56553.71912998898f;          //suffix f is mandatory...7 values take after dot
        System.out.println("val5: "+val5);
        double val6 = 9998.0123456789123456789;         //no suffix ....14 values can be happen after dot.
        System.out.println("val6: "+val6 );

        boolean val7 = true;
        System.out.println("val7: "+val7);

        char val8 = 'p';
        System.out.println("val8: "+val8);
    }
}
