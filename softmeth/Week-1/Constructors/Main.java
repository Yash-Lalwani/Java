public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Point p = new Point(3, 5);

        System.out.println("Value of x cordinate of the point: " + p.x);
        System.out.println("Value of y cordinate of the point: " + p.y);
    }
}

class Point {
    static final int X_MAX = 800;
    static final int Y_MAX = 800;

    int x, y;

    public Point(int x, int y) {
        if (x<0 || x>X_MAX || y<0 || y>Y_MAX) {
            throw new IllegalArgumentException("Invalid value of x or y");
        }
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }
}
