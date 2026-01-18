import java.util.Scanner;

public class FeeDiscountInput {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	     System.out.println("enter fee");
         double fee= sc.nextDouble();
		 System.out.println("discount percent");
         double dp= sc.nextDouble();

        double dis = (fee * dp) / 100;
        double finalFee = fee - dis;

        System.out.println("The discount amount is INR " + dis +" and final discounted fee is INR " + finalFee);

        
    }
}
