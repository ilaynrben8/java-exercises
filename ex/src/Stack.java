public class Stack {
    private Node head;
    private int size;
    public Stack() {
        head = null;
        size = 0;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    public int pop(){
        if (head == null) {
            System.out.println("Stack is empty");
        }
        int data = head.data;
        head = head.next;
        size--;
        return data;
    }
    public static void main(String[] args){
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
        System.out.println(stack.pop());
    }
}
