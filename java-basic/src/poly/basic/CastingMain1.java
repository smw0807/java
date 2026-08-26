package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
//        poly.childMethod();

        // 다운 캐스팅 (부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();

        Parent parent = new Parent();
        Child child2 = (Child) parent;
        child2.parentMethod();
        child2.childMethod();

//        Child child3 = new Child();
//        Child child4 = (Parent) Parent();

    }
}
