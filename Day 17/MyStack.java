public class MyStack {
    int[] arr;
    int top;
    int capacity;

    public MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }
    void push(int data) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack is full");
        }
        top++;
        arr[top] = data;
    }
    void pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        top--;
    }
    int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }
    int size() {
        return top + 1;
    }
    boolean isEmpty() {
        return top == -1;
    }

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
