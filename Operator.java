public class Operator {
    void arthematic() {
        int a = 20, b = 10;
        System.out.println("Sum: "+ (a + b));
        System.out.println("devi: "+ (a / b));  
    }

    void assignment(int x) {
        int m = 2;
        m *= x;         //assignment
        System.out.println("m value: "+m);
    }

    static void logicalAndRelation() {
        int a = 10, b = 20, c = 30;
        if(b==2*a && a!=c ||  a>=c)
            System.out.println("Right answer");
        else
            System.out.println("Wrong answer");
    }

    void relational()
    {
        int a=10, b=10;
        System.out.println(a<=b);           //return boolean
        System.out.println(a<b);
    }

    void ternaryOpe(int p, int q, int r) 
    {
        int sNum = (p<q)? ((p<r)? p:q):((q<r)? q:r);       //focused on smaller values          
        System.out.println(sNum);
    }

    
    public static void main(String[] args) {
        Operator obj = new Operator();
        obj.arthematic();
        obj.assignment(12);
        logicalAndRelation();
        obj.relational();
        obj.ternaryOpe(5,2,7 );
    }
}