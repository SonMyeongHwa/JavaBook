package Chapter_6;

public class ch6_20_MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
  //static int cv2 = iv;
    static int cv2 = new ch6_20_MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv);
        //System.out.println(iv);
        ch6_20_MemberCall c = new ch6_20_MemberCall();
        System.out.println(c.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
      //instanceMethod1();
        ch6_20_MemberCall c = new ch6_20_MemberCall();
        c.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
