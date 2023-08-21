class Solution {
    boolean solution(String s) {
        boolean answer = false;
        
        int open = 0;
        int close = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')') {
                close++;
            }
            
            if (open < close) {
                answer = false;
                return answer;
            }
        }
        if (open == close) {
            answer = true;
            return answer;
        }
        return answer;
    }
}