package sec07.exam05;

public class Caremaple {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재의 속도 : " + speed);
    }
}
