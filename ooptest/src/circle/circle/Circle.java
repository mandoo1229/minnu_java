package circle.circle;

public class Circle {
    private Double radius = 1.0;

    public Circle() {

    }
    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius + radius;
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=?]";
    }
}
