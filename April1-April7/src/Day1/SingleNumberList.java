package Day1;

import java.util.ArrayList;
import java.util.List;
//603 ms
//Memory Usage: 40 MB

public class SingleNumberList {

    public int singleNumber(int[] nums) {
        List numList = new ArrayList();
        for(int i :nums) {
            if(numList.contains(i))
            {
                numList.remove((Integer)i);
            }
            else
            {
                numList.add(i);
            }

        }

        return (int)numList.get(0);
    }



    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        int result = new SingleNumberList().singleNumber(new int[]{1,3,1,3,6,7,6,7,8});

        long timeTaken = System.currentTimeMillis() - startTime;

        System.out.println("Result " +result + "Time taken using Stack" + timeTaken);
    }

}
