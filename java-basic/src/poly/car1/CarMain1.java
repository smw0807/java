package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        K3Car car = new K3Car();
        driver.setCar(car);
        driver.drive();

        Model3Car model3car = new Model3Car();
        driver.setCar(model3car);
        driver.drive();
    }
}
