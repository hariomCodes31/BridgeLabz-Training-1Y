import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        double a = sc.nextDouble();
		System.out.println("enter b");
        double b = sc.nextDouble();
		System.out.println("enter c");
        double c = sc.nextDouble();

        double av = (a + b + c) / 3;

        System.out.println("the average "+av);
    }
}
