import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A -> Americano->$3.00 ");
        System.out.println("C ->Cappuccino->$3.75");
        System.out.println("L->Latte->$4.00");
        System.out.println( "E-> Espresso->$2.50");
        System.out.println("please enter a letter from menu");
        char choice = input.nextLine().toUpperCase().charAt(0);
        switch (choice) {
            case 'A':
                System.out.println("Americano $3.00");
                break;
                case 'C':
                    System.out.println("Cappuccino $3.75");
                    break;
                    case 'L':
                        System.out.println("Latte $4.00");
                        break;
                        case 'E':
                            System.out.println("Espresso $2.50");

                            break;
                            default:
                                System.out.println("Invalid choice");

        }

        System.out.println(choice);

    }
}
