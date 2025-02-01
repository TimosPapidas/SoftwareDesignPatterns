package SoftwareDesignPatterns.Creational.Factory;

public class MustangFactory implements AircraftFactory{
    public Aircraft buildAircraft(){
        return new Mustang();
    }
}
