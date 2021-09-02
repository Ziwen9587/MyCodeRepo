package facade.pattern;

/**
 * package facade.pattern
 * A facade class of Facade Design Pattern
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class ShapeMaker {

    /** instance named circle in Shape class */
    private Shape circle;

    /** instance named circle in Shape class */
    private Shape rectangle;

    /** instance named circle in Shape class */
    private Shape square;

    /** constructor of ShapeMaker class
     *  initiate circle to new Circle();
     *  initiate rectangle to new Rectangle();
     *  initiate square to new Square().
     *  */
    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /** return void, call draw() method in Circle class  */
    public void drawCircle(){
        circle.draw();
    }

    /** return void, call draw() method in Rectangle class  */
    public void drawRectangle(){
        rectangle.draw();
    }

    /** return void, call draw() method in Square class  */
    public void drawSqaure(){
        square.draw();
    }

}
