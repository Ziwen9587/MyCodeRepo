package factory.pattern;
/**
 * package factory.pattern
 * A demo class to test factory Design Pattern
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author www.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class FactoryPatternDemo {

    /** test all the methods in ShapeFactory */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}
