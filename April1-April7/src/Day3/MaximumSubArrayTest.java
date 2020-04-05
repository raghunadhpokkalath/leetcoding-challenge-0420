package Day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArrayTest {

    MaximumSubArray_TwoArray twoArray = new MaximumSubArray_TwoArray();
    MaximumSubArray_SingleArray singleArray = new MaximumSubArray_SingleArray();

    @Test
    void maxSubArray() {

        assertEquals (twoArray.maxSubArray(new int[]{-5}),-5);
        assertEquals (twoArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}),6);
        assertEquals (twoArray.maxSubArray(new int[]{-1,0,-2}),0);
        assertEquals (twoArray.maxSubArray(new int[]{1,2,3}),6);

    }


    @Test
    void maxSubArray_Single() {

       // assertEquals (singleArray.maxSubArray(new int[]{-5}),-5);
      assertEquals (singleArray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}),6);
        assertEquals (singleArray.maxSubArray(new int[]{-2,1,4}),5);

         assertEquals (singleArray.maxSubArray(new int[]{-1,0,-2}),0);
        assertEquals (singleArray.maxSubArray(new int[]{1,2,3}),6);

    }

}