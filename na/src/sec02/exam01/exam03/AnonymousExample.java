package sec02.exam01.exam03;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.field.turnOn();
        anonymous.field.turnOff();

        //익명 객체 로컬 변수 사용
        anonymous.method1();

        //익명 객체 매개값 사용
        anonymous.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("smart tv를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("smart tv를 끕니다.");
            }
        });
    }
}
