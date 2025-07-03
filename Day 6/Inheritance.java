public class Inheritance {
    public static void main(String[] args) {
        demo3 obj = new demo3();
    }
}

class demo{
    demo() {
        System.out.println("Constructor of demo class");
    }
}

class demo2 extends demo {
    demo2() {
        System.out.println("Constructor of demo2 class");
    }
}

class demo3 extends demo2 {

}
