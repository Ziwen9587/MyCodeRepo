package factory.pattern;

/**
 * package factory.pattern
 * A interface as shape of Factory Design Pattern. It has only abstract method as draw().
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public interface Shape {

    /** returns void, can be self defined by class implements this interface */
    public abstract void draw();

    /** returns String, Added as JUnit Test method */
    public abstract String getMyShape();
}
