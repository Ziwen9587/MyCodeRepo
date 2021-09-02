package filter.pattern;
/**
 * package filter.pattern
 * A Person class of Filter Design Pattern,
 * It has field attributes as name, gender and maritalStatus,
 * and getters for each field attribute.
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class Person {

    /** field attribute name */
    private String name;

    /** field attribute gender */
    private String gender;

    /** field attribute maritalStatus */
    private String maritalStatus;

    /** constructor of Person class.
     * @param name a name in type of string to be assign to field attribute name;
     * @param gender a gender in type of string to be assign to field attribute gender;
     * @param maritalStatus a maritalStatus in type of string to be assign to field attribute maritalStatus;
     *  */
    public Person(String name, String gender, String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    /** return field attribute name of the object  */
    public String getName() {
        return name;
    }

    /** return field attribute gender of the object  */
    public String getGender() {
        return gender;
    }

    /** return field attribute maritalStatus of the object  */
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
