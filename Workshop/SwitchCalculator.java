import java.util.Scanner;
class SwitchCalculator{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("choose the first number");
int a= sc.nextInt();
System.out.println("choose the second number");
int b= sc.nextInt();
System.out.println("choose the operation +,-,*,/");
char ch= sc.next().charAt(0);
switch(ch){
case '+':
int sum =a+b;
System.out.println("the sum is "+sum);
break;
case '-':
int sub =a-b;
System.out.println("the difference is "+sub);
break;
case '*':
int mul =a*b;
System.out.println("the product is "+mul);
break;
case '/':
double div=a/b;
System.out.printf("the the quotient is %.2f"+div);
break;
default:
System.out.println("invalid input");
}
}
}