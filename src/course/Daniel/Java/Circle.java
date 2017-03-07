package course.Daniel.Java;

/**
 * Created by Jakars on 07/03/2017.
 */
public class Circle extends Shape{
    private double r;

    public Circle() {
    }

    public double getArea (){
        return Math.PI*(r*r);
    }

    public double getPerimeter(){
        return 2*Math.PI*r;

    }

    public double getRadius() {
        return r;
    }
}
