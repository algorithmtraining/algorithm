package queue;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter_zane_NO933_NO0816 {

    private Queue<Integer> queue;
    public RecentCounter_zane_NO933_NO0816() {
        queue = new LinkedList();
    }


    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }

}
