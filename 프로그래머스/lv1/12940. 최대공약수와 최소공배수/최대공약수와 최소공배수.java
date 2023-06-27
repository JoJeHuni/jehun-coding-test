class Solution {
    public int[] solution(int n, int m) {
        int maxnum = 0;
        int minnum = 0;
        if (n >= m) {
            maxnum = n;
            minnum = m;
        } else {
            maxnum = m;
            minnum = n;
        }
        
        int gcd = getGCD(minnum, maxnum);  // 최대공약수 계산
        // 최소공배수는 n * m 나누기 최대공약수
        int lcm = n * m / gcd;  // 최소공배수 계산
        
        int[] answer = {gcd, lcm};
        
        return answer;
    }
    
    // 최대공약수(GCD)를 구하는 메서드
    private int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
}