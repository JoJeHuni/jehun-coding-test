import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length - 1];
        List<Integer> arrList = new ArrayList<>();
        
        for (int num : arr) {
            arrList.add(num);
        }
        
        int[] sortArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortArray);
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sortArray[0]) {
                arrList.remove(i);
                break;
            }
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}