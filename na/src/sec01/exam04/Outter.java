package sec01.exam04;

public class Outter {
    //자바 8 이전
    public void method1(final int arg) {
        final int localVariable = 1;
//        arg = 100;
//        lovalVariable = 100;
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }

    }

    //자바 8 이후
//    public void method2(int arg) {
//        int localVariable = 1;
////        arg = 100;
////        localVariable = 100;
//        class Inner {
//           public void method() {
//               int result = arg + lovalVariable;
//               result result;
////        }
//        Inner i = new Inner();
//               System.out.println(i.method());
//    }
}
