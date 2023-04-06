package sec02.exam01;

public class Car {
    Tire frontLefttire = new HankookTire();
    Tire frontRighttire = new HankookTire();
    Tire backLefttire = new HankookTire();
    Tire backRighttire = new HankookTire();

    void run() {
        frontLefttire.roll();
        frontRighttire.roll();
        backLefttire.roll();
        backRighttire.roll();
    }
}
