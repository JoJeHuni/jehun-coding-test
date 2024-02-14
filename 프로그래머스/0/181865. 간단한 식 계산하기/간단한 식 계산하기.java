class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] strArray = binomial.split(" ");
        
        if (strArray[1].equals("+"))
            answer = Integer.valueOf(strArray[0]) + Integer.valueOf(strArray[2]);
        else if (strArray[1].equals("-"))
            answer = Integer.valueOf(strArray[0]) - Integer.valueOf(strArray[2]);
        else if (strArray[1].equals("*"))
            answer = Integer.valueOf(strArray[0]) * Integer.valueOf(strArray[2]);
        
        return answer;
    }
}