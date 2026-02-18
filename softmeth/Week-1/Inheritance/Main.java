class Main {
    public static void main(String[] args) {
        Point p3 = new ColoredPoint(2, 3, "red");
        System.out.println(p3);
        // System.out.print(p3.getColor()); // this will not compile 
    }
}

class Point {
    int x, y;
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public String toString() {
        return x + "," + y;
    }
}

class ColoredPoint extends Point {
    String color;
    ColoredPoint (int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public String toString() {
        return super.toString() + "," + color;
    }
}