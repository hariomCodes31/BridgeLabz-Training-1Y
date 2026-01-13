import java.util.Scanner;
class KmToMiles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the distance in km");
        double km = sc.nextDouble();
        double m = km * 0.621371;
        System.out.println("distance in miles "+m);
    }
}
