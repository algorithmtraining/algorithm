package String;

public class CountSegments_zane_0611 {

    public static void main(String[] args) {
        CountSegments_zane_0611 countSegments_zane_0611 = new CountSegments_zane_0611();
        String s = ", , , ,        a, eaefa";
        int a =countSegments_zane_0611.countSegments(s);
        System.out.println(a);

    }
    public int countSegments(String s) {
        int flag = 1;
        s=s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isSpaceChar(s.charAt(i))) {
                if (flag == 0) {
                    num++;
                    flag = 1;
                }
            }else {
                flag = 0;
            }
        }


        if(num == s.length()){
            return 0;
        }
        return num+1;
    }


}
