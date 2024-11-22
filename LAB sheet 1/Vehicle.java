package VEHICLES;

abstract class Vehicle {
    String manufacturer;

    Vehicle(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void displayManufacturer() {
        System.out.println("Manufacturer: " + this.manufacturer);
    }

    abstract void fuelEfficiency();

    abstract void modelDetails();
}

class Honda extends Vehicle {
    int fuelAverage;
    String variant;

    Honda(int fuelAverage, String variant) {
        super("Honda");
        this.fuelAverage = fuelAverage;
        this.variant = variant;
    }

    void fuelEfficiency() {
        System.out.println("This Honda vehicle provides a fuel efficiency of " + this.fuelAverage + " km/l.");
    }

    void modelDetails() {
        System.out.println("Honda Variant: " + this.variant);
    }
}

class Hyundai extends Vehicle {
    int fuelAverage;
    String variant;

    Hyundai(int fuelAverage, String variant) {
        super("Hyundai");
        this.fuelAverage = fuelAverage;
        this.variant = variant;
    }

    void fuelEfficiency() {
        System.out.println("This Hyundai vehicle provides a fuel efficiency of " + this.fuelAverage + " km/l.");
    }

    void modelDetails() {
        System.out.println("Hyundai Variant: " + this.variant);
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle hondaCity = new Honda(20, "City");
        hondaCity.displayManufacturer();
        hondaCity.modelDetails();
        hondaCity.fuelEfficiency();

        Vehicle hyundaiCreta = new Hyundai(18, "Creta");
        hyundaiCreta.displayManufacturer();
        hyundaiCreta.modelDetails();
        hyundaiCreta.fuelEfficiency();
    }
}
