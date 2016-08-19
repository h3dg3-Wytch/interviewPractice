package Patterns.Factory.VehicleFactory;

/**
 * Created by h3dg3wytch on 8/18/16.
 */
public class VehicleFactory {

    public Vehicle getVehicle(String vehicle){
        switch (vehicle){
            case "BOAT":
                return new Boat();
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            default:
                return null;
        }
    }
}
