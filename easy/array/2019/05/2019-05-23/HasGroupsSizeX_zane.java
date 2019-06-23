import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasGroupsSizeX_zane {
    public static void main(String[] args) {
        int[] deck = {1, 1, 1, 2, 2, 2, 3, 3};
        HasGroupsSizeX_zane hasGroupsSizeX = new HasGroupsSizeX_zane();
        System.out.println(hasGroupsSizeX.maxNumber(6, 3));
        System.out.println(hasGroupsSizeX.hasGroupsSizeX(deck));

    }

    /**
     * 914. 卡牌分组
     *
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {

        int temp = 1;
        Map<Integer, Integer> aMap = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            if (aMap.containsKey(deck[i])) {
                temp = aMap.get(deck[i]);
                temp++;

            }
            aMap.put(deck[i], temp);
            temp = 1;
        }


        int min = aMap.get(deck[0]);
        for (Integer aInt : aMap.values()) {
            min = Math.min(min, aInt);
        }
        for (Integer bInt : aMap.values()) {
            if (maxNumber(min, bInt) <= 1) {
                return false;
            }
        }
        return true;
    }

    /**
     * 求最大公约数
     *
     * @param m
     * @param n
     * @return
     */
    int maxNumber(int m, int n) {
        int temp;
        if (n > m) {
            temp = n;
            n = m;
            m = temp;
        }
        if (m % n == 0) {
            return n;
        }
        return maxNumber(n, m % n);
    }


}
