public class SimpleQueue {
    // İç sınıf: Düğümleri (Node) tanımlar
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; // Kuyruğun başı (ilk eleman)
    private Node rear;  // Kuyruğun sonu (son eklenen eleman)

    // Kuyruğun başlangıç durumu
    public SimpleQueue() {
        front = null;
        rear = null;
    }
    // peek metodu
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        }
        return front.data; // front'taki elemanı döndür
    }
    public boolean isEmpty() {
        return front == null;
    }


    // Ekleme işlemi (enqueue)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) { // Eğer kuyruk boşsa
            front = rear = newNode;
            return;
        }
        rear.next = newNode; // Eski son elemanın next'i yeni eleman olur
        rear = newNode;      // Yeni eleman artık son olur
    }

    // Çıkarma işlemi (dequeue)
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Dequeued!"+front.data);
        front = front.next;
        // İlk elemanı sil
        if (front == null) { // Eğer kuyruk boşaldıysa rear da null olmalı
            rear = null;
        }
    }

    // Kuyruğu yazdır
    public void printQueue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }
        Node current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Test
    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.printQueue();


        System.out.println(q.peek());

    }
}

