package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod call " + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod call " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod call " + privateField);
    }

    public void innerAccess() {
        System.out.println("Inner Call");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
