//.....constructor chaining achieve by this() method..
//.....constructor overloading is must......

public class ConstructerChain {
    private int age;
    private String name;

    ConstructerChain() {
        this(99);
        System.out.println("constructoe 1 "+age+" "+name);
    }
    ConstructerChain(int a) {
        this(22, "Pawan");
        age = a;
        System.out.println("constructor 2 "+age+" "+name);
    }
    ConstructerChain(int a, String n) {
        age = a;
        name = n;
        System.out.println("constructor 3 "+age+" "+name);
    }
    public static void main(String[] args) {
        ConstructerChain obj = new ConstructerChain();              //.....calling no arg constructor....
    }
}
