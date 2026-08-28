public class LinkedQueueOfStrings {
    private Node head;
    private Node tail;
    private int size;
    public static class Node{
        String item;
        Node next;
        public Node(String item){
            this.item = item;
            this.next = null;
        }
    }
    public LinkedQueueOfStrings() {
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public int size(){
        return size;
    }
    public void enqueue(String item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public String dequeue() {
        if (isEmpty()) {
            return null;
        }
        String item = head.item;
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
            return item;
        }
        public boolean contains(String item) {
        Node current = head;
        while (current != null) {
            if (current.item.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
        }
        public  String delete(String item) {
            if (isEmpty()) {
                return null;
                if (head.item.equals(item)) {
                    String temp = head.item;
                    head = head.next;
                    size--;
                    if (head == null) {
                        tail = null;
                        return temp;

                    }
                    Node current = head;
                    while (current.next != null) {
                        if (current.next.item.equals(item)) {
                            String temp = current.next.item;
                            current.next = current.next.next;
                            size--;
                            if (current.next == null)
                                return temp;
                        }
                        current = current.next;
                    }
                    return null;
                }

                if (isEmpty()) {
                    return null;
                }
            }
            private static void main (String[] args){
                LinkedQueueOfStrings queue = new LinkedQueueOfStrings();
                queue.enqueue("a");
                queue.enqueue("b");
                queue.enqueue("c");
                queue.enqueue("d");
                queue.enqueue("e");
                System.out.println(queue.contains("b")); // true
                System.out.println(queue.contains("x"));
                while (!queue.isEmpty()) {
                    System.out.println(queue.dequeue());
                }

            }

        }}
