package vehicles;

public class ElectricCar extends vehicles.Car {
    private int batteryCapacity;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(String ownerName, String insuranceNumber, String engineType, int batteryCapacity) {
        super(ownerName, insuranceNumber, engineType);
        this.batteryCapacity = batteryCapacity;
    }
}
