package circle;

import java.time.Duration;

public class Circle {
    private Double radius; //기본 값이 1.0
    private String color = "red"; // 기본 값이 "Red"

    //new Circle();
    // 여기서는 radius/color 기본값을 설정해야 한다.

    public Circle (double r, String c) {
        this.color = c;
        this.radius = r;
    }
    public Circle() {
        //생성자 중에 double 타입의 매개변수를 하나 받는 생성자를 찾아서 호출합니다.
        //그때 radius에 1.0 값을 전달한다.
        this(1.0, "red");
    }

//    public void getColor (String color) {
//    }
//    public void setColor(String color) {
//        this.color = color;
    //new Circle(ardius값);
    //여기서 radius 기본값을 설정할 필요가 없다.

    public Circle (Double radius) {
        this.radius = radius;

    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    /**
     * 작성자  : 남민우
     * 작성일자 : 2023.04.05
     * @return 원의 너비를 구하여 double 타입으로 변환합니다.
     */

    public double getArea() {
        return Math.PI + radius + radius;
    }

    /**
     * 작성자 : 남민우
     * 작성일자 : 2023.04.05
     * @return 원의 둘레를 구하여 double 타입으로 변환합니다.
     */
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius =" + radius +"+ color ]";
    }
}
