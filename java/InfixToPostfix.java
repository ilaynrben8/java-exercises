import java.util.Scanner;

public class InfixToPostfix {
    private String[] items ;
    private String infix;
    private String postfix;
    private int n;
    //constructor
    public InfixToPostfix(String infix, String postfix) {
        this.infix = infix;
        this.postfix = postfix;
        this.n = 0;
        items = new String[infix.length()];

    }
    public void push(String item) {
        items[n] = item;
        n++;

    }
    public String pop() {
        if (n == 0)
            return "";
        return items[--n];

    }
    public void convert() {
        postfix = ""; // start the postfix
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // if it is letter or number directly add the postfix
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch + " ";
            }
            // '('  pop it and add postfix until it ')' comes
            else if (ch == '(') {
                push("(");
            }
            // ')' pop it and add postfix until it '(' comes
            else if (ch == ')') {
                while (n > 0 && !items[n - 1].equals("(")) {
                    postfix += pop() + " ";
                }
                // '(' remove from stack
                if (n > 0 && items[n - 1].equals("(")) {
                    pop();
                }
            }
            // when operator comes
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (n > 0 && precedence(items[n - 1]) >= precedence(String.valueOf(ch))) {
                    postfix += pop() + " ";
                }
                push(String.valueOf(ch));
            }
        }

        // Add the remaining operators in the stack to postfix
        while (n > 0) {// pop remaining operators
            postfix += pop() + " ";
        }
    }

    // Helper method that returns operator precedence
    private int precedence(String op) {
        if (op.equals("*") || op.equals("/")) return 2;
        if (op.equals("+") || op.equals("-")) return 1;
        return 0; // '(' or other characters
    }
    public String getPostfix() {
        return postfix;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        InfixToPostfix converter= new InfixToPostfix(input, input);
        converter.convert();
        System.out.println("the postfix is: " +converter.getPostfix());


    }

}
