package creational.factory;

public class Huey extends Aircraft {
    public Huey(){
        this.liftProducer = "Rotor";
        this.thrustProducer = "Turbine";
        this.crew = 2;
    }

    @Override
    public String ejectCrew() {
        return "Bad idea...";
    }
    
}
