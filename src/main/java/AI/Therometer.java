package AI;

/**
 * Created by h3dg3wytch on 1/30/17.
 */
class Therometer {
    private int temperature;

    public Therometer(int degrees){
        temperature = degrees;
    }

    public void makeWarmer(int degrees){
        temperature += degrees;
    }

    public void makeCooler(int degrees){
        temperature -= degrees;
    }

    public String tostring(){
        return temperature + " degrees" ;
    }



    public static void main(String[] args) {
        Therometer therometer = new Therometer(40);
        therometer.makeWarmer(5);
        System.out.println(therometer.tostring());
        therometer.makeCooler(5);
        System.out.println(therometer.tostring());



    }
}
