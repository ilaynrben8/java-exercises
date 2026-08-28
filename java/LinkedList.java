public class LinkedList {
   Node head;
   int data;
   int size;
   LinkedList(){
   this.head=null;
   this.size=0;
   }
   public void addFirst(int data){
       Node newNode =new Node(data);
       newNode.next=head;
       head=newNode;
   size++;
   }
   public void addaLast(int data) {
       Node newNode = new Node(data);
       if(head == null){
           head = newNode;
           size++;return;}
       Node current = head;
       while (current.next != null) {
           current = current.next;
       }
       current.next=newNode;
       size++;
   }
   public void removeFirst(){
       if (head==null){
           System.out.println("empty");
           return;
       }
       head=head.next;
       size--;


    }
    public void removeLast() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;


    }
    public void printList(){
       if(head==null){
           System.out.println("empty");
           return;
       }
       Node current=head;
       while(current!=null){
           System.out.println(current.data+" -> ");
           current=current.next;
           }
        System.out.println("null");
       }
       public void reversed(){
       if(head==null){
           System.out.println("empty!");
           return;
       }
       Node current=head;
       Node prev=null;
       Node next=null;
       while(current!=null) {
           next = current.next;
           current.next = prev;
           prev = current;
           current =next;
       }
       head=prev;
       }
    }


