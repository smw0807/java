package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newIntegr = new Integer(10);
        System.out.println("newIntegr = " + newIntegr.toString());
        Integer integerObj = Integer.valueOf(10);
        System.out.println("integerObj = " + integerObj.toString());
        Long longObj = Long.valueOf(100);
        System.out.println("longObj = " + longObj.toString());
        Double doubleObj = Double.valueOf(100.0);
        System.out.println("longObj = " + longObj.toString());
        Float floatObj = Float.valueOf(100.0f);
        System.out.println("floatObj = " + floatObj.toString());

        System.out.println("내부값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==" + (newIntegr == integerObj));
        System.out.println("equals:" + newIntegr.equals(integerObj));

    }
}
