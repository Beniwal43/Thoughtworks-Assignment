public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        this(new Circle(), 1.0);
    }

    public Cylinder(double radius) {
        this(new Circle(radius), 1.0);
    }

    public Cylinder(double radius, double height) {
        this(new Circle(radius), height);
    }

    public Cylinder(double radius, double height, String color) {
        this(new Circle(radius, color), height);
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder[%s,height=%.2f]", base.toString(), height);
    }
}

