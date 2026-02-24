// Demonstrates use of static variables across objects
class Student {
    static String clg = "hicet";
    String name;
    static int count = 0;

    Student(String name) {
        this.name = name;
    }

    public void disp() {
        count++;
        System.out.println(name + "! Student @ " + clg);
    }

    public static void main(String[] args) {
        Student ob = new Student("CRK");
        ob.disp();
        System.out.println(count);
    }
}