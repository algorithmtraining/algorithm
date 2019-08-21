package string;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: zhaozhen197->NumUniqueEmails_zane_No929_0801
 * @description: NO929独特的电子邮件地址
 * @author: zhaozhen
 * @create: 2019-08-21 16:25
 **/
public class NumUniqueEmails_zane_No929_0801 {

    public static void main(String[] args) {
        NumUniqueEmails_zane_No929_0801 numUniqueEmails_zane_no929_0801 = new NumUniqueEmails_zane_No929_0801();
        String[] emails = {
                "testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"
        };
        System.out.println(numUniqueEmails_zane_no929_0801.numUniqueEmails(emails));


    }

    public int numUniqueEmails(String[] emails) {
        Set<String> stringSet = new HashSet<>();

        StringBuilder stringBuilder = new StringBuilder();

        //在@符号之前的字符，如果遇到+将flag置为false。此时+号后面的字符就不进行复制。在遇到@时，为true，将@符号copy
        boolean flag = true;
//        在遇到@时，变为false,去除+和.的特殊作用
        boolean flag2 = true;
        //开启全部复制字符的功能
        boolean flag3 = false;

        for ( String s: emails ) {
            for (char c : s.toCharArray()) {
                if (c != '.' && flag2) {
                    if (c == '+') {
                        flag = false;
                    }

                    if (c == '@') {
                        flag = true;
                        flag2 = false;
                        flag3 = true;
                    }

                    if (flag) {
                        stringBuilder.append(c);
                    }
                }

                if (flag3) {
                    stringBuilder.append(c);
                }

            }
            stringSet.add(stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.length());
            flag = true;
            flag2 = true;
            flag3 = false;
        }

        return stringSet.size();
    }

}
