package sec02.exam01;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        anonymous.field.wake();

        anonymous.method1();

        // 익명 개체 매개값 사용
        anonymous.method2(
                new Person(){
                    void study(){
                        System.out.println("공부합니다.");
                    }

                    @Override
                    void wake() {
                        System.out.println("8시에 일어납니다.");
                    }
                }
        );
    }
}
