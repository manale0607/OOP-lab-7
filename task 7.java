class Restaurant {
    double calculateDeliveryFee(double distance) {
        return 0;
    }
}

class FastFoodRestaurant extends Restaurant {
    double calculateDeliveryFee(double distance) {
        return distance * 20;
    }
}

class FineDiningRestaurant extends Restaurant {
    double calculateDeliveryFee(double distance) {
        return distance * 50;
    }
}

class CafeRestaurant extends Restaurant {
    double calculateDeliveryFee(double distance) {
        return distance * 30;
    }
}

public class Main {
    public static void main(String[] args) {

        Restaurant r;

        r = new FastFoodRestaurant();
        System.out.println("Fast Food Delivery Fee: " + r.calculateDeliveryFee(5));

        r = new FineDiningRestaurant();
        System.out.println("Fine Dining Delivery Fee: " + r.calculateDeliveryFee(5));

        r = new CafeRestaurant();
        System.out.println("Cafe Delivery Fee: " + r.calculateDeliveryFee(5));
    }
}
