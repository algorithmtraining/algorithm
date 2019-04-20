/**
 * NO.66 加一
 * @author MYHE
 * @date 2019/4/20
 * 思想：对于都是9的单独拿出来处理，否则采用递归进行迭代
 */
public class PlusOneMYHE {
    class Solution {
        public int[] plusOne(int[] digits) {
            boolean isAllNumberNine = true;
            for(int i=0 ; i< digits.length; i++ ){
                if(digits[i] != 9){
                    isAllNumberNine = false;
                    break;
                }
            }
            if(isAllNumberNine){
                int[] result = new int[digits.length+1];
                result[0] = 1;
                for(int i=1;i<digits.length+1; i++){
                    result[i] = 0;
                }
                return result;
            }
            return elemPlusOne(digits, digits.length-1);
        }

        public int[] elemPlusOne(int[] digits, int index) {
                if(digits[index]+1 == 10){
                    digits[index] = 0;
                    return elemPlusOne(digits, index-1);
                }else{
                    digits[index] += 1;
                    return digits;
                }
        }
    }

    public static void main(String[] args){
        PlusOneMYHE po = new PlusOneMYHE();
        Solution solution = po.new Solution();
        int[] digits = {9,9,9};
        int[] res = solution.plusOne(digits);
        System.out.println(res);
    }
}
