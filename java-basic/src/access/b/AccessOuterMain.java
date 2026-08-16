package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        data.publicField = 1;
        data.publicMethod();

        // 다른 패키지라 접근 안됨
//        data.defaultField = 2;
//        data.defaultMethod();

//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
