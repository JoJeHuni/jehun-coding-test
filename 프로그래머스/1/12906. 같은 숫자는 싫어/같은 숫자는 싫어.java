import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            // i가 0일 때는 일단 추가해야하고
            // 1부터는 이제 앞에 있는 숫자랑만 비교하면 된다.
            if (i == 0 || arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}