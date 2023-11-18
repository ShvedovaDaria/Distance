package hmwrk15;

public class Distance {
    private double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public void print() {
        System.out.println("Distance: " + distance + " meters");
    }

    public static class Converter {
        public static double metersToKilometers(double meters) {
            return meters / 1000.0;
        }

        public static double kilometersToMiles(double kilometers) {
            return kilometers * 0.621371;
        }

    }

    public static void main(String[] args) {
        Distance distanceObj = new Distance(1500);
        distanceObj.print();

        double distanceInKilometers = Converter.metersToKilometers(distanceObj.distance);
        System.out.println("Distance in kilometers: " + distanceInKilometers);

        double distanceInMiles = Converter.kilometersToMiles(distanceInKilometers);
        System.out.println("Distance in miles: " + distanceInMiles);
    }
}