class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0L;
        long change = price;

        for(int i=1; i<=count; i++) {
            money -= price * i;
        }

        if(money >= 0 ) {
            return answer;
        } else {
            return answer = money * -1;
        }
    }
}