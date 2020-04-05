package Day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroTest {

    MoveZeroUsingQueue moveZero = new MoveZeroUsingQueue();
    MoveZeroUsingLoop moveZeroUsingLoop = new MoveZeroUsingLoop();

    @Test
    void moveZeroes() {

        assertArrayEquals(new int[]{1, 3, 12, 0, 0},moveZero.moveZeroes(new int[]{0,1,3,0,12}));
    }


    @Test
    void moveZeroesLoop() {

        assertArrayEquals(new int[]{1, 3, 12, 0, 0},moveZeroUsingLoop.moveZeroes(new int[]{0,1,3,0,12}));
    }
}