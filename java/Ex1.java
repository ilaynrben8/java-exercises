public class Ex1 {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }}
    private Node head;
        private int[] stack;
    private int size;
    public  Ex1(){
        head = null;
        size = 0;

    }
        public void push(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
            }


        public int pop() {
            if (head == null) {
                System.out.println("Empty Stack");;
            }
                int popped = head.data;
                head = head.next;
                size--;
                return popped;
            }
        public int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;

        }public boolean isEmpty(){
       return head == null;
        }public void printStack(){
        if(head==null){
            System.out.println("stack is empty");
            return;
        }Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
        }public void reverseStack(){
        Ex1 temp =new Ex1();
        while(!isEmpty()) {
            temp.push(pop());
        }
        head=temp.head;
        }
        public static void main(String[] args){
        Ex1 test = new Ex1();
        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);
        test.printStack();
       test.reverseStack();
       test.printStack();

        }



}
