import java.util.Scanner;
import java.util.ArrayList;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many numbers will you enter ");
        int N = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.print((i + 1) + "enter a number ");
            int number = sc.nextInt();
            numbers.add(number);
        }

        double sum= 0;
        for (int number : numbers) {
            sum +=number;
        }
        double avr = sum / N;

        System.out.println("\nAverage: " + avr);
        System.out.println("the numbers which is bigger than average:");

        for (int number : numbers) {
            if (number > avr) {
                System.out.println(number);
            }
        }

        sc.close();
    }
}




