import java.util.Scanner;
class Perimeter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter the length");
        int l = sc.nextInt();
		System.out.println("enter the width");
        int w = sc.nextInt();
		
        int p = 2 * (l + w);
        System.out.println("the perimeter of rectangle "+p);
    }
}
