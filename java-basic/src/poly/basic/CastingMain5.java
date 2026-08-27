package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 call");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 call");
        call(parent2);
    }

    private static void call(Parent parent) {
        System.out.println("Parent instance false");
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("Child instance true");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
