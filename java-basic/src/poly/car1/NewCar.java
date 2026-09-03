package poly.car1;

public class NewCar implements Car{
    @Override
    public void startEngin() {
        System.out.println("NewCar starts engin");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar off engin");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar presses accelerator");
    }
}
