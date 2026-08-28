import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = input.nextInt();
       String day_name ="";
        switch(num) {
            case 1:
                day_name = "MONDAY";
                break;
            case 2:
                day_name = "TUESDAY";
                break;
            case 3:
                day_name = "WEDNESDAY";
                break;
            case 4:
                day_name = "THURSDAY";
                break;
            case 5:
                day_name = "FRIDAY";
                break;
            case 6:
                day_name = "SATURDAY";
                break;
            case 7:
                day_name = "SUNDAY";
                break;

        }
        System.out.println(day_name);
        input.close();

    }
}
