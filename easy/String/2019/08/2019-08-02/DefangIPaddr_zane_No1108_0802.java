package string;

/**
 * @program: zhaozhen197->DefangIPaddr_zane_No1108_0802
 * @description: IP地址无效化
 * @author: zhaozhen
 * @create: 2019-08-21 16:53
 **/
public class DefangIPaddr_zane_No1108_0802 {

    public static void main(String[] args) {
        DefangIPaddr_zane_No1108_0802 defangIPaddr_zane_no1108_0802 = new DefangIPaddr_zane_No1108_0802();
        String address = "1.1.1.1";

        System.out.println(defangIPaddr_zane_no1108_0802.defangIPaddr(address));

    }
    /**
     *
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        String[] strings = address.split("\\.");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
            if (i != strings.length - 1) {
                stringBuilder.append("[.]");
            }

        }
        return stringBuilder.toString();
    }

}
