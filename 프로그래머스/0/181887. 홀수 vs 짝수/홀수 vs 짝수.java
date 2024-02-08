class Solution {
    public int solution(int[] num_list) {
        int sumEven = 0; // 짝수 번째 원소들의 합
        int sumOdd = 0; // 홀수 번째 원소들의 합
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                sumEven += num_list[i];
            } else {
                sumOdd += num_list[i];
            }
        }
        
        return Math.max(sumEven, sumOdd);
    }
}