package course.Daniel.Java;

/**
 * Created by Jakars on 07/03/2017.
 */
public abstract class Shape {
    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "color='" + color + '\'' +
                "Area='" + getArea() + '\'' +
                "Perimeter='" + getPerimeter() + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
