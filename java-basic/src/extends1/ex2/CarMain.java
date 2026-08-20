package extends1.ex2;

import extends1.ex1.ElactricCar;

public class CarMain {
    public static void main(String[] args) {
        ElactricCar elactricCar = new ElactricCar();
        elactricCar.move();
        elactricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
