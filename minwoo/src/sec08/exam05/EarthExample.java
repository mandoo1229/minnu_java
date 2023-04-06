package sec08.exam05;

public class EarthExample {
    public static void main(String[] args) {
        System.out.println("지구의 반지름 : " +Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적 : " +Earth.EARTH_AREA + "km^2");

        //fianl 상수는 값을 변경할 수 없다.
        //Earth.EARTH_RADIUS = 1.0;
    }
}
