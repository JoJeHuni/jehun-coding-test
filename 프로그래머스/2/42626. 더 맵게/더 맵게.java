import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int answer = 0;
        
        for (int i = 0; i < scoville.length; i++) {
            queue.offer(scoville[i]);
        }
        
        while (queue.element() < K) {
            if (queue.size() == 1) {
                return -1;
            } else {
                queue.add(queue.poll() + queue.poll() * 2);
                answer++;
            }
        }
        
        return answer;
    }
}