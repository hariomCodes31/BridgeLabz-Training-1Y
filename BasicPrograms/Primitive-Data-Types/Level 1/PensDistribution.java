public class PensDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int stu = 3;

        int per = pens / stu;
        int rem = pens % stu;

        System.out.println(
            "The Pen Per Student is " + per +
            " and the remaining pen not distributed is " + rem
        );
    }
}
