import java.util.HashMap;
import java.util.Map;

public class CheckRecord_zane {

    public static void main(String[] args) {
        String s = "PPALLL";

        CheckRecord_zane checkRecord = new CheckRecord_zane();
        System.out.println(checkRecord.checkRecor1(s));
    }


    /**
     * NO.551
     * @param s
     * @return
     */
    public boolean checkRecor1(String s) {
        char[] chars = s.toCharArray();
        int countL = 0;
        int maxcount = 0;
        int countA = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'L') {
                countL++;
            } else {
                countL = 0;
            }
            if (chars[i] == 'A') {
                countA++;
            }
            maxcount = Math.max(countL, maxcount);
        }


        if (countA <= 1 && maxcount <= 2) {
            return true;
        } else {
            return false;
        }
    }

}
