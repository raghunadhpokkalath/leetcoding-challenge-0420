package Day1;

import java.util.Stack;
//556 ms
//40.2 MB


public class SingleNumberStack {

    public int singleNumber(int[] nums) {
        Stack numStack = new Stack();
        for(int i :nums) {
            if(numStack.contains(i))
            {
                numStack.remove(numStack.indexOf(i));
            }
            else
            {
                numStack.push(i);
            }

        }

        return (int)numStack.get(0);
    }



    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        int result = new SingleNumberStack().singleNumber(new int[]{1,3,1,3,6,7,6,7,8});
        int result1 = new SingleNumberStack().singleNumber(new int[]{1,3,1,3,6,7,6,7,8});

        int result2 = new SingleNumberStack().singleNumber(new int[]{1,3,1,3,6,7,6,7,8});
        int result3 = new SingleNumberStack().singleNumber(new int[]{1,3,1,3,6,7,6,7,8});

        int result4 = new SingleNumberStack().singleNumber(new int[]{1,3,1,3,6,7,6,7,8});

        int result5 = new SingleNumberStack().singleNumber(new int[]{1,3,1,3,6,7,6,7,8});


        long timeTaken = System.currentTimeMillis() - startTime;

        System.out.println("Result " +result + "Time taken using Stack" + timeTaken);
    }

}
