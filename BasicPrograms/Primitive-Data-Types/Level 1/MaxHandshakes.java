import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of students");
        int n = sc.nextInt();
        int h = n * (n - 1) / 2;
        System.out.println("Maximum number of handshakes: " + h);
    }
}
