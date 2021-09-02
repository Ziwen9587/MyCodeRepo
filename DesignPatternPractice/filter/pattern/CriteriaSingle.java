package filter.pattern;

import java.util.ArrayList;
import java.util.List;
/**
 * package filter.pattern
 * implements interface Criteria
 * An CriteriaFemale as a filter class of Filter Design Pattern,
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class CriteriaSingle implements Criteria {

    /** constructor of Person class.
     * @param persons a List<Person> required as an input list;
     * @return a List<Person> where persons are in maritalStatus of "SINGLE" .
     *  */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
