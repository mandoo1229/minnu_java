package sec07.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftGas();
        if (gasState) {
            System.out.println("출발합니다.");
            myCar.run();
        }

        if (myCar.isLeftGas()) {
            System.out.println("gas를 주입하지 않아도 됩니다.");
        } else {
            System.out.println("gas를 주입해주세요.");
        }
    }
}
