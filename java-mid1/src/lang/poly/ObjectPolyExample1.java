package lang.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
//        컴파일 오류 obj에는 sound, move 가 없음
//        obj.sound();
//        obj.move();

        // 객체에 맞는 다운 캐스팅 필요
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof  Car car) {
            car.move();
        }
    }
}
