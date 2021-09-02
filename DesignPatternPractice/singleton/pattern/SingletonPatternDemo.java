package singleton.pattern;

/**
 * package singleton.pattern.
 * A demo class to test Singleton Design Pattern
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class SingletonPatternDemo {

    /** test all the methods in SingleObject */
    public static void main(String[] args){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
