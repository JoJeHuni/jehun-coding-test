import java.util.*;
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int plus = 0;
        int minus = 0;
        ArrayList<Integer> plusnum = new ArrayList<Integer>();
        ArrayList<Integer> minusnum = new ArrayList<Integer>();
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                plusnum.add(absolutes[i]);
            } else {
                minusnum.add(absolutes[i]);
            }
        }
        
        for (int j = 0; j < plusnum.size(); j++) {
            plus += Integer.valueOf(plusnum.get(j));
        }
        
        for (int k = 0; k < minusnum.size(); k++) {
            minus += Integer.valueOf(minusnum.get(k));
        }
        
        answer = plus - minus;
        
        return answer;
    }
}