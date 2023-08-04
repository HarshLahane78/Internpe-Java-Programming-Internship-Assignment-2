public class Circle {
    public static void main(String[] args) {
    
        double radius = 7.5;

        double area = calculateCircleArea(radius);
        double perimeter = calculateCirclePerimeter(radius);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
}
