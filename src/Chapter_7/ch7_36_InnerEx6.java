package Chapter_7;

public class ch7_36_InnerEx6 {
    Object iv = new Object() {void method() {}};
    static Object cv = new Object() {void method() {}};

    void myMethod() {
        Object lv = new Object() {void method() {}};
    }
}
