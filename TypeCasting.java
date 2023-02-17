//.....two type of type casting: implicit & explicit
//.....implicit:  double value1 = value2;
//......explicit:   int value1 = (int)value2;
public class TypeCasting {
    public static void main(String[] args) {
        int value = 2323;
        double value2;
        value2 = value;             //implisit type casting
        System.out.println(value2);

        double b = 121.2222;
        int a = (int)b;             //explicit type casting
        System.out.println(a);
    }
}
