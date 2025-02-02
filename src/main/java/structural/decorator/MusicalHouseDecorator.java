package structural.decorator;

public class MusicalHouseDecorator extends HouseDecorator {

    public MusicalHouseDecorator(HouseComponent houseComponent) {
        super(houseComponent);
    }

    @Override
    public String getDescription() {
        return houseComponent.getDescription() + "Wonderful music fills the air.\n";
    }
}
