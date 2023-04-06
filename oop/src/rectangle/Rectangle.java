package rectangle;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float f, float w) {this.length = f; this.width = w;}
    public Rectangle() { this(1.0f,1.0f); }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return String.format("Rectangle[length]");
    }
}
