import java.util.Scanner;
class KmToMilesInput{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the distance in km");
double km= sc.nextDouble();
 double mi = km / 1.6;
 System.out.println("The total miles is " + mi + " mile for the given " + km + " km");
 }}
 