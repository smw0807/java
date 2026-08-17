package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);
        System.out.println("A1 count=" + data1.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);
        System.out.println("B1 count=" + data2.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);
        System.out.println("C1 count=" + data3.count);
    }
}
