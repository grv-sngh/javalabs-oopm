public class Circle {
    final static double PI = 3.1415926535898;
    double radius = 1;

    public Circle(double r) {
        radius = r;
    }

    public static double area(double r) {
        double area = PI * r * r;
        return area;
    }

    public static double circumference(double r) {
        double circum = 2 * PI * r;
        return circum;
    }

    public static void main(String[] args) {
        // Creating a Circle Object
        Circle myCircle = new Circle(5);
        double radius = myCircle.radius;
        double area = Circle.area(myCircle.radius);
        double circumference = Circle.circumference(myCircle.radius);

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
