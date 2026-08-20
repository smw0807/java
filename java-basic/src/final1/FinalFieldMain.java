package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ContructInit contructInit1 = new ContructInit(10);
        ContructInit contructInit2 = new ContructInit(20);
        System.out.println(contructInit1.value);
        System.out.println(contructInit1.value);

        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);
        System.out.println(FieldInit.COUNT_VALUE);
    }
}
