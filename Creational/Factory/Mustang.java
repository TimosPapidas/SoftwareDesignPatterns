package SoftwareDesignPatterns.Creational.Factory;

public class Mustang extends Aircraft {
    public Mustang(){
        this.liftProducer = "Wings";
        this.thrustProducer = "Propeller";
        this.crew = 1;
    }
    @Override
    public String ejectCrew() {
        return "Ejecting!";
    }
    
}
