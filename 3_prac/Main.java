package app;
import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Han Hanich", "5436812787", "V8");
        System.out.println("Owner Name: " + myCar.getOwnerName());
        System.out.println("Insurance Number: " + myCar.getInsuranceNumber());
        System.out.println("Engine Type: " + myCar.getEngineType());

        ElectricCar myElectricCar = new ElectricCar("Jane Doe", "9876543210", "Electric", 5000);
        System.out.println("Owner Name: " + myElectricCar.getOwnerName());
        System.out.println("Insurance Number: " + myElectricCar.getInsuranceNumber());
        System.out.println("Engine Type: " + myElectricCar.getEngineType());
        System.out.println("Battery Capacity: " + myElectricCar.getBatteryCapacity());
    }
}
