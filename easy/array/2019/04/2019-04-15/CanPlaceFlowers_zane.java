import sun.security.util.Length;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = {0,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers1(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int res = 0;

        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0) {
                count++;
            } else {
                res += (count - 1) / 2;
                count = 0;
            }
        }


        return res + count / 2 >= n;
    }


    public static boolean canPlaceFlowers1(int[] flowerbed, int n) {


        if (n == 0) {
            return true;
        }

        int can = 0;
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) {
                can++;
            }
        }
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] == 0) {
                if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    can++;
                    flowerbed[i] = 1;
                }
            }
        }

        if (flowerbed.length >= 3) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0 && flowerbed[2] == 1) {
                can++;
            }
            if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 3] == 1) {

                can++;
            }
        }

        if (can >= n) {
            return true;
        }
        return false;
    }

}






