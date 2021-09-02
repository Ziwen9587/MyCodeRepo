package singleton.pattern;

/**
 * package singleton.pattern.
 * A class of Singleton Design Pattern, implement
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class SingleObject {
    /** The class instance of SingleObject class */
    private static SingleObject instance = new SingleObject();

    /** The private constructor of SingleObject */
    private SingleObject(){

    }

    /** Returns the class instance */
    public static SingleObject getInstance(){
        return instance;
    }

    /** print "Hello World!" in the console */
    public void showMessage(){
        System.out.println("Hello World!");
    }

    /** JUnit test method. Returns the integerInput parameter.
     * @param integerInput a integer number.
     * @return Returns the input integer.
     * */
    public int showNumber(int integerInput){
        return integerInput;
    }

    /** JUnit test method. Returns the booleanInput parameter.
     * @param booleanInput a integer number.
     * @return Returns the input boolean.
     * */
    public boolean showBoolean(boolean booleanInput){
        return booleanInput;
    }

}


