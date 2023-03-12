import pw.skills.PackageFirst;

public class PackageSecond {
    public static void main(String[] args) {
        PackageFirst obj = new PackageFirst();
        
        System.out.println("Variable: "+obj.value);
        obj.msg();  //this function is inside pw->skills->PackageFirst.java
    }
}
