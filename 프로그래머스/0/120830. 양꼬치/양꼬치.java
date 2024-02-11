class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        answer += n * 12000;
        
        for (int j = 0; j <= n / 10; j++) {
            if (j != 0) k--;
        }
        
        answer += k * 2000;
        
        return answer;
    }
}