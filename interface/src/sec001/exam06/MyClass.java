package sec001.exam06;

public class MyClass {
    //필드
    RemoteControl rc = new Television();

    //생성자
    public MyClass() {
    }

    public MyClass(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodA() {
        //로컬 변수로 사용
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    //매개변수로 사용
    void methodB(RemoteControl rc) {
        rc.turnOn();
        rc.setVolume(5);
    }
}
