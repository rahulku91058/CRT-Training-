public class Test {
    public static void main(String[] args){
        Student st = new Student();
        Student st1 = new Student("John Doe", 20);
        st.print();
        st1.print();
    }
}

class Student{
    private String name;
    private int age;

    Student() {
        System.out.println("This is default constructor of Student class");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
