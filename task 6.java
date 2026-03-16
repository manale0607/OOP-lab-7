class Transport {
    void fare() {
        System.out.println("Calculating fare...");
    }
}

class Bus extends Transport {
    void fare() {
        System.out.println("Bus Fare: 50");
    }
}

class Train extends Transport {
    void fare() {
        System.out.println("Train Fare: 100");
    }
}

class Taxi extends Transport {
    void fare() {
        System.out.println("Taxi Fare: 300");
    }
}

public class Main {
    public static void main(String[] args) {

        Transport t;

        t = new Bus();
        t.fare();

        t = new Train();
        t.fare();

        t = new Taxi();
        t.fare();
    }
}
