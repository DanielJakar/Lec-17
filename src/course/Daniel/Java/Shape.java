package course.Daniel.Java;

/**
 * Created by Jakars on 07/03/2017.
 */
public abstract class Shape {
    private String color;

    protected void Shape(){

    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
