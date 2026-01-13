import java.util.Scanner;
class CelsiusToFahrenheit{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the temperature in celcius");
double t =sc.nextDouble();
double f=(t* 9/5)+32;
System.out.println("temperature in ferhrenheit is "+f);
}
}
