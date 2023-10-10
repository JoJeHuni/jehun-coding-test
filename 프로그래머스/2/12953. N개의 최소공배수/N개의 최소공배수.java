class Solution {
    public int solution(int[] arr) {
        // 원소가 1개일 때를 생각에 미리 answer에 1번째 수를 초기화
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
                answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    // 최대공약수
    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    // 최소공배수
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}