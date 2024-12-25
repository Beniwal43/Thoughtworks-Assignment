public class TestMain {
    public static void main(String[] args) {
    
        Circle c1 = new Circle(2.0, "blue");
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());

        Cylinder cyl1 = new Cylinder();
        System.out.println(cyl1);
        System.out.println("Volume: " + cyl1.getVolume());

        Cylinder cyl2 = new Cylinder(3.0, 4.0);
        System.out.println(cyl2);
        System.out.println("Volume: " + cyl2.getVolume());

        Cylinder cyl3 = new Cylinder(2.0, 5.0, "green");
        System.out.println(cyl3);
        System.out.println("Volume: " + cyl3.getVolume());

        Circle customBase = new Circle(3.0, "red");
        Cylinder cyl4 = new Cylinder(customBase, 6.0);
        System.out.println(cyl4);
        System.out.println("Volume: " + cyl4.getVolume());
    }
}

// Ques -- Which design (inheritance or composition) is better?
// Ans -- Composition often provides more flexibility and is generally preferred when the relationship between classes is "has-a" rather than "is-a". In this case, a cylinder has a circular base, so composition is a more natural fit. It allows for more flexibility in future modifications and avoids some of the pitfalls of inheritance, such as the fragile base class problem.