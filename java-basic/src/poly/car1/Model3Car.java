package poly.car1;

public class Model3Car implements Car {
    @Override
    public void startEngin() {
        System.out.println("K3Car starts engin");
    }

    @Override
    public void offEngine() {
        System.out.println("K3Car off engin");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car presses accelerator");
    }
}
