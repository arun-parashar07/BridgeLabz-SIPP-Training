interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

abstract class RideVehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Driver: " + driverName + ", Vehicle ID: " + vehicleId);
    }

    public double getRatePerKm() { return ratePerKm; }
}

class RideCar extends RideVehicle implements GPS {
    private String location;

    public RideCar(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}

class RideBike extends RideVehicle implements GPS {
    private String location;

    public RideBike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }
}

class RideAuto extends RideVehicle implements GPS {
    private String location;

    public RideAuto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 10;
    }

    public String getCurrentLocation() { return location; }
    public void updateLocation(String loc) { location = loc; }

    public static void main(String[] args) {
        RideVehicle r1 = new RideCar("C001", "Amit", 20);
        RideVehicle r2 = new RideBike("B001", "Rahul", 10);
        RideVehicle r3 = new RideAuto("A001", "Vijay", 15);

        r1.getVehicleDetails();
        System.out.println("Fare: ₹" + r1.calculateFare(10));

        r2.getVehicleDetails();
        System.out.println("Fare: ₹" + r2.calculateFare(10));

        r3.getVehicleDetails();
        System.out.println("Fare: ₹" + r3.calculateFare(10));
    }
}
