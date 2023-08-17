class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char firstStr = s.charAt(0);
        int firstNum = 0;
		int diff = 0;
		int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
			if (firstNum == diff) {
				result++;
				firstStr = s.charAt(i);
			}
			if (s.charAt(i) == firstStr) firstNum++;
			else diff++;
		}
		return result;
    }
}