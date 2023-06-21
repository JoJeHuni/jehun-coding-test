import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        long a = 10;
        int i = 0;
        long num = n; //n이 몇 자리수인지 알기 위해 num 초기화
        if (num > 0) {
            while (num > 0) {
                num = n / a;
                a = a * 10;
                i++;
            }
        } else {
            return answer;
        }
        
        // n의 자릿수 확인했으니 b배열에 넣어주기
        a = 10;
        String[] b = new String[i];
        i = 0;
        
        while (n > 0) {
            b[i] = String.valueOf(n % a); //String.valueOf로 n%a 값을 String 으로 바꿔서 배열에 넣어준다.
            n = (long)(n / a);
            i++;
        }
        
        // sort
        for (int j = 0; j < b.length; j++) {
            for (int k = b.length-1; k > 0; k--) {
                if (Integer.parseInt(b[k]) > Integer.parseInt(b[k-1])) {
                    String tmp = b[k];
                    b[k] = b[k-1];
                    b[k-1] = tmp;
                }
            }
        }
        
        String str = String.join("",b);
        answer = Long.parseLong(str);
        
        return answer;
    }
}