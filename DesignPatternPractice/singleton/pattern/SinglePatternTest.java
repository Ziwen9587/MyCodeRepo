package singleton.pattern;
import org.junit.Test;
import static org.junit.Assert.*;

public class SinglePatternTest {


    @Test
    public void testSame(){
        SingleObject ob1 = SingleObject.getInstance();
        SingleObject ob2 = SingleObject.getInstance();
        assertSame(ob1,ob2);
    }

    @Test
    public void testNumber(){

        int expectInt = 1;
        SingleObject ob = SingleObject.getInstance();
        int actualInt = ob.showNumber(expectInt);
        assertEquals(expectInt,actualInt);
    }

    @Test
    public void testBoolean(){
        boolean expectBoolean = true;
        SingleObject ob = SingleObject.getInstance();
        boolean actualBoolean = ob.showBoolean(expectBoolean);
        assertTrue(actualBoolean);
    }

}
