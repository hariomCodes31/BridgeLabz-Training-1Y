import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter base in inches");
        double b = sc.nextDouble();

        System.out.println("enter height in inches");
        double h = sc.nextDouble();

        double aIn = 0.5 * b * h;
        double aCm = aIn * 6.4516;

        System.out.println(
            "Area of triangle is " + aIn + " square inches and " + aCm + " square centimeters"
        );
    }
}
