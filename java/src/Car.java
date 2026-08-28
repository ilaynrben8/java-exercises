enum FuelType{GASOLINE,DIESEL,ELECTRIC}
public class Car {


        String brand;
        String model;
        int year;
        Engine engine= new Engine(200);
        public void displayInfo () {
            System.out.println("BRAND:" + brand + "\nMODEL:" + model + "\nYEAR:" + year);
            engine.showPower();
            switch(FuelType.GASOLINE) {
                case GASOLINE:
                    System.out.println("GASOLINE traditional engine");
                    break;
                    case DIESEL:
                        System.out.println("DIESEL powerfull but less eco-friendly");
                        break;
                        case ELECTRIC:
                            System.out.println("ELECTRIC eco-friendly and quite");
                            break;
                            default:
            }

        }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand="mercedes";
        c1.model="benz";
        c1.year=2020;
        c1.displayInfo();
    }}
