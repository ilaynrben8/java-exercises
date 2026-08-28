public class LinkedStackOfStrings {
    private Node head;
    private static class Node{
    String item;
   Node next;
   Node(String item){
        this.item=item;
        this.next=null;
    }}
    public void push(String item){
        Node newNode=new Node(item);
        newNode.next=head;
        head=newNode;
    }
    public String pop(){
        if(head==null) return null;
        String item=head.item;
        head=head.next;
        return item;
    }
    public boolean isEmpty(){
        return head==null;

    }
    public static void main(String[] args){
        LinkedStackOfStrings stack=new LinkedStackOfStrings();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        stack.push("f");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
