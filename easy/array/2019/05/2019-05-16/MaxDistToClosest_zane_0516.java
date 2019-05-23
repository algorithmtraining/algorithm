public class MaxDistToClosest_zane_0516 {


    public static void main(String[] args) {
        int[] seats = {1,0,0,0};
        MaxDistToClosest_zane_0516 maxDistToClosest = new MaxDistToClosest_zane_0516();
        System.out.println(maxDistToClosest.maxDistToClosest(seats));

    }

    /**
     * 849. 到最近的人的最大距离
     * @param seats
     * @return
     */
    public int maxDistToClosest(int[] seats) {
        int left=0;
        int right = 0;
        int len = 0;
        int maxlen = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                continue;
            }

            for (int l = i-1; l >= 0; l--) {
                if (seats[l] == 1) {
                    left = i - l;
                    break;
                }
            }



            for (int r = i+1; r < seats.length; r++) {
                if (seats[r] == 1) {
                    right = r - i;
                    break;
                }
            }

            if (left == 0 || right == 0) {
                len = Math.max(left, right);
            }else {
                len = Math.min(left, right);
            }
            maxlen = Math.max(maxlen, len);
            left =0;
            right = 0;
        }

        return maxlen;

    }
}
