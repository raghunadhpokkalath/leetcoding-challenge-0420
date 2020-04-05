package Day3;

public class MaximumSubArray_TwoArray {

    public int maxSubArray(int[] a){

        int maxSum=a[0];
        int arraySum=0;
        for (int i=0;i<a.length;i++){
            arraySum =a[i] ;
            if(arraySum>maxSum)
            {
                maxSum=arraySum;
            }
            for(int j=i+1;j<a.length;j++){
                arraySum=a[j]+arraySum;
                if(arraySum>maxSum)
                {
                    maxSum=arraySum;
                }
            }


        }

        return maxSum;
    }

    public static void main(String[] args) {

     System.out.println(new MaximumSubArray_TwoArray().maxSubArray(new int[]{-5}));
    }
}
