package Patterns.Factory.VehicleFactory;

/**
 * Created by h3dg3wytch on 8/18/16.
 */
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("I AM A BIKE, RING, RING!");
    }
}
