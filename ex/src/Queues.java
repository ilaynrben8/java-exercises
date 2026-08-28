public class Queues {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
        private Node front;
        private Node rear;
        public Queues(){
            front = rear = null;
        }
        public void enqueue(int data){
            Node newNode = new Node(data);
            if(front == null){
                front = rear=newNode;
                return;
            }rear.next=newNode;
            rear=newNode;
    }
    public void dequeue(){
            if(front == null) throw new RuntimeException("Queue is empty");
            Node temp = front;
            front = front.next;
            if(rear== null){
                rear=null;
            }
    }
    public void printQueue(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
            Queues q = new Queues();
            q.enqueue(10);
            q.enqueue(20);
            q.enqueue(30);
            q.enqueue(40);
            q.enqueue(50);
            q.enqueue(60);
            q.dequeue();
            q.dequeue();
        q.dequeue();
        q.printQueue();









}}
