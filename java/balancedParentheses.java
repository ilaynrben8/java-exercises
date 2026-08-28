import java.util.Scanner;

public class balancedParentheses {
    private char[] items ;//array to store stac elements
    private int n;
    public void stack(int size){
        items = new char[size];
        n = 0 ;
    }
    public void push(char ch){
       if(n == items.length){
           System.out.println("stack overflow");
           return;}
           items[n]=ch;// Add the character to the stack
           n++;

       }
       public char pop(){
        if(n == 0) {
            System.out.println("stack underflow");
            return '\0';
        }
        n--;
        return items[n];// Return the top element
        }
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        balancedParentheses bp = new balancedParentheses();// Initialize stack with the length of the input string"""""
        bp.stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                bp.push(')');
            } else if (ch == '{') {
                bp.push('}');
            } else if (ch == '[') {
                bp.push(']');
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (bp.n==0 || bp.pop() != ch) {
                    System.out.println("parentheses are not balanced");
                    return;
                }}}
        if(bp.n==0) {
            System.out.println("parentheses are balanced");
        }else{
            System.out.println("parentheses are not balanced");


        }
        }




}
