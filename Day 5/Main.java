class Student {
    // Step 1: Private data members
    private String name;
    private int age;

    // Step 2: Public getter for 'name'
    public String getName() {
        return name;
    }

    // Step 3: Public setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        if (age > 0) { // validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values using setter methods
        s1.setName("Rahul");
        s1.setAge(20);

        // Getting values using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
