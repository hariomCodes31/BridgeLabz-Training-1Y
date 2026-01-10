import java.util.Scanner;
class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius");
        double r= sc.nextDouble();
		System.out.print("Enter the height");
        double h= sc.nextDouble();
        double v= (22.0/7)*r*r*h;
        System.out.printf("Volume of the cylinder = %.2f",v);
    }
}
