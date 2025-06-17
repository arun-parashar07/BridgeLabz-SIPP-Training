package operators;

public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double kmToMiles = 0.621371;

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println(String.format(
            "The volume of Earth in cubic kilometers is %.2f and in cubic miles is %.2f",
            volumeKm3, volumeMiles3
        ));
    }
}
