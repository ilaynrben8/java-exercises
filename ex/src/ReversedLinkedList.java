public class ReversedLinkedList {

    // Her düğüm (node) yapısı
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Listeye eleman ekleme (sona ekler)
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Listeyi ters çevirme (reversed linked list)
    public void reverse() {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;   // sonraki düğümü kaydet
            current.next = prev;   // oku ters çevir
            prev = current;        // prev'i bir adım ilerlet
            current = next;        // current'i bir adım ilerlet
        }

        head = prev;  // yeni baş artık eski son
    }

    // Listeyi yazdırma
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Test
    public static void main(String[] args) {
        ReversedLinkedList list = new ReversedLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list:");
        list.printList();  // 1 2 3 4 5

        list.reverse();

        System.out.println("Reversed list:");
        list.printList();}}  // 5
