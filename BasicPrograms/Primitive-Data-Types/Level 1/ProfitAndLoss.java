public class ProfitAndLoss {
    public static void main(String[] args) {
        double cp = 129;
        double sp = 191;

        double p = sp - cp;
        double pp = (p / cp) * 100;

        System.out.println(
            "The Cost Price is INR " + cp + " and Selling Price is INR " + sp + "\n" +
            "The Profit is INR " + p + " and the Profit Percentage is " + pp
        );
    }
}
