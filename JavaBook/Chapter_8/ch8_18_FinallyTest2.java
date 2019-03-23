package Chapter_8;

public class ch8_18_FinallyTest2 {
    public static void main(String args[]) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() {

    }
    static void copyFiles() {}
    static void deleteTempFiles() {}
}
