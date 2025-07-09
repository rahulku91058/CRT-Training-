@FunctionalInterface
interface A{
    void print();
}

class B implements A {
    public void print() {
        System.out.println("Hello from B");
    }
}

public class LambdaExample2 {
    public static void main(String[] args) {
            A a = new B();
            a.print();
    }
}

