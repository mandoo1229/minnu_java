package sec03.exam01.exam02;

public abstract class Animal {
    //필드
    public String kind;

    //메소드
    public void breathe() {
        System.out.println("숨을 쉽니다.");
    }

    public abstract void sound();
}
