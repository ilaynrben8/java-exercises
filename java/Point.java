public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public static double distanceTo(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));


    }
    public static void main(String[] args) {
        Point p1 = new Point(6, 0);
        Point p2 = new Point(0, 8);
        System.out.println(distanceTo(p1, p2));



    }

}
