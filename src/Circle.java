public class Circle extends Figure {
    private static final String Name = "Circle";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String getName() {
        return Name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}