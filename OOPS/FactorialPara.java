// Demonstrates parameterized constructor for factorial calculation
class Factorial {
    int n, fact;

    public Factorial(int n) {
        this.n = n; 
        fact = 1;
    }

    public void calc() {
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial : " + fact);
    }
}

class FactorialPara {
    public static void main(String[] args) {
        int n = 6;
        Factorial obj = new Factorial(n);
        obj.calc();
    }
}