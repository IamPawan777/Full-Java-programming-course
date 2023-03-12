public class Constructor {
    int a, b;                   //globle data
    Constructor(int x, int y) {
        a = x;
        b = y;
        System.out.println("initianted..");
    }
    int sum() {
        return (a+b);
    }
    float sub() {
        float ans = a-b;
        return ans;
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor(3,4);

        System.out.println("sum: "+obj.sum());
        System.out.println("sub: "+obj.sub());
    }
}
