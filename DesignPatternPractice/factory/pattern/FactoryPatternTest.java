package factory.pattern;
import filter.pattern.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class FactoryPatternTest {
    ShapeFactory sf;
    String shapeTypeCircle;
    String shapeTypeRectangle;
    String shapeTypeSquare;

    @Before
    public void setUp(){
        sf = new ShapeFactory();
        shapeTypeCircle = "Circle";
        shapeTypeRectangle = "Rectangle";
        shapeTypeSquare = "Square";
    }

    @Test
    public void testGetCircle(){
        String expectedString = "Circle";
        Shape actualShape = sf.getShape(shapeTypeCircle);
        String actualString = actualShape.getMyShape();
        assertEquals(expectedString,actualString);
    }

    @Test
    public void testGetRectangle(){
        String expectedString = "Rectangle";
        Shape actualShape = sf.getShape(shapeTypeRectangle);
        String actualString = actualShape.getMyShape();
        assertEquals(expectedString,actualString);
    }

    @Test
    public void testGetSquare(){
        String expectedString = "Square";
        Shape actualShape = sf.getShape(shapeTypeSquare);
        String actualString = actualShape.getMyShape();
        assertEquals(expectedString,actualString);
    }


}
