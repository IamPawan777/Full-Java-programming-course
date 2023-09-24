class Encapsulation {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
            this.age = age;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation ob = new Encapsulation();
        ob.setAge(12);
        System.out.println("age: "+ob.getAge());
        ob.setName("Hariom");
        System.out.println("Name: "+ob.getName());

    }
}
