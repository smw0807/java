package lang.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = { dog, car ,object };

        size(objects);
        action(dog);
        action(car);
    }

    private static void size(Object[] objects){
        System.out.println("전달된 객체의 수는: "  + objects.length);
    }

    private static void action(Object obj) {
        if (obj instanceof Dog) {
            ((Dog) obj).sound();
        } else if (obj instanceof Car) {
            ((Car) obj).move();
        }
    }
}
