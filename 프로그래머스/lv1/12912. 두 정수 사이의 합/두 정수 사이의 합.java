class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;
        
        if (a > b) {
            while (a>=b) {
                sum += b;
                b++;
                answer = sum;
            }
        } else if (a < b) {
            while (a<=b) {
                sum += a;
                a++;
                answer = sum;
            }
        } else {
            answer = a;
        }
        return answer;
    }
}