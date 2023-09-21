public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car(232000, "Toyota", "RAV4");
        Car car2 = new Car();

        car1.driveCar(12, 10);
        System.out.println(car1.getMileage());
    }
}
