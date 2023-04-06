package sec02.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        car.frontRighttire = new KumhoTire();
        car.frontLefttire = new KumhoTire();

        car.run();
    }
}
