class Solution {
    public int solution(long num) {
        int answer = 0;
        int i = 0;
        if (num == 1 ) {
            return answer;
        } else {
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                    i++;
                } else {
                    num = num * 3 + 1;
                    i++;
                }
            }
        }
        
        answer = i;
        
        if (i > 500) {
            answer = -1;
        }
        
        return answer;
    }
}