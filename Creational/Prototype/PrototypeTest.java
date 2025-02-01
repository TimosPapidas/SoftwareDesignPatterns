package SoftwareDesignPatterns.Creational.Prototype;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrototypeTest {
    Dice dice;
    @BeforeEach
    void init(){
        dice = new Dice(new Random());
    }
    @Test
    void testRoll(){
        int roll = dice.roll();
        assert roll > 0 && roll < 7;
    }

    @Test
    void testClone() throws Exception {
        dice.roll();
        dice.roll();
        dice.roll();
        Dice newDice = dice.clone();
        Field pastRollsField = Dice.class.getDeclaredField("pastRolls");
        pastRollsField.setAccessible(true);
        assertEquals(pastRollsField.get(dice), pastRollsField.get(newDice));
    }
}
