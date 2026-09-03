package poly.car0;

public class Driver {

    private K3Car K3Car;

    public void setK3Car(K3Car k3Car) {
        this.K3Car = k3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        K3Car.startEngine();
        K3Car.pressAccelerator();
        K3Car.offEngine();
    }
}
