package factory.pattern;
/**
 * package factory.pattern
 * A factory class of Facade Design Pattern
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class ShapeFactory {

    /** return the object of type shape
     * @param shapeType a shape type in string being defined for the return shape. It can be in type of Circle, Rectangle, Square or null.
     * @return the shape corresponded with shapeType para input.
     * */
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
