public class Car {
    // Поля класса
    private String model;
    private String license;
    private String color;
    private int year;

    // Конструктор по умолчанию
    public Car() {
        this.model = "Kia";
        this.license = "y555kt750";
        this.color = "White";
        this.year = 2016;
    }

    // Конструктор со всеми полями
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // Конструктор с выбором полей (например, модель и год)
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.license = "a666aa777"; // Значение по умолчанию
        this.color = "Black"; // Значение по умолчанию
    }

    // Метод для вывода информации о машине

    public String toString() {
        return "Car: model=" + model + ", license=" + license + ", color=" + color + ", year=" + year + "]";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int calculateAge() {
        int currentYear = 2024;
        return currentYear - year;
    }
}

// new file

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("UAZ", "x789ec38", "Green", 1976);
        Car car2 = new Car();
        Car car3 = new Car("Audi", 2023);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // Изменение года выпуска для car1
        car1.setYear(1988);
        System.out.println("After year update: " + car1);

        System.out.println("Car1 age: " + car1.calculateAge());
    }
}
