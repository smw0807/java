package poly.car0;

public class CarMin0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3car = new K3Car();

        driver.setK3Car(k3car);
        driver.drive();
    }
}
