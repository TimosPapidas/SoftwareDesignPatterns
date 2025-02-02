package creational.factory;

public class HueyFactory implements AircraftFactory{
    @Override
    public Aircraft buildAircraft() {
        return new Huey();
    }
}
