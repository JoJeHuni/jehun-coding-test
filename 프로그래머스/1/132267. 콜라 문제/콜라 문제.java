class Solution {
    public int solution(int a, int b, int n) {
        // 줘야 하는 병 수 a, 빈 병 a 개를 주면 돌려받는 콜라 b, 가지고 있는 빈 병의 수 n
        int answer = 0;
        
        while (true) {
            // 가지고 있는 병수 < 줘야 하는 병 수일 때 break
            if(n < a) break;
            
            answer += (n / a) * b;
            int remain = n % a;
            
            n = (n / a) * b + remain;
        }
        
        return answer;
    }
}