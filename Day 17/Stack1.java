public class Stack1 {
    public static void main(String[] args) {
        MyStack a = new MyStack(5);
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);

        System.out.println("Top element is: " + a.peek()); 
        System.out.println("Stack size is: " + a.size()); 
        a.pop();
        System.out.println("Top element after pop is: " + a.peek()); 
        System.out.println("Is stack empty? " + a.isEmpty()); 
        a.pop();
        System.out.println("Is stack empty after popping all elements? " + a.isEmpty()); 
    }
    
}
