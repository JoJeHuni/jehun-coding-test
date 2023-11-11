import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d); // 부서별 신청 금액을 오름차순으로 정렬
        int count = 0;
        int answer = 0;
        for (int i = 0; i < d.length; i++) {
            if (budget >= d[i]) { // 예산이 신청 금액보다 크거나 같으면
                budget -= d[i]; // 해당 부서의 신청 금액을 지원
                count++; // 지원한 부서의 개수 증가
            } else {
                break; // 예산이 부족하면 더 이상 지원할 수 없으므로 반복문 종료
            }
        }
        
        answer = count;
        
        return answer;
    }
}