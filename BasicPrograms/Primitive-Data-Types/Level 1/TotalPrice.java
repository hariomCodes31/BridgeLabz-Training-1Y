import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter unit price");
        int u = sc.nextInt();

        System.out.println("enter quantity");
        int q = sc.nextInt();

        int t = u * q;

        System.out.println(
            "The total purchase price is INR " + t +
            " if the quantity " + q +
            " and unit price is INR " + u
        );
    }
}
