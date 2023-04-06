package exam;

public class Circle {
    private Double radius;

    public Circle (double d) {
        this.radius = d;
    }
    public Circle() {
        this(1.0);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ']';
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
}
