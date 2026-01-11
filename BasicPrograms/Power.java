import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        double b = sc.nextDouble();
		System.out.println("enter exponent");
        double e = sc.nextDouble();
        double p =Math.pow(b, e);
        System.out.println("the result ="+p);
    }
}
