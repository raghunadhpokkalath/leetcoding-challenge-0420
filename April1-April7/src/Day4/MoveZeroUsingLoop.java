package Day4;

import java.util.LinkedList;
import java.util.Queue;

public class MoveZeroUsingLoop {

       public int[] moveZeroes(int[] nums) {
           int nonZeroCounter = 0;
           for (int numIndex = 0; numIndex < nums.length; numIndex++) {

               if (nums[numIndex] != 0) {
                   nums[nonZeroCounter] = nums[numIndex];
                   nonZeroCounter++;
               }

           }

           for(int j=nonZeroCounter;j<nums.length;j++){
               nums[j] = 0;
           }


           return nums;
       }
}
