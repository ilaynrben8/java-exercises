public class CircularQueue {
   private int[] queue;
   private int front;
   private int rear;
   private int size;
   private int count;
   public CircularQueue(int size) {
       this.size = size;
       queue = new int[size];
       front = 0;
       rear = -1;
       count = 0;
   }
       public void enqueue(int size){
           if(count == size)throw new RuntimeException("Queue is full");
           rear = (rear + 1) % size;
           queue[rear] = size;
           count++;
   }
   public void dequeue(){
       if(count == 0)throw new RuntimeException("Queue is empty");
       front = (front + 1) % size;
       count++;
       System.out.println(queue[front]);
       }
       public void printQueue(){
       if(count == 0)throw new RuntimeException("Queue is empty");
       for( int i = front; i != rear; i = (i + 1) % size){
           System.out.println(queue[i]);
       }
       }
       public static void main(String[] args) {
       CircularQueue q = new CircularQueue(10);
       q.enqueue(10);
       q.enqueue(20);
       q.enqueue(30);
       q.enqueue(40);
       q.enqueue(50);
       q.enqueue(60);
       q.dequeue();
       q.printQueue();
       q.dequeue();
       }
   }

