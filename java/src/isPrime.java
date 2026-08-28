import java.util.Scanner;


public class isPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is prime number");
        } else {
            System.out.println(n + " is not prime number.");
        }

        input.close();

                }}






