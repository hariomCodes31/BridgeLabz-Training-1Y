import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Principal ");
    double p= sc.nextDouble();
    System.out.println("Enter Interest ");
    double r= sc.nextDouble();
    System.out.println("Enter time ");
    double t = sc.nextDouble(); 
    double si= (p*r*t) / 100;
    System.out.println("Simple Interest = " + si);
}
}
