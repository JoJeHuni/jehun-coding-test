class Solution {
    public String solution(String s) {
        String answer = "";
        int i = 0;
        char j = s.charAt(s.length() / 2);
        String str = String.valueOf(j);
        
        if (s.length() % 2 == 0) {
            i = s.length() / 2;
            answer = s.substring(i-1,i+1);
        } else {
            answer = str;
        }
        
        return answer;
    }
}