import java.util.EnumSet;

public class IsOneBitCharacter_zane {


    public static void main(String[] args) {
        int[] bits = {1, 0, 0};
        IsOneBitCharacter_zane isOneBitCharacter = new IsOneBitCharacter_zane();
        System.out.println(isOneBitCharacter.isOneBitCharacter(bits));
    }

    /**
     * NO.717 1比特和两比特字符
     * @param bits
     * @return
     */
    public boolean isOneBitCharacter(int[] bits) {
        if (bits[bits.length - 1] == 0) {
            int i = bits.length-2;
            int count = 0;
            while (i >= 0) {
                if (bits[i--] == 1) {
                    count++;
                }else {
                    break;
                }

            }
            if (count % 2 == 0) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }



}
