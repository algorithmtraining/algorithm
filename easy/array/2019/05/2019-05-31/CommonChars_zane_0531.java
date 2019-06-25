import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChars_zane_0531 {

    public static void main(String[] args) {
        String[] A = {
                "bella", "label", "roller"
        };
        CommonChars_zane_0531 commonChars_zane_0531 = new CommonChars_zane_0531();
        List<String> stringList = commonChars_zane_0531.commonChars1(A);
        System.out.println(stringList);
    }

    public List<String> commonChars(String[] A) {

        String astr = A[0];
        List<String> stringArrayList= new ArrayList<>();
        char[] chars = astr.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 1; j < A.length; j++) {
                if (!A[j].contains(String.valueOf(chars[i]))) {
                    break;
                }
                if (j == A.length - 1) {
                    if (!stringArrayList.contains(String.valueOf(chars[i]))) {
                        stringArrayList.add(String.valueOf(chars[i]));
                    }
                }
            }
        }
        return stringArrayList;

    }

    public List<String> commonChars1(String[] A) {

        List<String> ans = new ArrayList<>();
        int[][] anx = new int[A.length][26];


        for (int i = 0;i < A.length;i++) {
            map(A[i],anx[i]);
        }

        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < A.length; j++) {
                if (min > anx[j][i]) {
                    min = anx[j][i];
                }
            }

            while (min-- > 0) {
                ans.add(String.valueOf((char)('a' + i)));
            }

        }


         return ans;

    }

    private void map(String s, int[] anx) {
        for (int i = 0; i < s.length(); i++) {
            anx[s.charAt(i) - 'a']++;
        }
    }


}
