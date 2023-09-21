public class Car {
    private int mileage;
    private String make;
    private String model;

    public Car(int mileage, String make, String model) {
        this.mileage = mileage;
        this.make = make;
        this.model = model;
    }

    public Car() {
        this.mileage = 0;
        this.make = "Ford";
        this.model = "Mustang";
    }

    public int getMileage() {
        return mileage;
    }

    public void driveCar(int speed, int time) {
        this.mileage += speed * time;
    }
}
