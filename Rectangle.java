public class Rectangle {
    public static void main(String[] args) {
        
        double width = 5.5;
        double height = 8.5;

        double area = calculateRectangleArea(width, height);
        double perimeter = calculateRectanglePerimeter(width, height);

        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }
}
