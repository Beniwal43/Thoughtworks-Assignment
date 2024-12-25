public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this(1.0, "red");
    }

    public Circle(double radius) {
        this(radius, "red");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f,color=%s]", radius, color);
    }
}
