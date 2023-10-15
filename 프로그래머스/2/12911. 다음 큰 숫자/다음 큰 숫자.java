class Solution {
    public int solution(int n) {
        int answer = 0;
        // n을 이진수로 변환
        String nString = Integer.toBinaryString(n);
        // str의 1 개수 세기
        int cnt = 0;
        for (int i = 0; i < nString.length(); i++) {
            if (nString.charAt(i) == '1') cnt++;
        }
        
        for(int i = n+1; i < 1000000; i++){
            String temp = Integer.toBinaryString(i);
            int temp_cnt = 0;
            
            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j) == '1') temp_cnt++;
            }
            
            if(temp_cnt == cnt) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}