class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        
        
        for (int i = 0; i < phone_number.length() - 4; i++) {
            str.append("*");
        }
        
        str.append(phone_number.substring(phone_number.length() - 4));
        
        answer = str.toString();
        
        return answer;
    }
}