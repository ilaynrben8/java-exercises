public class MyStack {
    Node head;
    Node middle;
    int size;
//constructor
    MyStack() {
        head = null;
        middle = null;
        size = 0;
    }

    // ADD ELEMENT TO THE STACK (LIFO - Last-In, First-Out)
    void push(int data) {
        Node newNode = new Node(data);//bellekte yeni data oluşturur
        newNode.next = head;
        if (head != null) { // update the head because new element added
            head.prev = newNode;//yeni düğüm eski head in üstüne eklenir
        }
        head = newNode;
        size++; // update the size

        if (size == 1) {
            middle = newNode;
        } else if (size % 2 != 0) { // odd size
            middle = middle.prev; // update the middle to previous
        }
    }

    // DELETE ELEMENT
    int pop() {
        if (size == 0) return -1;

        int val = head.data;//silinen elemanın değierini al
        head = head.next;//tepeyi bir aşağıya kaydır

        if (head != null) head.prev = null; // delete the connection
        size--; // update the size

        if (size % 2 == 0 && middle != null) { // even size after pop
            middle = middle.next; }
    return val;}
        public static void main(String[] args){
            MyStack myStack = new MyStack();//Yeni bir yığın(stack) nesnesini oluşturur
            myStack.push(1);
            myStack.push(2);
            myStack.push(3);
            myStack.push(4);
            myStack.push(5);
            myStack.push(6);
            myStack.push(7);
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println("middle element:"+myStack.middle.data);

            myStack.push(4);
            myStack.push(5);
            myStack.push(6);
            System.out.println("new middle element:"+myStack.middle.data);

        }

        }



