// enum Month {
//     JAN, FAB, MAR, APRI, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;
// }
// public class EnumCon {
//     public static void main(String[] args) {
//        Month m = Month.FAB;
//        System.out.println(m);
//     }
// }





// ......values(): return values of enum, ordinal(): return index of enum.........

public class EnumCon {
    enum Position {
        PASS,  FAIL, NONE;
    }
    public static void main(String[] args) {
       Position m = Position.FAIL;

       Position[] p = m.values();
       for(Position x : p){
        System.out.println(x+": "+x.ordinal());
       }
    }
}




