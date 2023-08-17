class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int count = isPrime(i);
            answer += (count > limit) ? power : count;
        }

        return answer;
    }

    public static int isPrime(int num) {
        int result = 0;

        for(int i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                // i로 나눠지면 약수의 개수 2개 추가
                result += 2;

                if(num / i == i) {
                    // ex) num = 4일 때 i = 2면 result +=2 에서 -1 해준다.
                    result -= 1;
                }
            }
        }

        return result;
    }
}