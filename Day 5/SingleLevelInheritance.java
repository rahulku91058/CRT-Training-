public class SingleLevelInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();   // call Dog class method
        d1.sleep();  // call Animal class method (inherited)
    }
}

// Parent class (Super class)
class Animal {
    void sleep() {
        System.out.println("Animal is Sleeping");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is Barking");
    }
}
