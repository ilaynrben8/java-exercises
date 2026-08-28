public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int count;
    public CircularQueue(int size){
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }
    public void enqueue(int value){
        if(rear == count){
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        count++;
    }
    public void dequeue(){
        if (count == 0){
            System.out.println("Queue is empty");
            return ;
        }
        front = (front + 1) % size;
        count--;
    }
    public int peek(){
        if (count == 0){
            System.out.println("Queue is empty");
        }
        return queue[front];
    }
    public void printQueue(){
        if (count == 0){
            System.out.println("Queue is empty");
            return;
        }
        for (int i =0; i <count ; i++){
            System.out.print(queue[(front+i) % size] + " ");
        }
        System.out.println();
    }
   public int getSize(){
        return count;
        }
    public static void main(String[] args){
        CircularQueue circularQueue = new CircularQueue(10);
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.printQueue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.enqueue(5);
        circularQueue.printQueue();
    }

}
