package recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getNumberOfPossibleWays() {
        //assertEquals(Integer.valueOf(1), Main.getNumberOfPossibleWays(1, new Integer[] {1, 2, 3}));
        //assertEquals(Integer.valueOf(2), Main.getNumberOfPossibleWays(2, new Integer[] {1, 2, 3}));
        //assertEquals(Integer.valueOf(4), Main.getNumberOfPossibleWays(3, new Integer[] {1, 2, 3}));
        assertEquals(Integer.valueOf(7), Main.getNumberOfPossibleWays(4, new Integer[] {1, 2, 3}));
        assertEquals(Integer.valueOf(331), Main.getNumberOfPossibleWays(10, new Integer[] {1, 2, 3, 5}));

        assertEquals(Integer.valueOf(14), Main.getNumberOfPossibleWays(5, new Integer[] {1, 2, 3, 5}));
    }
}