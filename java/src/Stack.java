public class Stack {
    private int[] stack;
    private int top;
    private int size;
    public Stack(int size) {
        this.top = -1;
        this.size = size;
        stack = new int[size];
    }
    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public void printStack(int data){
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for(int i=0;i<size;i++){
            System.out.println(stack[i]+" ");
        }
            System.out.println();
        }

    public static void main(String[] args) {
        Stack s=new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.peek());}
}
