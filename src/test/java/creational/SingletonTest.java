package creational;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import creational.singleton.*;

public class SingletonTest {
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
