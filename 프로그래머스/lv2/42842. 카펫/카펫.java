class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        // sum에서 가로, 세로는 3을 넘어야 하기 때문에 약수를 구해본다.
        for (int i = 3; i < sum; i++) {
            int j = sum / i;
            
            //알맞은 i, j를 구해서 j도 3보다 크거나 같으면 가로 세로를 정해준다.
            //max, min으로
            if (sum % i == 0 && j >= 3) {
                int col = Math.max(i, j);
                int row = Math.min(i, j);
                int center = (col - 2) * (row - 2);
                
                if (center == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        return answer;
    }
}