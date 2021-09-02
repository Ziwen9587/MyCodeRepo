package filter.pattern;

import java.util.ArrayList;
import java.util.List;
/**
 * package filter.pattern
 * implements interface Criteria
 * An CriteriaMale as a filter class of Filter Design Pattern,
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class CriteriaMale implements Criteria {

    /** constructor of Person class.
     * @param persons a List<Person> required as an input list;
     * @return a List<Person> where persons are in gender of "Male" .
     *  */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
