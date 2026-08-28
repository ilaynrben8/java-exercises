public class StaticLifeTime {
    static int static_variable_counter = 0;
    public void increament() {
        static_variable_counter++;
        System.out.println("Static variable counter: " + static_variable_counter);

    }

    public static void main(String[] args) {
        StaticLifeTime obj = new StaticLifeTime();
        obj.increament();
        StaticLifeTime obj2 = new StaticLifeTime();
        obj2.increament();


    }
}
