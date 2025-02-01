package SoftwareDesignPatterns.Creational.Singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SingetonTest {
    Singleton singleton = Singleton.getInstance();
    @Test
    void testInitial(){
        singleton.resetCounter();
        assertEquals(0, singleton.getCounter());
    }

    @Test
    void testAddOnce(){
        singleton.addOne();
        assertEquals(1, singleton.getCounter());
    }
}
