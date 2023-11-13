
public class Main {
    public static void main(String[] args) {
        Figure[] figure = {
                new Circle(10),
                new Rectangle(8, 12),
                new Triangle(5, 8, 5)

        };

        for(Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());
    }
}