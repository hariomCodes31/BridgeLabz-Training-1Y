public class FeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double dp = 10;

        double dis = (fee * dp) / 100;
        double finalFee = fee - dis;

        System.out.println(
            "The discount amount is INR " + dis +
            " and final discounted fee is INR " + finalFee
        );
    }
}
