package filter.pattern;
import java.util.List;
/**
 * package filter.pattern
 * A interface as shape of Filter Design Pattern. It has only abstract method meetCriteria(List<Person> persons).
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public interface Criteria {

    /** returns List<Person> */
    public List<Person> meetCriteria(List<Person> persons);
}
