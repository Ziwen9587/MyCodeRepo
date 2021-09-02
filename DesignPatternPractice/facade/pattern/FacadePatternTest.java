package facade.pattern;

import filter.pattern.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class FacadePatternTest {
    String circle;
    String rectangle;
    String square;
    Circle c;
    Rectangle r;
    Square s;

    @Before
    public void setUp(){
        circle = "Circle";
        rectangle = "Rectangle";
        square = "Square";
    }

    @Test
    public void testGetCircle(){
        c = new Circle();
        String expectedString = "Circle";
        String actualString = c.getMyShape();
        boolean result = false;
        if (expectedString.equals(actualString)){
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetRectangle(){
        r = new Rectangle();
        String expectedString = "Rectangle";
        String actualString = r.getMyShape();
        boolean result = false;
        if (expectedString.equals(actualString)){
            result = true;
        }
        assertTrue(result);
    }

    @Test
    public void testGetSquare(){
        s = new Square();
        String expectedString = "Square";
        String actualString = s.getMyShape();
        boolean result = false;
        if (expectedString.equals(actualString)){
            result = true;
        }
        assertTrue(result);
    }
}
