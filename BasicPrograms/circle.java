import java.util.Scanner;
class circle{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius");
double r= sc.nextDouble();
double a= (22.0/7)*r*r;
System.out.printf("the area is %.2f ",a);
}
}
