public class ConstructorChanning {
    public static void main(String[] args) {
        Three th = new Three();
    }   
}

class One {
    One() {
        System.out.println("Constructor of class One");
    }
}

class Two extends One {
    Two() {
        System.out.println("Constructor of class Two");
    }
}

class Three extends Two {
    Three() {
        this(4); 
        System.out.println("Constructor of class Three");
    }

    Three(int x) {
        System.out.println("Parameterized constructor of class Three with value: " + x);
    }
}