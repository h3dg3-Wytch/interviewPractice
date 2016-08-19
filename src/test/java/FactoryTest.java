import Patterns.Factory.ShapeFactory.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by h3dg3wytch on 8/18/16.
 */
public class FactoryTest {

    @Test
    public void testShapeFactory(){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.generateShape(ShapeFactory.SQUARE);
        Shape circle = shapeFactory.generateShape(ShapeFactory.CIRCLE);
        Shape rectangle = shapeFactory.generateShape(ShapeFactory.RECTANGLE);

        assertEquals(square.getClass(), Square.class);
        assertEquals(circle.getClass(), Circle.class);
        assertEquals(rectangle.getClass(), Rectangle.class);

    }
}
