public class Polymorphism {
    public static void main(String[] args) {
        Add poly = new Add();
        System.out.println("Sum of 2 integers: " + poly.add(5, 10));
        System.out.println("Sum of 3 integers: " + poly.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + poly.add(5.5, 10.5));
        System.out.println("Sum of 3 doubles: " + poly.add(5.5, 10.5, 15.5));
    }
}

class Add{
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }
}
