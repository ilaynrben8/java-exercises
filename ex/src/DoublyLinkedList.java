public class DoublyLinkedList {

    // İç sınıf: Node (düğüm)
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int size;

    // Yapıcı (constructor)
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // 🔹 Başa eleman ekleme
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) { // Liste boşsa
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // 🔹 Sona eleman ekleme
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) { // Liste boşsa
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // 🔹 Belirli bir elemandan sonra ekleme
    public void addAfter(int target, int data) {
        Node current = head;
        while (current != null && current.data != target) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Eleman bulunamadı!");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null)
            current.next.prev = newNode;
        else
            tail = newNode;

        current.next = newNode;
        size++;
    }

    // 🔹 Eleman silme
    public void delete(int data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Silinecek eleman bulunamadı!");
            return;
        }
        if (current.prev != null)
            current.prev.next = current.next;
        else
            head = current.next; // baştaki siliniyorsa
        if (current.next != null)
            current.next.prev = current.prev;
        else
            tail = current.prev; // sondaki siliniyorsa

        size--;
    }

    // 🔹 Listeyi ters çevirme
    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    // 🔹 Baştan sona yazdırma
    public void printForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 🔹 Sondan başa yazdırma
    public void printBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // 🔹 Eleman sayısı
    public int size() {
        return size;
    }

    // 🔹 Test metodu
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.addAfter(20, 25);

        list.printForward();   // Forward: 5 10 20 25 30
        list.printBackward();  // Backward: 30 25 20 10 5
        System.out.println("Size: " + list.size()); // 5

        System.out.println("Deleting 10...");
        list.delete(20);

        list.printForward();   // Forward: 5 20 25 30
        list.printBackward();  // Backward: 30 25 20 5

        System.out.println("Reversing list...");
        list.reverse();

        list.printForward();   // Forward: 30 25 20 5
        list.printBackward();  // Backward: 5 20 25 30
    }
}
