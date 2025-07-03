class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temp: " + temperatureSetting + "°C");
    }

    public static void main(String[] args) {
        Thermostat t = new Thermostat("T100", "ON", 22);
        t.displayStatus();
    }
}