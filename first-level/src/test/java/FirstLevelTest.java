

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FirstLevelTest {
    @Test
    public void returnNumberOfUniqueSymbols(){
        int [] arr = {1,2,3,4,5,6};
        assertEquals(6, new FirstLevel().returnNumberOfUniqueSymbols(arr));
    }

    @Test
    public void moveOfHorse(){
        assertTrue(new FirstLevel().moveOfHorse(1,1,2,3));
        assertFalse(new FirstLevel().moveOfHorse(1,1,2,2));
    }

    @Test
    public void areaOfTriangle(){
        assertEquals(40.5, new FirstLevel().areaOfTriangle(0,0,9,0,7,9));
    }
}
