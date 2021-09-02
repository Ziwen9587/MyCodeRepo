package facade.pattern;
/**
 * package facade.pattern
 * A class as Square of Facade Design Pattern
 * it has a method draw override from interface Shape.
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class Square implements Shape {

    /** print "Square::Draw()" in the console */
    @Override
    public void draw(){
        System.out.println("Square::Draw()");
    }

    /** JUnit test method, return the string of "Square" */
    public String getMyShape(){
        return "Square";
    }
}
