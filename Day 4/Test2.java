public class Test2 {
    public static void main(String[] args){
        Student st = new Student();

    }
}

class Student{
    static {
        System.out.println("This is Static Block");
    
    }

    Student() {
        System.out.println("This is default constructor of Student class");
    }

    
}

