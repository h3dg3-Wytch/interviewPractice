package Patterns.Factory.ShapeFactory;

/**
 * Created by h3dg3wytch on 8/18/16.
 */
public class ShapeFactory {

    public final static String CIRCLE = "CIRCLE";
    public final static String RECTANGLE = "RECTANGLE";
    public final static String SQUARE = "SQUARE";

    public Shape generateShape(String shape) {

        switch (shape) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;

        }
    }
}
