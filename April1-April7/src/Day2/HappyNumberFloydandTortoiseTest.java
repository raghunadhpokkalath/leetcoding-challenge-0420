package Day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberFloydandTortoiseTest {

     HappyNumberFloydandTortoise happyNumberFloydandTortoise = new HappyNumberFloydandTortoise();

     @Test
    void test_an_happy_number() {
         assertEquals (happyNumberFloydandTortoise.isHappy(19),true);
    }

    @Test
    void test_not_an_happy_number() {
        assertEquals(happyNumberFloydandTortoise.isHappy(22),false);
    }
}