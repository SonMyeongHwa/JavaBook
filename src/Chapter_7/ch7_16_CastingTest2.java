package Chapter_7;

public class ch7_16_CastingTest2 {
    public static void main(String args[]) {
        Car car = new FireEngine();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine)car;
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
