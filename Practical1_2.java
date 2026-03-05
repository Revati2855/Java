import java.util.Scanner;

class Area {
    double length;
    double breadth;

    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    double getArea() {
        return length * breadth;
    }
}

public class Practical1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rectangle = new Area();

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        rectangle.setDim(l, b);

        System.out.println("Area of rectangle = " + rectangle.getArea());
    }
}
