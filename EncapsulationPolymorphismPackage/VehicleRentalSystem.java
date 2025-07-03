interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);
    public double getRentalRate() { return rentalRate; }

    public void displayInfo() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type);
    }
}

class Car extends Vehicle implements Insurable {
    public Car(String number, double rate) {
        super(number, "Car", rate);
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 2000.0; }
    public String getInsuranceDetails() { return "Car insurance ₹2000"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String number, double rate) {
        super(number, "Bike", rate);
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 800.0; }
    public String getInsuranceDetails() { return "Bike insurance ₹800"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String number, double rate) {
        super(number, "Truck", rate);
    }

    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 3500.0; }
    public String getInsuranceDetails() { return "Truck insurance ₹3500"; }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR123", 1500),
            new Bike("BIKE321", 500),
            new Truck("TRK001", 3000)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("Rental for 5 days: ₹" + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println(i.getInsuranceDetails());
                System.out.println("Insurance: ₹" + i.calculateInsurance());
            }
            System.out.println();
        }
    }
}