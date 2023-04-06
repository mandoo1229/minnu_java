package sec02.exam01.exam98;

public class AnonymousExaple {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.field.run();
        anonymous.method1();
        anonymous.method2(
                new Vehicle() {
                    @Override
                    public void run() {
                        System.out.println("트럭이 달립니다.");
                    }
                }
        );
    }
}
