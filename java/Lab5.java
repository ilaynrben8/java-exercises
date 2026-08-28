public class Lab5 {
    private Node head;
    private int size;
    private Node middle;
    public Lab5(){
        head = null;
        middle = null;
        size = 0;

    }
    public void push(String item){
       Node newNode =new Node(item);
       newNode.next=head;
       head=newNode;
        }
        public String pop(){
        if(head==null)return null;
        head=head.next;
        middle=middle.next;
        size--;
        return middle.item;
        }
    }
    public  void main(String[] args) {
    Lab5 stack=new Lab5();
    stack.push("a");
    stack.push("b");
    stack.push("c");
        System.out.println(stack.pop());
    }


