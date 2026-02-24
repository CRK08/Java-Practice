// Demonstrates static block initialization and object count
class Exam {
    static int count;
    static {
        count = 0;
        System.out.println("Initialized");
    }
    Exam() {
        count = count + 1;
    }
    public static void disp() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("Standard");
        Exam obj1 = new Exam();
        Exam obj2 = new Exam();
        Exam obj3 = new Exam();
        Exam.disp();
    }
}