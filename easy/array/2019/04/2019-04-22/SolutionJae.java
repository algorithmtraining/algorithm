public class SolutionJae{
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        boolean isL = false;

        for (char c : s.toCharArray()) {
            if (c == 'A') {
                countA++;
                isL = false;
                if (countA == 2) {
                    return false;
                }
            }
            else if (c == 'L') {
                if (!isL) {
                    isL = true;
                    countL = 0;
                }
                countL++;
                if (countL == 3) {
                    return false;
                }
            }
            else if (c == 'P'){
                isL = false;
            }else{}
        }
        return true;
    }
}
