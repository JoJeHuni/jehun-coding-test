class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        long num = 10;
        int k = 0;
        long n2 = n;
        while (n>0) {
            n = n / 10;
            k++;
        }
        
        answer = new int[k];
        
        for(int i = 0; i<k; i++) {
            answer[i] = (int)(n2 % num);
            n2 = n2 / num;
        }
        return answer;
    }
}