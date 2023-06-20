class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long sqrt = (long)Math.sqrt(n);
        
        if (n == (long)(Math.pow(sqrt,2))) {
            answer = (long)(Math.pow(sqrt+1,2));
        } else {
            answer = -1;
        }
        
        return answer;
    }
}