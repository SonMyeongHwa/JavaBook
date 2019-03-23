package Chapter_4;

public class ch4_26_FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while((sum += ++i) <= 100) {
            System.out.printf("%d - %d%n", i, sum);
        }
    }
}
