package structural.decorator;

public abstract class HouseDecorator implements HouseComponent {
    protected HouseComponent houseComponent;

    public HouseDecorator(HouseComponent houseComponent) {
        this.houseComponent = houseComponent;
    }

    public abstract String getDescription();
}
