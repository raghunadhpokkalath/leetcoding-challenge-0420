package Day3;

public class MaximumSubArray_SingleArray {

    public int maxSubArray(int[] a){

        int maxSum=a[0];
        int arraySum=a[0];

        for(int i=1;i<a.length;i++)
        {
            arraySum = (arraySum+a[i] > a[i])? (arraySum+a[i]):a[i];
            maxSum = (maxSum < arraySum)? arraySum:maxSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {

     System.out.println(new MaximumSubArray_SingleArray().maxSubArray(new int[]{-5}));
    }
}
