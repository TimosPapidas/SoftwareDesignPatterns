package structural.decorator;

public class FlyingHouseDecorator extends HouseDecorator{
    public FlyingHouseDecorator(HouseComponent houseComponent) {
        super(houseComponent);
    }

    public String getDescription() {
        return houseComponent.getDescription() + "The house starts flying...\n";
    }
}
