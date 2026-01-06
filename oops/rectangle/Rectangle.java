package rectangle;

class Rectangle {
    private double length;
    private double width;
    private double area;

    public Rectangle() {
        length = 1.00;
        width = 1.00;
    }

    public Rectangle(double length , double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        area = length * width;
    }
   
    public void displayDetails() {
        System.out.printf("Length : %.2f\n", length);
        System.out.printf("Width : %.2f\n", width);
        System.out.printf("Area : %.2f\n", area);
    }
}