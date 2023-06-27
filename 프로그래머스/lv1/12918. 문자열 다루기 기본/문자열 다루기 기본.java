class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            // 반복문을 돌면서 각 문자가 숫자인지 확인하기 위해 Character.isDigit() 
            if (!Character.isDigit(str)) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}