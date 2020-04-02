package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class SingleNumberBitWiseTest {

    SingleNumberBitWise singleNumberBitWise = new SingleNumberBitWise();


    @Test
    void singleNumberLast() {
        assertEquals (singleNumberBitWise.singleNumber(new int[]{1,3,1,3,6,7,6,7,8}),8);

    }
    @Test
    void singleNumberFirst() {
        assertEquals (singleNumberBitWise.singleNumber(new int[]{4,3,1,3,6,7,6,7,1}),4);


    }
    @Test
    void singleNumberMiddle() {
        assertEquals (singleNumberBitWise.singleNumber(new int[]{1,3,1,2,6,7,6,7,3}),2);

    }
}