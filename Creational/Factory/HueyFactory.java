package SoftwareDesignPatterns.Factory;

public class HueyFactory implements AircraftFactory{
    @Override
    public Aircraft buildAircraft() {
        return new Huey();
    }
}
