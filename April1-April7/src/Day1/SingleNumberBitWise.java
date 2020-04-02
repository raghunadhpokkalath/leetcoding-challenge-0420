package Day1;


//Runtime: 0 ms
//Memory Usage: 41 MB
public class SingleNumberBitWise {

    public int singleNumber(int[] nums) {
        int b = 0;
        for(int i :nums) {
            b^=i;
        }


        return b;
    }

    public static void main(String[] args) {
        System.out.println(4^1);
    }
}
