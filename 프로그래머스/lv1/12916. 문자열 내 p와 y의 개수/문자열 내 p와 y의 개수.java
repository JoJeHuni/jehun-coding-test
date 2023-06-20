class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int Y = 0;
        int P = 0;
        String[] str = s.split("");
        for (int i = 0; i<str.length; i++) {
            if (str[i].equals("Y") || str[i].equals("y"))
                Y++;
            if (str[i].equals("P") || str[i].equals("p"))
                P++;
        }
        if (Y == P) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}