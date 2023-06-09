package sec01.exam04;

public class SuperSonicAirplane extends Airplane{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            //Airplane 객체의 fly(0 메소드 호출
            super.fly();
        }
    }
}
