public class Lifo {
    private int[] stack;
    private int head;
    private int size;

public Lifo(int size){
    this.size=size;
    this.stack=new int[size];
    this.head=-1;
}
public void push(int value){
    if(head==size-1) {
        System.out.println("Stack overflow");
        return;
    }
    stack[++head]=value;
}
public int pop(){
if(head==-1) {
    System.out.println("Stack underflow");
    return -1;
}
int value=stack[head--];
return value;

}
public int peek(){
if(head==-1) {
    System.out.println("Stack underflow");
    return -1;
}
return stack[head];
}
public boolean isEmpty(){
    return head==-1;
    }
    public boolean isFull(){
    return head==size-1;
    }
    public void printStack(){
    if(isEmpty()){
        System.out.println("Stack is empty");
        return;
    }
    for(int i=0;i<size;i++){
        System.out.print(stack[i]+" ");
    }
        System.out.println();
    }


public static void main(String[] args) {
    Lifo stack=new Lifo(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.push(40);
stack.peek();
stack.printStack();
stack.pop();


}}