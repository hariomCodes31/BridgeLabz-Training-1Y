public class EarthVolume {
    public static void main(String[] args) {
        double r = 6378;          // radius in km
        double pi = 3.14159;

        double vKm = (4.0 / 3.0) * pi * r * r * r;

        double vMi = vKm * 0.239913;

        System.out.println(
            "The volume of earth in cubic kilometers is " + vKm +
            " and cubic miles is " + vMi
        );
    }
}
