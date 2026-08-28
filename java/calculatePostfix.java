public class calculatePostfix {
    private double[] items;
    private String postfix;
    private int n;

    public calculatePostfix(int size) {
        items = new double[size];
        n = 0;

    }

    public void push(double value) {
        if (n == items.length) {
            System.out.println("stack overflow");
            return;
        }
    items[n]=value;
    n++;

}
        public  double pop() {
          if(n==0) {
        System.out.println("stack underflow");
        return 0;
    }
    n--;
    return items[n];
    }
    public double evaluate(String postfix) {
        String[] tokens = postfix.split(" ");
        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))) {
                push(Double.parseDouble(token));
            } else {
                double b = pop();
                double a = pop();
                switch (token) {
                    case "+":
                        push(a + b);
                        break;
                    case "-":
                        push(a - b);
                        break;
                    case "*":
                        push(a * b);
                        break;
                    case "/":
                        push(a / b);
                        break;
                }
            }
        }
        return pop();
    }}

public  void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements you want to enter");
    int n = sc.nextInt();
    sc.nextLine();
    calculatePostfix cp = new calculatePostfix(n);

    System.out.println("please enter a postfix expression");
    String postfix = sc.nextLine();
    double result = cp.evaluate(postfix);
    System.out.println(result);


}

