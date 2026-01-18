import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double ft = sc.nextDouble();

        double yd = ft / 3;
        double mi = yd / 1760;

        System.out.println(
            "The distance in yards is " + yd + " and in miles is " + mi
        );

        
    }
}
