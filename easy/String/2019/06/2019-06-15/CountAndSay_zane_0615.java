package String;

public class CountAndSay_zane_0615 {

    public static void main(String[] args) {
        CountAndSay_zane_0615 countAndSay_zane_0615 = new CountAndSay_zane_0615();
        String seed = countAndSay_zane_0615.countAndSay(1);
        System.out.println(seed);

    }

    /**
     * No.38
     * 循环生成第n个字符串
     *
     * 使用两个变量来记录每个数字的个数以及该数字是什么。
     *
     *用时2ms
     * @param n
     * @return
     */
    public String countAndSay(int n) {
        String  seed = "1";
        int seedLength = 0;
        char temp =seed.charAt(0);
        int num =1;
        StringBuilder aString = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            num = 1;
            seedLength = seed.length();
            temp = seed.charAt(0);
            for (int j = 1; j < seedLength; j++) {
                if (seed.charAt(j) != temp) {
                    aString.append(num);
                    aString.append(temp);
                    temp = seed.charAt(j);
                    num = 1;
                }else {
                    num++;
                }
            }
            aString.append(num);
            aString.append(temp);
            seed = aString.toString();
            aString.delete(0, aString.length());
        }
        return seed;
    }
}
