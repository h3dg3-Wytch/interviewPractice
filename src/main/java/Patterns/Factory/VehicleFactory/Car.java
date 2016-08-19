package Patterns.Factory.VehicleFactory;

/**
 * Created by h3dg3wytch on 8/18/16.
 */
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("I AM A CAR, BEEP, BEEP");
    }
}
