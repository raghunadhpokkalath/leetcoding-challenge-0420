package Day4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MoveZeroUsingQueue {

       public int[] moveZeroes(int[] nums) {
           Queue<Integer> zeroIndexQueue=new LinkedList<Integer>();
           for(int numIndex=0;numIndex<nums.length;numIndex++){

               if(nums[numIndex]==0) {
                   zeroIndexQueue.add(numIndex);
               }
               else if(nums[numIndex]!=0 && !zeroIndexQueue.isEmpty()){
                   nums[zeroIndexQueue.remove()]=nums[numIndex];
                   nums[numIndex] =0;
                   numIndex=numIndex-1;
               }
           }

           return nums;
       }
}
