package course.Daniel.Java;

/**
 * Created by Jakars on 07/03/2017.
 */
public class Circle extends Shape{
    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }


    @Override
    public double getArea() {
        return Math.PI*(r*r);
    }

    @Override
    public double getPerimeter() {
        return 2*(Math.PI)*r;
    }

    public double getRadius() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                "} " + super.toString();
    }
}
