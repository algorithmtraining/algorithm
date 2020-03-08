import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    // List<Set> list = new ArrayList<>();

    public int[][] findContinuousSequence(int target) {
        List<List> lists = new ArrayList<>();

        if (target < 3) {
            return null;
        }

        if (!isOdd(target))
            return null;

        for (int i = 1; i <= target / 2; i++) {
            for (int len = 2;; len++) {
                int sum = getSum(i, len);
                if (sum == target) {
                    lists.add(saveSequence(i, len));
                } else if (sum > target) {
                    break;
                }
            }
        }

        int[][] arrays = lists.stream() // Stream<List<Integer>>
                .map(list -> list.stream().mapToInt(i -> (int) i).toArray()) // Stream<int[]>
                .toArray(int[][]::new);

        return arrays;
    }

    public List saveSequence(int begin, int len) {
        List aList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            aList.add(begin + i);
        }

        return aList;
    }

    /**
     * 
     */
    public int getSum(int begin, int len) {
        int end = begin + len - 1;
        return ((begin + end) * len) / 2;
    }

    /**
     * @param odd
     * @param notOdd
     */
    public void getMid(int odd, int notOdd) {
        if (odd == 1) {
            return;
        }
        Set aSet = new HashSet<Integer>();
        int mid = odd / 2;
        aSet.add(odd);
        aSet.add(notOdd);
        list.add(0, aSet);
        // aSet.remove(mid+1);
        if (isOdd(mid)) {
            getMid(mid, mid + 1);
        } else {
            getMid(mid + 1, mid);

        }
    }

    /**
     * 判断是否是奇数
     */
    public boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}