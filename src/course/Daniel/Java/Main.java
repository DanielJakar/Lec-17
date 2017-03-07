package course.Daniel.Java;

import course.Daniel.Java.shapes.Circle;
import course.Daniel.Java.shapes.Rectangle;
import course.Daniel.Java.shapes.Shape;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        DayOfWeek d = DayOfWeek.SUNDAY;
//	    switch (d){
//
//            case SUNDAY:
//                break;
//            case MONDAY:
//                break;
//            case TUESDAY:
//                break;
//            case WEDNESDAY:
//                break;
//            case THURSDAY:
//                break;
//            case FRIDAY:
//                break;
//            case SATURDAY:
//                break;
//        }

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Black", 10));
        shapes.add(new Circle("Yellow", 25));
        shapes.add(new Rectangle("Orange",10,20));
        shapes.add(new Rectangle("Blue", 15,23));

        for (Shape s : shapes) {
            if (s instanceof Rectangle){
                Rectangle r = (Rectangle) s; //Explicit type casting
                int b = r.getB();
//                int x = 10;
//                long y = x; //implicit type casting
            }
        }
    }



}
