class Ride {
    double calculateFare(double distance) {
        return 0;
    }
}

class BikeRide extends Ride {
    double calculateFare(double distance) {
        return distance * 10;
    }
}

class CarRide extends Ride {
    double calculateFare(double distance) {
        return distance * 20;
    }
}

class LuxuryRide extends Ride {
    double calculateFare(double distance) {
        return distance * 40;
    }
}

public class Main {
    public static void main(String[] args) {

        Ride r;

        r = new BikeRide();
        System.out.println("Bike Ride Fare: " + r.calculateFare(5));

        r = new CarRide();
        System.out.println("Car Ride Fare: " + r.calculateFare(5));

        r = new LuxuryRide();
        System.out.println("Luxury Ride Fare: " + r.calculateFare(5));
    }
}
