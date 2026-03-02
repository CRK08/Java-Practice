// Demonstrates non-parameterized constructor for factorial calculation
class Factorial {
    int n, fact;

    public Factorial() {
        fact = 1;
        n = 5;
    }

    public void calc() {
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial : " + fact);
    }
}

class FactorialNonPara {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.calc();
    }
}