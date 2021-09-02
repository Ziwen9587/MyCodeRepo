package filter.pattern;

import java.util.List;
/**
 * package filter.pattern
 * implements interface Criteria
 * An OrCriteria as a filter class of Filter Design Pattern,
 * It has field attributes as criteria and otherCriteria both in type of Criteria
 *
 * The whole code is cited from TOPIC I Design Patterns_SEG2105
 * @author WWW.tutorialspoint.com
 * @version 1.0(07/17/21)
 */
public class OrCriteria implements Criteria {

    /** field attribute criteria */
    private Criteria criteria;
    /** field attribute otherCriteria */
    private Criteria otherCriteria;

    /** constructor of Person class.
     * @param criteria a criteria in type of Criteria to be assigned to field attribute criteria;
     * @param otherCriteria a otherCriteria in type of Criteria to be assigned to field attribute otherCriteria;
     *  */
    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    /** constructor of Person class.
     * @param persons a List<Person> required as an input list;
     * @return a List<Person> which meets both criteria and otherCriteria.
     *  */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
