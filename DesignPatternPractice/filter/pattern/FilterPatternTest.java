package filter.pattern;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FilterPatternTest {
    Criteria male;
    Criteria female;
    Criteria single;
    Criteria singleMale;
    Criteria singleOrFemale;
    List<Person> persons;

    @Before
    public void setUp(){
        persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        male = new CriteriaMale();
        female = new CriteriaFemale();
        single = new CriteriaSingle();
        singleMale = new AndCriteria(single, male);
        singleOrFemale = new OrCriteria(single, female);
    }

    @Test
    public void testCriteriaMale(){
        int expectNumboerOfMale = 4;
        List<Person> listMalePerson = male.meetCriteria(persons);
        assertEquals(expectNumboerOfMale,listMalePerson.size());
    }

    @Test
    public void testCriteriaFemale(){
        int expectNumboerOfFemale = 2;
        List<Person> listMalePerson = female.meetCriteria(persons);
        assertEquals(expectNumboerOfFemale,listMalePerson.size());
    }

    @Test
    public void testCriteriaSingle(){
        int expectNumboerOfSingle = 4;
        List<Person> listMalePerson = single.meetCriteria(persons);
        assertEquals(expectNumboerOfSingle,listMalePerson.size());
    }

}
