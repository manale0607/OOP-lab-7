class SmartDevice {
    void turnOn() {
        System.out.println("Device turning on...");
    }
}

class SmartLight extends SmartDevice {
    void turnOn() {
        System.out.println("Smart Light is turned on");
    }
}

class SmartFan extends SmartDevice {
    void turnOn() {
        System.out.println("Smart Fan is spinning");
    }
}

class SmartAC extends SmartDevice {
    void turnOn() {
        System.out.println("Smart AC is cooling");
    }
}

public class Main {
    public static void main(String[] args) {

        SmartDevice[] devices = {
                new SmartLight(),
                new SmartFan(),
                new SmartAC()
        };

        for (SmartDevice d : devices) {
            d.turnOn();
        }
    }
}
