package Day2;

import java.util.ArrayList;
import java.util.List;

public class HappyNumberList {

    public boolean isHappy(int n) {
        int digit = 0;
        int result = 0;
        List<Integer> numList = new ArrayList<Integer>();
        while (n > 0) {
            digit = n % 10;
            numList.add(digit);
            n = n / 10;
        }
        for (int num : numList) {
            result += num * num;
        }
        if (result > 6)
            return isHappy(result);
        if(result==1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumberList().isHappy(22));
    }
}
