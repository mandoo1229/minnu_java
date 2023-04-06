package sec001.exam04;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOff();
        rc.turnOn();

        rc = new Audio();
        rc.turnOff();
        rc.turnOn();
    }
}
