import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> bridge = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++){
            bridge.offer(0);
        }
        
        if(bridge_length == 1) return truck_weights.length + 1;
        if(truck_weights.length == 1) return bridge_length + 1;
        
        int index = 0;
        int curWeight = 0;
        
        while(index < truck_weights.length) {
            curWeight -= bridge.poll();
            answer++;
            
            if(curWeight + truck_weights[index] <= weight) {
                bridge.offer(truck_weights[index]);
                curWeight += truck_weights[index++];
            }
            else bridge.offer(0);
        }
        
        return answer + bridge_length;
    }
}