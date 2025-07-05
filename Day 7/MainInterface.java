public class MainInterface {
  public static void main(String[] args){
    Student s = new Student();
    s.run();
    s.sleep();
    s.eat();
    s.work();

  }
}
interface Human1{
  void run();
  void sleep();
}
interface Human2{
  void eat();
  void work();
  void sleep();

}

class Student implements Human1, Human2 {
  @Override
  public void run() {
    System.out.println("Student is running");
  }

  @Override
  public void sleep() {
    System.out.println("Student is sleeping");
  }

  @Override
  public void eat() {
    System.out.println("Student is eating");
  }

  @Override
  public void work() {
    System.out.println("Student is working");
  }
}