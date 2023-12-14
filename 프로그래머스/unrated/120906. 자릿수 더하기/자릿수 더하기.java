class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 10;
        
        while (n > 0) {
            answer += n % num;
            n = n / num;
        }
        
        return answer;
    }
}