package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingleNumberListTest {


    SingleNumberList singleNumberList = new SingleNumberList();


    @Test
    void singleNumberLast() {
       assertEquals (singleNumberList.singleNumber(new int[]{1,3,1,3,6,7,6,7,8}),8);

    }
    @Test
    void singleNumberFirst() {
        assertEquals (singleNumberList.singleNumber(new int[]{4,3,1,3,6,7,6,7,1}),4);


    }
    @Test
    void singleNumberMiddle() {
        assertEquals (singleNumberList.singleNumber(new int[]{1,3,1,2,6,7,6,7,3}),2);

    }

}