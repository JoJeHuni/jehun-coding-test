class Solution {
    public int solution(String t, String p) {
        long tlen = t.length();
        long plen = p.length();
        int count = 0;
        
        for (int i = 0; i <= tlen - plen; i++) {
            String subStr = t.substring(i, i + (int)(plen));
            if (Long.parseLong(subStr) <= Long.parseLong(p)) {
                count++;
            }
        }
        
        int answer = count;
        return answer;
    }
}