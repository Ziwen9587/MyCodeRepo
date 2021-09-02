package statepattern;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatePatternTest {
    Context context;

    @Before
    public void setUp(){
        context = new Context();
    }

    @Test
    public void testInitialState(){
        String expect = "Stop";
        String actual = context.getState().toString();
        assertEquals(expect,actual);
    }

    @Test
    public void testStopToAccelerateForward(){
        String expect = "AccelerateForward";
        AccelerateForward af = new AccelerateForward();
        af.doAction(context);
        String actual = context.getState().toString();
        assertEquals(expect,actual);
    }

    @Test
    public void testAccelerateForwardToConstantForward(){
        String expect = "ConstantForward";
        AccelerateForward af = new AccelerateForward();
        af.doAction(context);
        ConstantForward cf = new ConstantForward();
        cf.doAction(context);
        String actual = context.getState().toString();
        assertEquals(expect,actual);
    }

}
