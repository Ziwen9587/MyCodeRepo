package facade.pattern;
/**
 * package facade.pattern
 * A class as Rectangle of Facade Design Pattern,
 * it has a method draw override from interface Shape.
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class Rectangle implements Shape {

    /** print "Rectangle::Draw()" in the console */
    @Override
    public void draw(){
        System.out.println("Rectangle::Draw()");
    }

    /** JUnit test method, return the string of "Rectangle" */
    public String getMyShape(){
        return "Rectangle";
    }
}
