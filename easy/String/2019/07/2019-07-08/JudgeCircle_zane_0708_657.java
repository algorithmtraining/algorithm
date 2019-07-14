package string;

import java.net.URL;

public class JudgeCircle_zane_0708_657 {
    /**
     * NO657
     * 解题思路：
     * 如果R的个数等于L个数D的个数和U的个数相同。则必然能够回到终点
     *
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
        int ups = 0;
        int downs = 0;
        int lefts = 0;
        int rights = 0;

        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U': {
                    ups++;
                    break;

                }
                case 'L':
                    lefts++;
                    break;
                case 'R':
                    rights++;
                    break;
                case 'D':
                    downs++;
                    break;
            }

        }

        if (ups == downs && lefts == rights) {
            return true;
        }

        return false;
    }
}
