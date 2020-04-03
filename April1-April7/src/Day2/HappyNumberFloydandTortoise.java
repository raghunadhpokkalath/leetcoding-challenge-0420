package Day2;

public class HappyNumberFloydandTortoise {

    public boolean isHappy(int n) {

        int tor, ha;
        tor = ha = n;
        do {
            tor = getSquare(tor);
            ha = getSquare(ha);
            ha = getSquare(ha);
        }
        while (tor != ha);
        return (tor == 1) ? true : false;

    }

    private int getSquare(int num) {
        int sq = 0;
        while (num > 0) {

            sq = sq + ((num % 10) * (num % 10));
            num = num/10;
        }
        return sq;

    }


}
