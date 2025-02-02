package creational.factory;

public class MustangFactory implements AircraftFactory{
    public Aircraft buildAircraft(){
        return new Mustang();
    }
}
