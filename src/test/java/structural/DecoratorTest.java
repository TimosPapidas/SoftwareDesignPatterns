package structural;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import structural.decorator.*;

public class DecoratorTest {
    HouseComponent houseComponent = new House(4, "pink", "green");
    HouseComponent flyingHouse = new FlyingHouseDecorator(houseComponent);
    HouseComponent musicalHouse = new MusicalHouseDecorator(houseComponent);
    HouseComponent musicalFlyingHouse = new MusicalHouseDecorator(flyingHouse);

    @Test
    void testHouse() {
        assertEquals("A beautiful pink house with a green door and 4 windows.\n", houseComponent.getDescription());
    }

    @Test
    void testDecoratedHouses() {
        assertEquals("A beautiful pink house with a green door and 4 windows.\nThe house starts flying...\n",
                flyingHouse.getDescription());
        assertEquals("A beautiful pink house with a green door and 4 windows.\nWonderful music fills the air.\n",
                musicalHouse.getDescription());
    }

    @Test
    void testMusicalFlyingHouse() {
        assertEquals(
                "A beautiful pink house with a green door and 4 windows.\nThe house starts flying...\nWonderful music fills the air.\n",
                musicalFlyingHouse.getDescription());
    }
}
