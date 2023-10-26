import java.util.Scanner;

public class RectangleArea {
    private double length;

    private double width;

    private double area;

    public void getData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lenght of the rectangle");
        length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle");
        width = scanner.nextDouble();
        scanner.close();
    }
    public void Area(){
        area = length * width;
    }

    public void displayInfo(){
        System.out.println("Rectangle Information");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }
}
