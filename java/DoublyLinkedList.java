public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;
    DoublyLinkedList(){
        head=null;
       tail=null;
       size=0;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
        head=tail=newNode;
        size++;
        return;
        }else{
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    size++;
}
public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
 else{
     newNode.prev=tail;
     tail.next=newNode;
     tail=newNode;
     }
 size++;
        }
        public void removeFirst() {
            if (head == null) {
                System.out.println("empty");
                return;
            }
            if (head==tail){
                head=tail=null;

            }else {
                head = head.next;
                head.prev = null;
            }

            size--;
        }
        public void removeLast(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
size--;
        }
        public void printList(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" <-> ");
            current=current.next;
        }
            System.out.println("null");
        }
        public void reversedL(){
        if (head==null){
            System.out.println("empty");
            return;
        }
        Node current=head;
        Node temp=null;

        while(current!=null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if(temp!=null){
            tail=head;
            head=temp.prev;
        }
        }
}



