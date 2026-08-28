import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class FixedCapacityStackOfStrings {
    private String[] items;//array to store the stack items
    private int n;//variable to keep track of the number of elements in stack
    //constructor:creates a stack with a fixed capacity(size)
    public FixedCapacityStackOfStrings(int size){
        items = new String[size];//initialize the array with given size
        n = 0;}//initially stack is empty
    public void push(String item){//adds an element to the top of the stack

        if(n==items.length){
            System.out.println("stack is full");
        }else{
            items[n] = item;  // Place item on top of the stack
            n++;
        }}
public String  pop() {// removes and return the top element of the stack
    if (n == 0) {
        System.out.println("stack is empty");
        return null;
    } else {// Decrease count to move down one position
        n--;
        String item = items[n];//get the top element
        items[n] = null;
        return item;
    }}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack" );
        int size = sc.nextInt();
        FixedCapacityStackOfStrings stack = new FixedCapacityStackOfStrings(size);// Create a stack object with the given size
        for(int i = 0; i < size; i++) {
            System.out.println("Enter the string #" + (i + 1) + ": ");
            String str = sc.next();
            stack.push(str);
        }
        System.out.println("\nPopping all elements:");
        for(int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }

    }



}