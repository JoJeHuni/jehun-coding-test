import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int a = numbers[i]+numbers[j];
                //indexOf로 같은 값이 존재하지 않으면 -1이니까 사용
                if (list.indexOf(a) == -1){
                	list.add(a);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        // 오름차순 ArrayList의 sort 사용
        Arrays.sort(answer);

        return answer;
    }
}