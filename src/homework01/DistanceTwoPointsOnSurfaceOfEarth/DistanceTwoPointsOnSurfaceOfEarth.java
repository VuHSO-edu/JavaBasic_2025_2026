package homework01.DistanceTwoPointsOnSurfaceOfEarth;

import java.util.Scanner;

public class DistanceTwoPointsOnSurfaceOfEarth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double long1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double long2 = input.nextDouble();
        input.close();

        System.out.println("The distance between those points is: "
                + distanceTwoPointsOnSurfaceOfEarth(lat1, long1, lat2, long2) + " km");
    }

    public static double distanceTwoPointsOnSurfaceOfEarth(double lat1, double long1,
                                                           double lat2, double long2) {
        lat1  = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2  = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);

        double earthRadius = 6371.01;
        double distance = earthRadius * Math.acos(
                Math.sin(lat1) * Math.sin(lat2)
                        + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2)
        );
        return distance;
    }
}

