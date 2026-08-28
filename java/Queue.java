public class Queue {
    private int[] items;//array to store queue elements
    private int front;//index of the front element
    private int rear;//index of the rear element
    private int size;
    private int count;//current number of elements in the queue
//constructor to initialize the queue
    public Queue(int size) {
        items = new int[size];//create an array with gven size
        this.size = size;//store the maximum size
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;}
            rear=(rear+1)%size;//move rear forward circularly
            items[rear] = item;//add the new element at the rear
            count++;
            System.out.println(items[rear]);


    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = items[front];
        front = (front + 1) % size;// Move front forward circularly
        count--;
        System.out.println(items[front]);
        return item;

    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == size);
    }

    public int size() {// Get the current number of elements
        return count;
    } public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Removed: " + q.dequeue());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
    }}
//Dikkat edilmesi gereken noktalar / yaygın hatalar
//rear başlangıç değeri -1 olmalı; böylece ilk eklemede (rear+1)%size doğru 0 verir.
//front başlangıçta 0 olmalı.
//dequeue() yaparken önce item = items[front] al, sonra front = (front+1)%size. Eğer önce front değiştirirsen geri döndürülen değeri kaybedersin.
//count'ı güncellemeyi unutma — boş/dolu kontrolü için önemli (isEmpty(), isFull() doğru çalışsın).
//java’da negatif modulo sonucu negatif olabilir ama bizim rear+1 veya front+1 her zaman >= 0 olduğu için sorun yaşamıyoruz.
