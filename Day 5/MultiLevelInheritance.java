public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.weep();    // from Puppy
        p.bark();    // from Dog (parent)
        p.sleep();   // from Animal (grandparent)
    }
}

// Grandparent class
class Animal {
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Parent class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Child class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping...");
    }
}
