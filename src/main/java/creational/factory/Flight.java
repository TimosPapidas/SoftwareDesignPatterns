package creational.factory;

public class Flight {
    private Aircraft aircraft;
    public Flight(AircraftFactory aircraftFactory){
        this.aircraft = aircraftFactory.buildAircraft();
    }
    public String abortFlight(){
        return aircraft.ejectCrew();
    }
}
