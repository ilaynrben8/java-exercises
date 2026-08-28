public class Peek {
    private class Node{
        int data;
        Node next,prev;
    }
    private Node head;
    private int  size;
    public Peek() {
        head = null;
        size = 0;
    }
    public void Push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void Clear(){
       if(head == null) {
           System.out.println("stack is already empty");
           return;
       }else{
           head.prev = null;
           head.next = null;
           head = null;
           System.out.println("stack is cleared");
       }
    }
    public void printStack(){

        if (head == null){
            System.out.println("stack is already empty");
            return;
        }
          Node current= head;
          while(current.next!=null){
              System.out.println(current.data);
              current=current.next;

      }
    }
    public void Peeks(){
        if(head == null) {
            System.out.println("There is nothing to peek");
            return;
        } else{
            System.out.println("here is the top element:"+head.data);
        }}
        public static void main(String[] args){
        Peek p = new Peek();
        p.Push(10);
        p.Push(20);
        p.Push(30);
        p.Push(40);
        p.Push(50);
        p.Push(60);
        p.printStack();



    }
}
