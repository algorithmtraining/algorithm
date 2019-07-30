package string;

/**
 * @author zane
 */
public class RepeatedStringMatch_zane_0719_NO686 {

    public static void main(String[] args) {
        String A = "abc";
        String B = "cabcabca";
        RepeatedStringMatch_zane_0719_NO686 repeatedStringMatch_zane_0719_no686 = new RepeatedStringMatch_zane_0719_NO686();
        int index = repeatedStringMatch_zane_0719_no686.repeatedStringMatch(A,B);
        System.out.println(index);

    }
    public int repeatedStringMatch(String A, String B) {
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < A.length(); i++) {
//            char tempchar = A.charAt(i);
//            if (map.get(tempchar) == null) {
//                map.put(tempchar, 1);
//            }
//        }
//
//        for (int i = 0; i < B.length(); i++) {
//            if (map.get(B.charAt(i)) == null) {
//                return -1;
//            }
//        }
        StringBuilder stringBuilder = new StringBuilder(A);
        for (int i = 1; stringBuilder.length() < 2*A.length()+ B.length(); i++) {
            if (stringBuilder.indexOf(B) != -1) {
                return i ;
            }else {
                stringBuilder.append(A);
            }
        }
        return -1;
    }

}
