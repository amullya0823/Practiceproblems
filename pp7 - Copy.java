public class pp7 {
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = 3.141592653589793;

        double volumeKm = (4.0/3.0) * pi * Math.pow(radiusKm, 3);

        double kmToMiles = 1.6;
        double radiusMiles = radiusKm / kmToMiles;
        double volumeMiles = (4.0/3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                           " and cubic miles is " + volumeMiles);
    }
}