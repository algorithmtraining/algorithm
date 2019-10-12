package queue;

import java.util.Arrays;

/**
 * @program: zhaozhen197->LeastInterval_zane_No621_0814
 * @description: cup执行任务最短队列
 * @author: zhaozhen
 * @create: 2019-09-16 10:36
 **/
public class LeastInterval_zane_No621_0814 {
    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
    }

    /**
     * 根据分析可知，最短的路径长度和最高频率出现的字符有关
     *
     * @param tasks
     * @param n
     * @return
     */
    public int leastInterval(char[] tasks, int n) {
        int[] tasksNum = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            tasksNum[tasks[i] - 'A']++;
        }
        Arrays.sort(tasksNum);
        // 频率最高的字符个数
        int maxTaskNum = tasksNum[tasksNum.length - 1];
        int i = tasksNum.length - 1;
//         最高频率的字符种类的个数
        int max_len = 0;
        while (i >= 0) {
            if (tasksNum[i--] == maxTaskNum) {
                max_len++;
            }
        }

        return Math.max((n + 1) * (maxTaskNum - 1) + max_len, tasks.length);

    }
}
