package SoftwareDesignPatterns.Factory;

public abstract class Aircraft {
    protected String liftProducer;
    protected String thrustProducer;
    protected int crew;

    public String getLiftProducer(){
        return liftProducer;
    }
    public String getThrustProducer(){
        return liftProducer;
    }
    public int getCrew(){
        return crew;
    }

    public abstract String ejectCrew();
}
